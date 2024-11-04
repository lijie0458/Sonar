package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadAddRoleUserTableViewCustomizeServiceMapper; 

@Service
public class LoadAddRoleUserTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadAddRoleUserTableViewCustomizeServiceMapper loadAddRoleUserTableViewCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90 loadAddRoleUserTableView(Long page, Long size, String sort, String order) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90();
        result = CommonFunctionUtil.createListPage(loadAddRoleUserTableViewCustomizeServiceMapper.getAnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8(page, size, getTableField("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8", sort), order), loadAddRoleUserTableViewCustomizeServiceMapper.countAnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8(page, size, getTableField("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadAddRoleUserTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.id", "`lcap_user_role_mapping_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.createdTime", "`lcap_user_role_mapping_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.updatedTime", "`lcap_user_role_mapping_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.createdBy", "`lcap_user_role_mapping_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.updatedBy", "`lcap_user_role_mapping_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.userId", "`lcap_user_role_mapping_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.roleId", "`lcap_user_role_mapping_a6d592`.`role_id`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.userName", "`lcap_user_role_mapping_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPUserRoleMapping.source", "`lcap_user_role_mapping_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.id", "`lcap_role_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.createdTime", "`lcap_role_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.updatedTime", "`lcap_role_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.createdBy", "`lcap_role_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.updatedBy", "`lcap_role_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.uuid", "`lcap_role_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.name", "`lcap_role_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.description", "`lcap_role_a6d592`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.roleStatus", "`lcap_role_a6d592`.`role_status`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.editable", "`lcap_role_a6d592`.`editable`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.viewDataPermission", "`lcap_role_a6d592`.`view_data_permission`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("lCAPRole.editDataPermission", "`lcap_role_a6d592`.`edit_data_permission`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("id", "`lcap_user_role_mapping_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("createdTime", "`lcap_user_role_mapping_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("updatedTime", "`lcap_user_role_mapping_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("createdBy", "`lcap_user_role_mapping_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("updatedBy", "`lcap_user_role_mapping_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("userId", "`lcap_user_role_mapping_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("roleId", "`lcap_user_role_mapping_a6d592`.`role_id`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("userName", "`lcap_user_role_mapping_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("source", "`lcap_user_role_mapping_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("uuid", "`lcap_role_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("name", "`lcap_role_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("description", "`lcap_role_a6d592`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("roleStatus", "`lcap_role_a6d592`.`role_status`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("editable", "`lcap_role_a6d592`.`editable`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("viewDataPermission", "`lcap_role_a6d592`.`view_data_permission`");
        orderByParamToColumnMap.get("AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8").put("editDataPermission", "`lcap_role_a6d592`.`edit_data_permission`");
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
