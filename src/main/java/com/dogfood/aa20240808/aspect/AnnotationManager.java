package com.dogfood.aa20240808.aspect;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.netease.lowcode.annotation.LCAPAnnotation;
import com.netease.lowcode.annotation.LCAPSQLAnnotation;
import com.netease.lowcode.annotation.LCAPLogicAnnotation;
import com.netease.lowcode.annotation.context.EntityContext;
import com.netease.lowcode.annotation.context.LogicContext;
import com.netease.lowcode.annotation.exception.LCAPAnnotationLogicHandlerException;
import com.netease.lowcode.annotation.exception.LCAPAnnotationSQLHandlerException;
import com.netease.lowcode.annotation.handler.LCAPAnnotationHandlerAdvise;
import com.netease.lowcode.annotation.handler.LCAPAnnotationHandler;
import com.netease.lowcode.annotation.handler.LCAPLogicAnnotationHandler;
import com.netease.lowcode.annotation.handler.LCAPSQLAnnotationHandler;
import com.netease.lowcode.annotation.helper.provider.OverriddenFrameworkHelper;
import com.netease.lowcode.annotation.helper.provider.TargetBeanLoader;
import com.netease.lowcode.annotation.javabean.BuildAssignmentArgs;
import com.netease.lowcode.annotation.javabean.BuildSelectExprArgs;
import com.netease.lowcode.annotation.javabean.BuildWhereConditionArgs;
import com.netease.lowcode.annotation.javabean.IsFilterableArgs;
import org.apache.commons.compress.utils.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 注解管理
 */
@Component
public class AnnotationManager implements InitializingBean, ApplicationContextAware {

    Logger log = LoggerFactory.getLogger(AnnotationManager.class);

    private ObjectMapper objectMapper = new ObjectMapper();

    @Resource
    private OverriddenLogicManager overriddenLogicManager;

    Map<String, List<EntityContext>> entityContextMap = new ConcurrentHashMap<>();

    Map<String, List<LogicContext>> logicContextMap = new ConcurrentHashMap<>();

    private List<LCAPAnnotationHandler> lcapAspectHandlers = new ArrayList<>();

    private List<LCAPSQLAnnotationHandler> lcapSqlAnnotationHandlers = new ArrayList<>();

    private List<LCAPLogicAnnotationHandler> lcapLogicAnnotationHandlers = new ArrayList<>();

    public List<LCAPSQLAnnotationHandler> getLcapSqlAnnotationHandlers() {
        return lcapSqlAnnotationHandlers;
    }

    public List<LCAPLogicAnnotationHandler> getLcapLogicAnnotationHandlers() {
        return lcapLogicAnnotationHandlers;
    }

    private void loadHandlerFromSpi() {
        ServiceLoader.load(LCAPAnnotationHandler.class).forEach(handler -> {
            lcapAspectHandlers.add(handler);
            log.info("[{}]SPI annotation handle loaded success!", handler.consume().getSimpleName());
        });
    }

    public List<LogicContext> getLogicContextList(String annotatedName) {
        return logicContextMap.get(annotatedName);
    }

    public List<EntityContext> getEntityContextList(String annotatedName) {
        return entityContextMap.get(annotatedName);
    }

    public Map<String, Map<String, Object>> listParamValues(List<String> entityNames) {
        Map<String, Map<String, Object>> result = new HashMap<>();

        for (String entityName : entityNames) {
            //按照order优先级排序
            List<LCAPSQLAnnotationHandler> sortedHandlers = sortHandlers(lcapSqlAnnotationHandlers);
            for (LCAPSQLAnnotationHandler annotationHandler : sortedHandlers) {
                EntityContext entityContext = getEntityContext(annotationHandler.consume().getSimpleName(), entityName);
                if (Objects.nonNull(entityContext)) {
                    Map<String, Object> paramValues = annotationHandler.listParamValues(entityName, entityContext);
                    result.put(entityName.replace('.', '-'), paramValues);
                } else {
                    log.info("annotationHandler={} not consume entityName={}", annotationHandler, entityName);
                }
            }
        }
        return result;
    }


