//package com.dogfood.aa20240808.config1;
//
//import org.apache.commons.io.IOUtils;
//import org.springframework.core.MethodParameter;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpInputMessage;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.lang.reflect.Type;
//
//@ControllerAdvice
//public class RsaDecodeRequestBodyAdvice implements RequestBodyAdvice {
//
//    @Override
//    public boolean supports(MethodParameter methodParameter, Type targetType,
//                            Class<? extends HttpMessageConverter<?>> converterType) {
//        return true;
//    }
//
//    @Override
//    public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter methodParameter, Type targetType,
//                                           Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
//        try {
//            return new ResquestInputMessage(inputMessage);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return inputMessage;
//        }
//    }
//
//    @Override
//    public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
//                                Class<? extends HttpMessageConverter<?>> converterType) {
//        return body;
//    }
//
//    @Override
//    public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter,
//                                  Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
//        return body;
//    }
//
//    class ResquestInputMessage implements HttpInputMessage {
//        private HttpHeaders headers;
//        private InputStream body;
//
//        public ResquestInputMessage(HttpInputMessage inputMessage) throws Exception {
//            this.headers = inputMessage.getHeaders();
//            String content = IOUtils.toString(inputMessage.getBody(), "utf-8");
//            this.body = IOUtils.toInputStream(XRsaUtil.getData(content));
//        }
//
//        @Override
//        public InputStream getBody() throws IOException {
//            return body;
//        }
//
//        @Override
//        public HttpHeaders getHeaders() {
//            return headers;
//        }
//    }
//
//}