package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.PermissionGroupEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.repository.LoadPermissionGroupManagementTableView_1CustomizeServiceMapper; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadPermissionGroupManagementTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadPermissionGroupManagementTableView_1CustomizeServiceMapper loadPermissionGroupManagementTableView_1CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7AA66D6E2A21E3101B9C2B73B7971B38 loadPermissionGroupManagementTableView_1(Long page, Long size, String sort, String order, PermissionGroupEntity filter) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7AA66D6E2A21E3101B9C2B73B7971B38 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7AA66D6E2A21E3101B9C2B73B7971B38();
        result = CommonFunctionUtil.createListPage(loadPermissionGroupManagementTableView_1CustomizeServiceMapper.getAnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E(page, size, getTableField("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E", sort), order), loadPermissionGroupManagementTableView_1CustomizeServiceMapper.countAnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E(page, size, getTableField("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7AA66D6E2A21E3101B9C2B73B7971B38.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadPermissionGroupManagementTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("permissionGroup.id", "`permission_group`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("permissionGroup.createdTime", "`permission_group`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("permissionGroup.updatedTime", "`permission_group`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("permissionGroup.createdBy", "`permission_group`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("permissionGroup.updatedBy", "`permission_group`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("permissionGroup.name", "`permission_group`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("id", "`permission_group`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("createdTime", "`permission_group`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("updatedTime", "`permission_group`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("createdBy", "`permission_group`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("updatedBy", "`permission_group`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E").put("name", "`permission_group`.`name`");
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
