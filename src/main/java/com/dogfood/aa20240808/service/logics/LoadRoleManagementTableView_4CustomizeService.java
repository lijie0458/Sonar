package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.repository.LoadRoleManagementTableView_4CustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadRoleManagementTableView_4CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadRoleManagementTableView_4CustomizeServiceMapper loadRoleManagementTableView_4CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0E757B1AAF447AED4AA6B80418B28944 loadRoleManagementTableView_4(Long page, Long size, String sort, String order, Long roleId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0E757B1AAF447AED4AA6B80418B28944 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0E757B1AAF447AED4AA6B80418B28944();
        result = CommonFunctionUtil.createListPage(loadRoleManagementTableView_4CustomizeServiceMapper.getAnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631(roleId, page, size, getTableField("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631", sort), order), loadRoleManagementTableView_4CustomizeServiceMapper.countAnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631(roleId, page, size, getTableField("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0E757B1AAF447AED4AA6B80418B28944.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadRoleManagementTableView_4CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.id", "`lcap_user_role_mapping_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.createdTime", "`lcap_user_role_mapping_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.updatedTime", "`lcap_user_role_mapping_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.createdBy", "`lcap_user_role_mapping_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.updatedBy", "`lcap_user_role_mapping_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.userId", "`lcap_user_role_mapping_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.roleId", "`lcap_user_role_mapping_a6d592`.`role_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.userName", "`lcap_user_role_mapping_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUserRoleMapping.source", "`lcap_user_role_mapping_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("id", "`lcap_user_role_mapping_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("createdTime", "`lcap_user_role_mapping_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("updatedTime", "`lcap_user_role_mapping_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("createdBy", "`lcap_user_role_mapping_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("updatedBy", "`lcap_user_role_mapping_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("userId", "`lcap_user_role_mapping_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("roleId", "`lcap_user_role_mapping_a6d592`.`role_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("userName", "`lcap_user_role_mapping_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("source", "`lcap_user_role_mapping_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631").put("parent_id", "`department`.`parent_id`");
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
