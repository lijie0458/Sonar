package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadUserManagementTableView_1CustomizeServiceMapper; 

/**
 * 
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class LoadUserManagementTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadUserManagementTableView_1CustomizeServiceMapper loadUserManagementTableView_1CustomizeServiceMapper;

    public AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73 loadUserManagementTableView_1(Long page, Long size, String sort, String order, LCAPUser filter) {
        AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73 result = new AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73();
        result = CommonFunctionUtil.createListPage(loadUserManagementTableView_1CustomizeServiceMapper.getAnonymousStructure_412E9C147CB3C99353FD18461376E868(filter, page, size, getTableField("AnonymousStructure_412E9C147CB3C99353FD18461376E868", sort), order), loadUserManagementTableView_1CustomizeServiceMapper.countAnonymousStructure_412E9C147CB3C99353FD18461376E868(filter, page, size, getTableField("AnonymousStructure_412E9C147CB3C99353FD18461376E868", sort), order).intValue(), AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadUserManagementTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_412E9C147CB3C99353FD18461376E868", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_412E9C147CB3C99353FD18461376E868").put("parent_id", "`department`.`parent_id`");
    } 

    private String getTableField(String structureName, String propertyName) {
        if (null == structureName || null == propertyName || null == orderByParamToColumnMap.get(structureName) || "".equals(propertyName)) {
            return null;
        } 

        if (null == orderByParamToColumnMap.get(structureName).get(propertyName)) {
            throw new HttpCodeException(404, "排序参数{" + propertyName + "}不存在"); 
        } 

        return orderByParamToColumnMap.get(structureName).get(propertyName);
    } 

    private <T> T getObjectTableField(String structureName, T obj, List<String> fieldNames) {
        try {
            T cloneObj = CommonFunctionUtil.clone(obj); 
            for (String fieldRef : fieldNames) {
                String[] fieldNameSplit = fieldRef.split("\\."); 
                Field field = obj.getClass().getDeclaredField(fieldNameSplit[0]); 
                Object fieldObject = cloneObj; 
                for (int fieldIndex = 1; fieldIndex < fieldNameSplit.length; fieldIndex++) {
                    fieldObject = field.get(fieldObject); 
                    field = field.getType().getDeclaredField(fieldNameSplit[fieldIndex]); 
                } 
                field.set(fieldObject, getTableField(structureName, String.valueOf(field.get(fieldObject))));
            } 
            return cloneObj;
        } catch (Exception e) {
            throw new HttpCodeException("500", e); 
        } 
    } 

}
