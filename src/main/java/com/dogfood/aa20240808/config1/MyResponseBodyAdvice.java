//package com.dogfood.aa20240808.config1;
//
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//@ControllerAdvice
//public class MyResponseBodyAdvice implements ResponseBodyAdvice<Object> {
//
//    /**
//     * 判断支持的类型
//     *
//     * @param returnType
//     * @param converterType
//     */
//    @Override
//    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
//        return true;
//    }
//
//    /**
//     * 对于结果进行加密
//     *
//     * @param body
//     * @param returnType
//     * @param selectedContentType
//     * @param selectedConverterType
//     * @param request
//     * @param response
//     */
//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
//                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
//                                  ServerHttpResponse response) {
//        if (request.getURI().getPath().startsWith("/api") || request.getURI().getPath().startsWith("/rest")) {
//            return XRsaUtil.setRsaPublicKey(body);
//        }
//        return body;
//    }
//}