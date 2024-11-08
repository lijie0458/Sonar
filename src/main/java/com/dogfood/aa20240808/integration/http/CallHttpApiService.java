package com.dogfood.aa20240808.integration.http;

import com.dogfood.aa20240808.config.JacksonConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.dogfood.aa20240808.util.ExtendMappingJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import com.netease.cloud.RemoteCallApi;
import org.springframework.util.CollectionUtils;
import com.netease.cloud.RemoteCallRequest;
import com.netease.cloud.RemoteCallResponse;
import com.netease.cloud.RemoteCallApiClient;
import com.dogfood.aa20240808.util.XmlMessageConverter;
import javax.annotation.PostConstruct;
import javax.net.ssl.SSLContext;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

/**
 * http接口调用
 */
@RemoteCallApiClient
public class CallHttpApiService implements RemoteCallApi{

    private static final Logger log = LoggerFactory.getLogger(CallHttpSSEApiService.class);

    private RestTemplate restTemplate;

    private RestTemplate ignoreSslRestTemplate;

    @Autowired
    private Environment environment;

    @PostConstruct
    public void init() {
        restTemplate = buildRestTemplate(true);
        ignoreSslRestTemplate = buildRestTemplate(false);
    }

    @Override
    public <T, R> RemoteCallResponse<R> call(RemoteCallRequest<T, R> request) {
        if (!(request instanceof HttpCallRequest)) {
            throw new RuntimeException(request.getClass().toString() + " cant cast to HttpCallRequest");
        }
        //构建httpEntity
        HttpCallRequest<T, R> httpCallRequest = (HttpCallRequest<T, R>) request;
        try {
            ResponseEntity<R> responseEntity;
            if (!CollectionUtils.isEmpty(httpCallRequest.getQueryString())) {
                UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(httpCallRequest.getUrl());
                for (Map.Entry<String, Object> entry : httpCallRequest.getQueryString().entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (key == null || value == null) {
                            continue;
                        }
                        uriBuilder.queryParam(key, value);
                    }
                }
                httpCallRequest.setUrl(uriBuilder.toUriString());
            }
            RestTemplate finalRestTemplate = getFinalRestTemplate(httpCallRequest.getOpenSsl());
            if (null == httpCallRequest.getReturnClazz()) {
                responseEntity = finalRestTemplate.exchange(
                        new URI(httpCallRequest.getUrl()),
                        httpCallRequest.getRequestMethod(),
                        httpCallRequest.buildHttpEntity(),
                        httpCallRequest.getCollectionReturnClazz()
                );
            } else {
                responseEntity = finalRestTemplate.exchange(
                        new URI(httpCallRequest.getUrl()),
                        httpCallRequest.getRequestMethod(),
                        httpCallRequest.buildHttpEntity(),
                        httpCallRequest.getReturnClazz()
                );
            }
            return new HttpCallResponse<>(responseEntity.getBody());
        } catch (RestClientResponseException e) {
            throw new RuntimeException(e.getResponseBodyAsString(), e);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @Override
    public String protocolType() {
        return "HTTP";
    }

    /**
     * 获取调用使用的 RestTemplate, 主要是为了区分是否开启ssl证书认证
     *
     * @param openSsl 是否开启ssl证书认证， true: 开启，false: 忽略
     * @return RestTemplate
     */
    private RestTemplate getFinalRestTemplate(Boolean openSsl) {
        if (BooleanUtils.isFalse(openSsl)) {
            return ignoreSslRestTemplate;
        } else {
            return restTemplate;
        }
    }

    /**
     * 构建 RestTemplate
     *
     * @param openSsl 是否开启ssl证书认证， true: 开启，false: 忽略
     * @return RestTemplate
     */
    private RestTemplate buildRestTemplate(Boolean openSsl) {
        CloseableHttpClient httpClient = null;
        if (BooleanUtils.isFalse(openSsl)) {
            try {
                SSLContext sslContext = SSLContexts.custom().loadTrustMaterial((chain, authType) -> true).build();
                SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
                httpClient = HttpClients.custom().setSSLSocketFactory(socketFactory).build();
            } catch (Exception e) {
                log.error("ssl context init failed", e);
            }
        }

        HttpComponentsClientRestfulHttpRequestFactory httpRequestFactory;
        if (httpClient != null) {
            // 忽略ssl证书认证
            httpRequestFactory = new HttpComponentsClientRestfulHttpRequestFactory(httpClient);
        } else {
            httpRequestFactory = new HttpComponentsClientRestfulHttpRequestFactory();
        }

        // 获取超时时间，默认 30s
        int timeOut = HttpApiUtil.getTimeout(environment.getProperty("http_request_timeout"), environment.getProperty("custom.http_request_timeout"));
        httpRequestFactory.setConnectionRequestTimeout(timeOut);
        httpRequestFactory.setConnectTimeout(timeOut);
        httpRequestFactory.setReadTimeout(timeOut);
        RestTemplate restTemplate = new RestTemplate(httpRequestFactory);
        // delete restTemplate`s xml converter,use custom xml convert
        restTemplate.getMessageConverters().removeIf(converter -> (Objects.equals(MappingJackson2XmlHttpMessageConverter.class, converter.getClass())));
        restTemplate.getMessageConverters().add(new XmlMessageConverter<>());

        restTemplate.getMessageConverters().add(new ExtendMappingJackson2HttpMessageConverter());
        //需要替换ObjectMapper, 否则日期处理会有问题
        ObjectMapper objectMapper = new ObjectMapper();
        // 忽略对象中不存在的字段
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule
                .addSerializer(LocalDate.class, new JacksonConfiguration.LcpLocalDateSerializer())
                .addDeserializer(LocalDate.class, new JacksonConfiguration.LcpLocalDateDeserializer())
                .addSerializer(LocalTime.class, new JacksonConfiguration.LcpLocalTimeSerializer())
                .addDeserializer(LocalTime.class, new JacksonConfiguration.LcpLocalTimeDeserializer())
                .addSerializer(ZonedDateTime.class, new JacksonConfiguration.LcpZonedDateTimeSerializer())
                .addDeserializer(ZonedDateTime.class, new JacksonConfiguration.LcpZonedDateTimeDeserializer());
        objectMapper.registerModule(javaTimeModule);

        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        for (HttpMessageConverter<?> messageConverter : messageConverters) {
            if (messageConverter instanceof MappingJackson2HttpMessageConverter) {
                ((MappingJackson2HttpMessageConverter) messageConverter).setObjectMapper(objectMapper);
            } else if (messageConverter instanceof StringHttpMessageConverter) {
                // 处理body纯字符串时乱码问题
                ((StringHttpMessageConverter) messageConverter).setDefaultCharset(StandardCharsets.UTF_8);
            }
        }
        return restTemplate;
    }
}
