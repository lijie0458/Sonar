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
import com.dogfood.aa20240808.domain.entities.LCAPRole; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadRoleManagementTableView_2CustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6; 

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
public class LoadRoleManagementTableView_2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadRoleManagementTableView_2CustomizeServiceMapper loadRoleManagementTableView_2CustomizeServiceMapper;

    public AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6 loadRoleManagementTableView_2(Long page, Long size, String sort, String order, LCAPRole filter) {
        AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6 result = new AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6();
        result = CommonFunctionUtil.createListPage(loadRoleManagementTableView_2CustomizeServiceMapper.getAnonymousStructure_70791B893F53C2EFB9E501591763B020(filter, page, size, getTableField("AnonymousStructure_70791B893F53C2EFB9E501591763B020", sort), order), loadRoleManagementTableView_2CustomizeServiceMapper.countAnonymousStructure_70791B893F53C2EFB9E501591763B020(filter, page, size, getTableField("AnonymousStructure_70791B893F53C2EFB9E501591763B020", sort), order).intValue(), AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadRoleManagementTableView_2CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_70791B893F53C2EFB9E501591763B020", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.id", "`lcap_role_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.createdTime", "`lcap_role_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.updatedTime", "`lcap_role_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.createdBy", "`lcap_role_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.updatedBy", "`lcap_role_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.uuid", "`lcap_role_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.name", "`lcap_role_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.description", "`lcap_role_a6d592`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.roleStatus", "`lcap_role_a6d592`.`role_status`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.editable", "`lcap_role_a6d592`.`editable`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.viewDataPermission", "`lcap_role_a6d592`.`view_data_permission`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("lCAPRole.editDataPermission", "`lcap_role_a6d592`.`edit_data_permission`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("id", "`lcap_role_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("createdTime", "`lcap_role_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("updatedTime", "`lcap_role_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("createdBy", "`lcap_role_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("updatedBy", "`lcap_role_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("uuid", "`lcap_role_a6d592`.`uuid`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("name", "`lcap_role_a6d592`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("description", "`lcap_role_a6d592`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("roleStatus", "`lcap_role_a6d592`.`role_status`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("editable", "`lcap_role_a6d592`.`editable`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("viewDataPermission", "`lcap_role_a6d592`.`view_data_permission`");
        orderByParamToColumnMap.get("AnonymousStructure_70791B893F53C2EFB9E501591763B020").put("editDataPermission", "`lcap_role_a6d592`.`edit_data_permission`");
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