    public String buildWhereCondition(String entityName, String tableAlias, String clause)
            throws LCAPAnnotationSQLHandlerException {
        List<String> sqls = Lists.newArrayList();
        //按照order优先级排序
        List<LCAPSQLAnnotationHandler> sortedHandlers = sortHandlers(lcapSqlAnnotationHandlers);
        for (LCAPSQLAnnotationHandler annotationHandler : sortedHandlers) {
            EntityContext entityContext = getEntityContext(annotationHandler.consume().getSimpleName(), entityName);
            if (Objects.nonNull(entityContext)) {
                BuildWhereConditionArgs args = new BuildWhereConditionArgs();
                args.setEntityName(entityName);
                args.setTableAlias(tableAlias);
                args.setClause(clause);
                String whereCondition = annotationHandler.buildWhereCondition(args, entityContext);
                if (StringUtils.isNotEmpty(whereCondition)) {
                    sqls.add(whereCondition);
                }
            } else {
                log.info("annotationHandler={} not consume entityName={}", annotationHandler, entityName);
            }
        }
        if (CollectionUtils.isEmpty(sqls)) {
            return "1 = 1";
        }
        return "(" + String.join(" AND ", sqls) + ")";
    }

    public boolean isFilterable(String entityName, String propertyName, String clause)
            throws LCAPAnnotationSQLHandlerException {
        boolean isFilterable = true;
        //按照order优先级排序
        List<LCAPSQLAnnotationHandler> sortedHandlers = sortHandlers(lcapSqlAnnotationHandlers);
        for (LCAPSQLAnnotationHandler annotationHandler : sortedHandlers) {
            EntityContext entityContext = getEntityContext(annotationHandler.consume().getSimpleName(), entityName);
            if (Objects.nonNull(entityContext)) {
                IsFilterableArgs args = new IsFilterableArgs();
                args.setEntityName(entityName);
                args.setPropertyName(propertyName);
                args.setClause(clause);
                args.setPrevIsFilterable(isFilterable);
                isFilterable = annotationHandler.isFilterable(args, entityContext);
            } else {
                log.info("annotationHandler={} not consume entityName={}", annotationHandler, entityName);
            }
        }
        return isFilterable;
    }

    public String buildAssignment(String entityName, String propertyName, String originAssignment)
            throws LCAPAnnotationSQLHandlerException {
        String sql = originAssignment;
        //按照order优先级排序
        List<LCAPSQLAnnotationHandler> sortedHandlers = sortHandlers(lcapSqlAnnotationHandlers);
        for (LCAPSQLAnnotationHandler annotationHandler : sortedHandlers) {
            EntityContext entityContext = getEntityContext(annotationHandler.consume().getSimpleName(), entityName);
            if (Objects.nonNull(entityContext)) {
                BuildAssignmentArgs args = new BuildAssignmentArgs();
                args.setEntityName(entityName);
                args.setPropertyName(propertyName);
                args.setPrevAssignment(sql);
                String assignment = annotationHandler.buildAssignment(args, entityContext);
                if (StringUtils.isNotEmpty(assignment)) {
                    sql = assignment;
                }
            } else {
                log.info("annotationHandler={} not consume entityName={}", annotationHandler, entityName);
            }
        }
        return sql;
    }

    public String buildSelectExpr(String entityName, String propertyName, String originSelectExpr)
            throws LCAPAnnotationSQLHandlerException {
        String sql = originSelectExpr;
        //按照order优先级排序
        List<LCAPSQLAnnotationHandler> sortedHandlers = sortHandlers(lcapSqlAnnotationHandlers);
        for (LCAPSQLAnnotationHandler annotationHandler : sortedHandlers) {
            EntityContext entityContext = getEntityContext(annotationHandler.consume().getSimpleName(), entityName);
            if (Objects.nonNull(entityContext)) {
                BuildSelectExprArgs args = new BuildSelectExprArgs();
                args.setEntityName(entityName);
                args.setPropertyName(propertyName);
                args.setPrevSelectExpr(sql);
                String selectExpr = annotationHandler.buildSelectExpr(args, entityContext);
                if (StringUtils.isNotEmpty(selectExpr)) {
                    sql = selectExpr;
                }
            } else {
                log.info("annotationHandler={} not consume entityName={}", annotationHandler, entityName);
            }
        }
        return sql;
    }


    private <T extends LCAPAnnotationHandler> List<T> sortHandlers(List<T> handlers) {
        return handlers.stream()
                .sorted(Comparator.comparing(LCAPAnnotationHandler::order))
                .collect(Collectors.toList());
    }


    /**
     * 逻辑上报切面回调
     */
    public void processAnnotationContextReport()
            throws LCAPAnnotationSQLHandlerException, LCAPAnnotationLogicHandlerException {
        log.info("processEntityAnnotationContextReport start");
        long start = System.currentTimeMillis();
        doEntityContextReport();
        log.info("processEntityAnnotationContextReport finished，cost time={}ms", System.currentTimeMillis() - start);
        log.info("processLogicAnnotationContextReport start");
        start = System.currentTimeMillis();
        doLogicContextReport();
        log.info("processLogicAnnotationContextReport finished，cost time={}ms", System.currentTimeMillis() - start);
    }


