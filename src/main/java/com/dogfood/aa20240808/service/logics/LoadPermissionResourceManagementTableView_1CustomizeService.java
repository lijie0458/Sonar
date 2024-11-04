package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.repository.LoadPermissionResourceManagementTableView_1CustomizeServiceMapper; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

@Service
public class LoadPermissionResourceManagementTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadPermissionResourceManagementTableView_1CustomizeServiceMapper loadPermissionResourceManagementTableView_1CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA loadPermissionResourceManagementTableView_1(Long page, Long size, String sort, String order, LCAPPermission filter) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA();
        result = CommonFunctionUtil.createListPage(loadPermissionResourceManagementTableView_1CustomizeServiceMapper.getAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(filter, page, size, getTableField("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD", sort), order), loadPermissionResourceManagementTableView_1CustomizeServiceMapper.countAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(filter, page, size, getTableField("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadPermissionResourceManagementTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.id", "`lcap_permission_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.createdTime", "`lcap_permission_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.updatedTime", "`lcap_permission_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.createdBy", "`lcap_permission_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.updatedBy", "`lcap_permission_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.uuid", "`lcap_permission_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.name", "`lcap_permission_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("lCAPPermission.description", "`lcap_permission_a6d592`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("id", "`lcap_permission_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("createdTime", "`lcap_permission_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("updatedTime", "`lcap_permission_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("createdBy", "`lcap_permission_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("updatedBy", "`lcap_permission_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("uuid", "`lcap_permission_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("name", "`lcap_permission_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD").put("description", "`lcap_permission_a6d592`.`description`");
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
