package com.dogfood.aa20240808.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.netease.lowcode.annotation.exception.LCAPAnnotationSQLHandlerException;
import com.dogfood.aa20240808.aspect.AnnotationManager;

/**
 * Mybatis中OGNL表达式调用AnnotationManager的工具类
 */
public class SqlAspectUtils {

    /**
     * 使用SQL切面为实体预先准备后续构建的SQL片段所需的参数
     *
     * @param entityNamesText 逗号分隔的实体名称
     * @return 第1级key为对应参数的实体名称，第2级key为切面处理器内部定义的key，value为参数值
     */
    public static Map<String, Map<String, Object>> listParamValues(String entityNamesText) {
        List<String> entityNames = Arrays.asList(entityNamesText.split(","));
        return SpringUtils.getBean(AnnotationManager.class).listParamValues(entityNames);
    }

    /**
     * 使用SQL切面为实体构建where_condition片段
     *
     * @param datasource 数据源
     * @param entityName 数据源下实体
     * @param tableAlias 实体在SQL中的别名
     * @param clause 代表生成的where_condition将会被添加到哪个子句中，可选值为whereClause、havingClause、onClause
     */
    public static String buildWhereCondition(String datasource, String entityName, String tableAlias, String clause)
            throws LCAPAnnotationSQLHandlerException {
        return SpringUtils.getBean(AnnotationManager.class)
                .buildWhereCondition(datasource + "." + entityName, tableAlias, clause);
    }

    /**
     * 使用SQL切面为实体属性构建select_expr片段
     *
     * @param datasource 数据源
     * @param entityName 数据源下的实体
     * @param propertyName 实体下的属性
     * @param originSelectExpr 代表返回值将会被用于替换掉这个originSelectExpr
     */
    public static String buildSelectExpr(String datasource, String entityName, String propertyName,
            String originSelectExpr) throws LCAPAnnotationSQLHandlerException {
        return SpringUtils.getBean(AnnotationManager.class)
                .buildSelectExpr(datasource + "." + entityName, propertyName, originSelectExpr);
    }

    /**
     * 使用SQL切面判断实体属性是否可作为参数clause中的过滤条件
     *
     * @param datasource 数据源
     * @param entityName 数据源下的实体
     * @param propertyName 实体下的属性
     * @param clause 可选值为whereClause、havingClause、onClause
     */
    public static boolean isFilterable(String datasource, String entityName, String propertyName, String clause)
            throws LCAPAnnotationSQLHandlerException {
        return SpringUtils.getBean(AnnotationManager.class)
                .isFilterable(datasource + "." + entityName, propertyName, clause);
    }

    /**
     * 使用SQL切面为实体属性构建assignment片段
     *
     * @param datasource 数据源
     * @param entityName 数据源下的实体
     * @param propertyName 实体下的属性
     * @param originAssignmentRight 代表返回值将会被框架用于替换掉这个originAssignment
     */
    public static String buildAssignment(String datasource, String entityName, String propertyName,
            String originAssignmentRight) throws LCAPAnnotationSQLHandlerException {
        originAssignmentRight = "#{" + originAssignmentRight + "}"; // OGNL参数如果出现}字面量，会导致解析混淆，所以在静态方法中拼接
        return SpringUtils.getBean(AnnotationManager.class)
                .buildAssignment(datasource + "." + entityName, propertyName, originAssignmentRight);
    }

}