    /**
     * 逻辑处理切面回调
     */
    public void processLogicHandlerHandle(String logicName, Object[] args, Object result,
                                          LCAPAnnotationHandlerAdvise annotationAdvise) throws LCAPAnnotationLogicHandlerException {
        //过滤annotationAdvise的handle处理器
        List<LCAPLogicAnnotationHandler> list = lcapLogicAnnotationHandlers.stream()
                .filter(handler -> Arrays.stream(handler.advises()).anyMatch(advise -> advise == annotationAdvise))
                .collect(Collectors.toList());
        List<LCAPLogicAnnotationHandler> sortedHandlers = sortHandlers(list);
        for (LCAPLogicAnnotationHandler annotationHandler : sortedHandlers) {
            LogicContext logicContext = getLogicContextMap(annotationHandler.consume().getSimpleName(), logicName);
            if (Objects.nonNull(logicContext)) {
                annotationHandler.handle(args, result, logicContext);
            } else {
                log.info("annotationHandler={} not consume logicName={}", annotationHandler, logicName);
            }
        }
    }

    public LogicContext getLogicContextMap(String annotationName, String logicName) {
        List<LogicContext> contexts = logicContextMap.get(annotationName);
        if (!CollectionUtils.isEmpty(contexts)) {
            for (int i = 0; i < contexts.size(); i++) {
                if (contexts.get(i).getLogicName().equalsIgnoreCase(logicName)) {
                    return contexts.get(i);
                }
            }
        }
        return null;
    }

    public EntityContext getEntityContext(String annotationName, String entityName) {
        List<EntityContext> contexts = entityContextMap.get(annotationName);
        if (!CollectionUtils.isEmpty(contexts)) {
            for (int i = 0; i < contexts.size(); i++) {
                if (contexts.get(i).getEntityName().equals(entityName)) {
                    return contexts.get(i);
                }
            }
        }
        return null;
    }

    private void doEntityContextReport() throws LCAPAnnotationSQLHandlerException {
        for (LCAPSQLAnnotationHandler annotationHandler : lcapSqlAnnotationHandlers) {
            List<EntityContext> entityContexts = entityContextMap.get(annotationHandler.consume().getSimpleName());
            if (Objects.nonNull(entityContexts)) {
                annotationHandler.report(entityContexts);
            } else {
                log.info("processEntityAnnotationContextReport: EntityContext not found , annotation={}", annotationHandler.consume().getSimpleName());
                annotationHandler.report(Lists.newArrayList());
            }
        }
    }

    private void doLogicContextReport() throws LCAPAnnotationLogicHandlerException {
        for (LCAPLogicAnnotationHandler annotationHandler : lcapLogicAnnotationHandlers) {
            List<LogicContext> logicContexts = logicContextMap.get(annotationHandler.consume().getSimpleName());
            if (Objects.nonNull(logicContexts)) {
                annotationHandler.report(logicContexts);
            } else {
                log.info("processLogicAnnotationContextReport: LogicContext not found, annotation={}", annotationHandler.consume().getSimpleName());
                annotationHandler.report(Lists.newArrayList());
            }
        }
    }

    @Override
    public void afterPropertiesSet() {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        loadHandlerFromSpi();
        if (!CollectionUtils.isEmpty(lcapAspectHandlers)) {
            loadContextFromResourceJson();
        }
    }

