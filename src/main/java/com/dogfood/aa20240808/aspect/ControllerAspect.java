package com.dogfood.aa20240808.aspect;

import com.netease.lowcode.annotation.exception.LCAPAnnotationLogicHandlerException;
import com.netease.lowcode.annotation.handler.LCAPAnnotationHandlerAdvise;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;

@Component
@Order
@Aspect
public class ControllerAspect {

    private static final Logger log = LoggerFactory.getLogger(ControllerAspect.class);

    @Resource
    private AnnotationManager annotationManager;

    @Pointcut(value = "@annotation(com.dogfood.aa20240808.aspect.LogicAspect)")
    public void pointcut() {
    }

    /**
     * @throws LCAPAnnotationLogicHandlerException may be thrown by annotationManager.processLogicHandlerHandle method
     * @throws Throwable may be thrown by joinPoint.proceed method
     */
    @Around(value = "pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Object result;

        // 前置处理
        try {
            annotationManager.processLogicHandlerHandle(method.getName(), args, null,
                    LCAPAnnotationHandlerAdvise.BEFORE);
        } catch (LCAPAnnotationLogicHandlerException e) {
            throw e;
        } catch (Throwable t) {
            log.warn("执行逻辑切面失败 method={}", method.getName(), t);
            throw new LCAPAnnotationLogicHandlerException("依赖库逻辑切面执行失败，请联系技术支持");
        }

        // 切点
        result = joinPoint.proceed();

        // 后置处理
        try {
            annotationManager.processLogicHandlerHandle(method.getName(), args, result,
                    LCAPAnnotationHandlerAdvise.AFTER);
        } catch (LCAPAnnotationLogicHandlerException e) {
            throw e;
        } catch (Throwable t) {
            log.warn("执行逻辑切面失败 method={}", method.getName(), t);
            throw new LCAPAnnotationLogicHandlerException("依赖库逻辑切面执行失败，请联系技术支持");
        }

        return result;
    }
}
