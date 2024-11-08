package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadWarehouseTableViewCustomizeServiceMapper; 
import java.util.HashMap; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4E11050E3F5E4102B0FBA92E2D111E13; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

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
public class LoadWarehouseTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadWarehouseTableViewCustomizeServiceMapper loadWarehouseTableViewCustomizeServiceMapper;

    public AnonymousStructure_4E11050E3F5E4102B0FBA92E2D111E13 loadWarehouseTableView(Long page, Long size, String sort, String order, Warehouse_levelEntity filter) {
        AnonymousStructure_4E11050E3F5E4102B0FBA92E2D111E13 result = new AnonymousStructure_4E11050E3F5E4102B0FBA92E2D111E13();
        result = CommonFunctionUtil.createListPage(loadWarehouseTableViewCustomizeServiceMapper.getAnonymousStructure_6CA25F63D4A24168C85048D927F1049F(filter, page, size, getTableField("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F", sort), order), loadWarehouseTableViewCustomizeServiceMapper.countAnonymousStructure_6CA25F63D4A24168C85048D927F1049F(filter, page, size, getTableField("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F", sort), order).intValue(), AnonymousStructure_4E11050E3F5E4102B0FBA92E2D111E13.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadWarehouseTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.id", "`warehouse_level`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.createdTime", "`warehouse_level`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.updatedTime", "`warehouse_level`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.createdBy", "`warehouse_level`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.updatedBy", "`warehouse_level`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.warehouse_code", "`warehouse_level`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.warehouse_name", "`warehouse_level`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_level.warehouse_manager", "`warehouse_level`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("createdBy", "`warehouse_level`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("updatedBy", "`warehouse_level`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_code", "`warehouse_level`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_name", "`warehouse_level`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("warehouse_manager", "`warehouse_level`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_6CA25F63D4A24168C85048D927F1049F").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
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