    private void loadContextFromResourceJson() {
        long start = System.currentTimeMillis();
        for (LCAPAnnotationHandler annotationHandler : lcapAspectHandlers) {
            List<LogicContext> commonLogicContextList = readFileToCollect("annotation/annotation_metadata_logic.json", new TypeReference<List<LogicContext>>() {
            });
            List<EntityContext> commonEntityContextList = readFileToCollect("annotation/annotation_metadata_entity.json", new TypeReference<List<EntityContext>>() {
            });

            Class<? extends LCAPAnnotation> annotationClass = annotationHandler.consume();
            if (annotationHandler instanceof LCAPLogicAnnotationHandler) {
                lcapLogicAnnotationHandlers.add((LCAPLogicAnnotationHandler) annotationHandler);
                String filePath = String.format("annotation/annotation_metadata_logic_%s.json", annotationClass.getSimpleName());
                List<LogicContext> contextList = readFileToCollect(filePath, new TypeReference<List<LogicContext>>() {
                });
                if (Objects.nonNull(contextList)) {
                    contextList.stream().forEach(logicContext -> {
                        logicContext.getAnnotationProperties().remove("useAnno");
                        logicContext.setAnnotation((LCAPLogicAnnotation) objectMapper.convertValue(logicContext.getAnnotationProperties(), annotationHandler.consume()));
                    });
                    combinedLogicContextList(commonLogicContextList, contextList);
                    logicContextMap.put(annotationClass.getSimpleName(), contextList);
                    log.info("annotation={},filePath={},content={}", annotationHandler.consume().getSimpleName(), filePath, contextList);
                } else {
                    log.info("nothing read from file [{}]", filePath);
                }
            } else if (annotationHandler instanceof LCAPSQLAnnotationHandler) {
                lcapSqlAnnotationHandlers.add((LCAPSQLAnnotationHandler) annotationHandler);
                String filePath = String.format("annotation/annotation_metadata_entity_%s.json", annotationClass.getSimpleName());
                List<EntityContext> contextList = readFileToCollect(filePath, new TypeReference<List<EntityContext>>() {
                });

                if (Objects.nonNull(contextList)) {
                    contextList.stream().forEach(logicContext -> {
                        logicContext.getAnnotationProperties().remove("useAnno");
                        logicContext.setAnnotation((LCAPSQLAnnotation) objectMapper.convertValue(logicContext.getAnnotationProperties(), annotationHandler.consume()));
                    });
                    combinedEntityContextList(commonEntityContextList, contextList);
                    entityContextMap.put(annotationClass.getSimpleName(), contextList);
                    log.info("annotation={},filePath={},content={}", annotationHandler.consume().getSimpleName(), filePath, contextList);
                } else {
                    log.info("nothing read from file [{}]", filePath);
                }
            }
        }
        log.info("序列化注解数据，耗时={}ms", System.currentTimeMillis() - start);
    }

    public void combinedLogicContextList(List<LogicContext> commonLogicContextList, List<LogicContext> annotationLogicContextList) {
        if(Objects.isNull(commonLogicContextList) || Objects.isNull(annotationLogicContextList)){
            return;
        }
        Map<String, LogicContext> commonLogicContextMap = commonLogicContextList.stream().collect(Collectors.toMap(LogicContext::getLogicName, Function.identity()));
        annotationLogicContextList.stream().forEach(logicContext -> {
            if(commonLogicContextMap.containsKey(logicContext.getLogicName())){
                logicContext.setReturnShape(commonLogicContextMap.get(logicContext.getLogicName()).getReturnShape());
                logicContext.setLogicDescription(commonLogicContextMap.get(logicContext.getLogicName()).getLogicDescription());
                logicContext.setProperties(commonLogicContextMap.get(logicContext.getLogicName()).getProperties());
            }
        });
    }

    public void combinedEntityContextList(List<EntityContext> commonEntityContextList, List<EntityContext> annotationEntityContextList) {
        if(Objects.isNull(commonEntityContextList) || Objects.isNull(annotationEntityContextList)){
            return;
        }
        Map<String, EntityContext> commonEntityContextMap = commonEntityContextList.stream().collect(Collectors.toMap(EntityContext::getEntityName, Function.identity()));
        annotationEntityContextList.stream().forEach(entityContext -> {
            if(commonEntityContextMap.containsKey(entityContext.getEntityName())){
                entityContext.setEntityDescription(commonEntityContextMap.get(entityContext.getEntityName()).getEntityDescription());
                entityContext.setProperties(commonEntityContextMap.get(entityContext.getEntityName()).getProperties());
                entityContext.setTableName(commonEntityContextMap.get(entityContext.getEntityName()).getTableName());
                entityContext.setDbType(commonEntityContextMap.get(entityContext.getEntityName()).getDbType());
            }
        });
    }

    /**
     * 从源json文件中读取配置数据
     */
    private <T> T readFileToCollect(String filePath, TypeReference<T> typeReference) {
        ClassPathResource classPathResource = new ClassPathResource(filePath);
        InputStream inputStream = null;
        try {
            inputStream = classPathResource.getInputStream();
        } catch (FileNotFoundException fnfe) {
            log.info("file [{}] not exist", filePath);
            return null;
        } catch (IOException e) {
            log.error("fail to read file [{}]", filePath, e);
            return null;
        }
        T readValue = null;
        try {
            readValue = objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            log.error("fail to deserialize file content [{}]", filePath, e);
            return null;
        }
        return readValue;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        OverriddenFrameworkHelper.setTargetBeanLoader(new TargetBeanLoader() {
            @Override
            public Object load(String beanName) {
                if (applicationContext.containsBean(beanName)) {
                    return applicationContext.getBean(beanName);
                }
                return null;
            }

            @Override
            public Object invoke(String className, String methodName, Object[] args) {
                return overriddenLogicManager.execute(className, methodName, args);
            }
        });
    }
}
