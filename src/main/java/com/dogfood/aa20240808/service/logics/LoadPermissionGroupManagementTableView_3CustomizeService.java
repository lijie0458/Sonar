package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.LoadPermissionGroupManagementTableView_3CustomizeServiceMapper; 
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
public class LoadPermissionGroupManagementTableView_3CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadPermissionGroupManagementTableView_3CustomizeServiceMapper loadPermissionGroupManagementTableView_3CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA loadPermissionGroupManagementTableView_3(Long page, Long size, String sort, String order, Long perGrouptId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5> variable1 = new ArrayList<>();
        List<Long> variable2 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA();
        variable1 = CommonFunctionUtil.createListPage(loadPermissionGroupManagementTableView_3CustomizeServiceMapper.getAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5(perGrouptId, page, size, getTableField("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5", sort), order), loadPermissionGroupManagementTableView_3CustomizeServiceMapper.countAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5(perGrouptId, page, size, getTableField("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_63A62260FC029F5392CCD931B361AF92.class).list; 
        variable2 = CommonFunctionUtil.listTransform(variable1, (item) -> item.lCAPPermission.id); 
        result = CommonFunctionUtil.createListPage(loadPermissionGroupManagementTableView_3CustomizeServiceMapper.getAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(variable2), loadPermissionGroupManagementTableView_3CustomizeServiceMapper.countAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(variable2).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadPermissionGroupManagementTableView_3CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("permissionGroup.id", "`permission_group`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("permissionGroup.createdTime", "`permission_group`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("permissionGroup.updatedTime", "`permission_group`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("permissionGroup.createdBy", "`permission_group`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("permissionGroup.updatedBy", "`permission_group`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("permissionGroup.name", "`permission_group`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupPerMapping.id", "`per_group_per_mapping`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupPerMapping.createdTime", "`per_group_per_mapping`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupPerMapping.updatedTime", "`per_group_per_mapping`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupPerMapping.createdBy", "`per_group_per_mapping`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupPerMapping.updatedBy", "`per_group_per_mapping`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupPerMapping.perGroupId", "`per_group_per_mapping`.`per_group_id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupPerMapping.perId", "`per_group_per_mapping`.`per_id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.id", "`lcap_permission_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.createdTime", "`lcap_permission_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.updatedTime", "`lcap_permission_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.createdBy", "`lcap_permission_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.updatedBy", "`lcap_permission_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.uuid", "`lcap_permission_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.name", "`lcap_permission_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("lCAPPermission.description", "`lcap_permission_a6d592`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("id", "`lcap_permission_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("createdTime", "`lcap_permission_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("updatedTime", "`lcap_permission_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("createdBy", "`lcap_permission_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("updatedBy", "`lcap_permission_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("name", "`lcap_permission_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perGroupId", "`per_group_per_mapping`.`per_group_id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("perId", "`per_group_per_mapping`.`per_id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("uuid", "`lcap_permission_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5").put("description", "`lcap_permission_a6d592`.`description`");
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
