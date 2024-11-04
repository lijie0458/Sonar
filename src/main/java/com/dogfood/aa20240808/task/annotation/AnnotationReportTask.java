package com.dogfood.aa20240808.task.annotation;

import com.dogfood.aa20240808.aspect.AnnotationManager;
import com.netease.lowcode.annotation.exception.LCAPAnnotationLogicHandlerException;
import com.netease.lowcode.annotation.exception.LCAPAnnotationSQLHandlerException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 应用启动时权限数据上报任务类
 *
 * @author sys
 * @since 3.9
 */
@Component
public class AnnotationReportTask implements ApplicationRunner {
    @Resource
    private AnnotationManager annotationManager;

    @Override
    public void run(ApplicationArguments args) throws LCAPAnnotationSQLHandlerException, LCAPAnnotationLogicHandlerException {
        annotationManager.processAnnotationContextReport();
    }

}
