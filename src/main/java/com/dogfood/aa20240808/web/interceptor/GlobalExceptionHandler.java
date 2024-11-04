package com.dogfood.aa20240808.web.interceptor;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.mybatis.spring.MyBatisSystemException;

import com.dogfood.aa20240808.config.LcpProperties;
import com.dogfood.aa20240808.domain.enumeration.ErrorCodeEnum;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.util.TraceIdHolder;
import com.dogfood.aa20240808.web.ApiReturn;
import com.netease.lowcode.annotation.exception.LCAPAnnotationHandlerException;
import com.netease.lowcode.annotation.exception.LCAPAnnotationSQLHandlerException;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Optional;
import java.util.Set;

/**
 * 全局异常处理
 *
 * @author gaowx
 * @date 2021-07-26 22:51
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @Resource
    private MessageSource messageSource;
    @Resource
    private LcpProperties lcpProperties;
    /**
     *
     * @param ex
     * @return
     */
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public ApiReturn handleValidationException(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> errors = ex.getConstraintViolations();
        StringBuilder strBuilder = new StringBuilder();
        for (ConstraintViolation<?> violation : errors) {
            strBuilder.append(violation.getMessage() + "\n");
        }

        LOGGER.error("无效的请求", ex);
        return ApiReturn.of("", HttpStatus.BAD_REQUEST.value(), strBuilder.toString());
    }

    /**
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(HttpCodeException.class)
    @ResponseBody
    public ResponseEntity<ApiReturn> handleException(HttpCodeException ex) {
        String errorKey = StringUtils.isEmpty(ex.getErrorKey()) ? ErrorCodeEnum.UNKNOWN.code : ex.getErrorKey();
        String message = messageSource.getMessage(errorKey, ex.getArgs(), errorKey, LocaleContextHolder.getLocale());
        ex.setMessage(message);
        LOGGER.error("执行错误", ex);
        return ResponseEntity
                .status(ex.getHttpCode())
                .body(ApiReturn.of("", ex.getHttpCode(), message, ""));
    }

    /**
     *
     * @param ex
     * @return
     */
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseBody
    public ApiReturn handleIndexOutOfBoundsException(IndexOutOfBoundsException ex) {
        LOGGER.error("执行错误", ex);
        return ApiReturn.of("", HttpStatus.INTERNAL_SERVER_ERROR.value(), messageSource.getMessage(ErrorCodeEnum.INDEX_OUT_OF_BOUNDS.code,
                null, ErrorCodeEnum.INDEX_OUT_OF_BOUNDS.code, LocaleContextHolder.getLocale()), "");
    }

    /**
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(MyBatisSystemException.class)
    @ResponseBody
    public ResponseEntity<ApiReturn> handleMybatisSystemException(MyBatisSystemException ex) {
        Optional<LCAPAnnotationSQLHandlerException> annotationSQLHandlerEx = Optional.ofNullable(ex)
                .map(Throwable::getCause).map(Throwable::getCause).map(Throwable::getCause)
                .filter(e -> e instanceof LCAPAnnotationSQLHandlerException)
                .map(e -> (LCAPAnnotationSQLHandlerException) e);
        if (annotationSQLHandlerEx.isPresent()) {
            return this.handleLCAPAnnotationHandlerException(annotationSQLHandlerEx.get());
        }

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(this.handleException(ex));
    }

    /**
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(LCAPAnnotationHandlerException.class)
    @ResponseBody
    public ResponseEntity<ApiReturn> handleLCAPAnnotationHandlerException(LCAPAnnotationHandlerException ex) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ApiReturn.of("", HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(), ""));
    }

    /**
     *
     * @param ex
     * @return
     */
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiReturn handleException(Exception ex) {
        LOGGER.error("执行错误", ex);
        return ApiReturn.of("", HttpStatus.INTERNAL_SERVER_ERROR.value(), messageSource.getMessage(ErrorCodeEnum.UNKNOWN.code,
                null, ErrorCodeEnum.UNKNOWN.code, LocaleContextHolder.getLocale()), "");
    }
}
