package com.dogfood.aa20240808.web.controller;

import com.dogfood.aa20240808.aspect.AnnotationManager;
import com.netease.lowcode.annotation.context.EntityContext;
import com.netease.lowcode.annotation.context.LogicContext;
import com.netease.lowcode.annotation.handler.LCAPLogicAnnotationHandler;
import com.netease.lowcode.annotation.handler.LCAPSQLAnnotationHandler;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * auto generate LCAPAnnotationController
 *
 * @author sys
 */
@RestController
@RequestMapping("api/system/annotation")
public class LCAPAnnotationController {
    @Resource
    private AnnotationManager annotationManager;

    @GetMapping("/logic")
    public List<Object>  annotationLogicConfig(String annotationKey) {
        List<LCAPLogicAnnotationHandler> list = annotationManager.getLcapLogicAnnotationHandlers();
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        List<Object> annotationMapList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            LCAPLogicAnnotationHandler lcapAnnotationHandler = list.get(i);
            Object value = lcapAnnotationHandler.annotationConfig(annotationKey);
            if(Objects.nonNull(value)){
                annotationMapList.add(value);
            }
        }
        return annotationMapList;
    }

    @GetMapping("/logicAll")
    public List<Map<String, Object>> annotationAllLogicConfig() {
        List<LCAPLogicAnnotationHandler> list = annotationManager.getLcapLogicAnnotationHandlers();
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        List<Map<String, Object>> annotationMapList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            LCAPLogicAnnotationHandler lcapAnnotationHandler = list.get(i);
            List<LogicContext> logicContextList = annotationManager.getLogicContextList(lcapAnnotationHandler.consume().getSimpleName());
            if (!CollectionUtils.isEmpty(logicContextList)) {
                Map<String, Object> annotationMap = new HashMap<>();
                annotationMap.put("annotationName",lcapAnnotationHandler.consume().getSimpleName());
                Map<String, Object> annotationLogicMap = new HashMap<>();
                annotationMap.put("logicList",annotationLogicMap);
                logicContextList.forEach(logic -> annotationLogicMap.put(logic.getLogicName(), lcapAnnotationHandler.annotationConfig(logic.getLogicName())));
                annotationMapList.add(annotationMap);
            }
        }
        return annotationMapList;
    }

    @GetMapping("/entity")
    public List<Object> annotationEntityConfig(String annotationKey) {
        List<LCAPSQLAnnotationHandler> list = annotationManager.getLcapSqlAnnotationHandlers();
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        List<Object> annotationMapList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            LCAPSQLAnnotationHandler lcapAnnotationHandler = list.get(i);
            Object value = lcapAnnotationHandler.annotationConfig(annotationKey);
            if(Objects.nonNull(value)){
                annotationMapList.add(value);
            }
        }
        return annotationMapList;
    }

    @GetMapping("/entityAll")
    public List<Map<String, Object>> annotationAllEntityConfig() {
        List<LCAPSQLAnnotationHandler> list = annotationManager.getLcapSqlAnnotationHandlers();
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        List<Map<String, Object>> annotationMapList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            LCAPSQLAnnotationHandler lcapAnnotationHandler = list.get(i);
            List<EntityContext> entityContextList = annotationManager.getEntityContextList(lcapAnnotationHandler.consume().getSimpleName());
            if (!CollectionUtils.isEmpty(entityContextList)) {
                Map<String, Object> annotationMap = new HashMap<>();
                annotationMap.put("annotationName",lcapAnnotationHandler.consume().getSimpleName());
                Map<String, Object> annotationEntityMap = new HashMap<>();
                annotationMap.put("entityList",annotationEntityMap);
                entityContextList.forEach(entity -> annotationEntityMap.put(entity.getEntityName(), lcapAnnotationHandler.annotationConfig(entity.getEntityName())));
                annotationMapList.add(annotationMap);
            }
        }
        return annotationMapList;
    }

}