package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7EAF13B320E1A0EF4BB5A07F9CC98D84; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.repository.LoadWarehouseTableView1CustomizeServiceMapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
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
public class LoadWarehouseTableView1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadWarehouseTableView1CustomizeServiceMapper loadWarehouseTableView1CustomizeServiceMapper;

    public AnonymousStructure_7EAF13B320E1A0EF4BB5A07F9CC98D84 loadWarehouseTableView1(Long page, Long size, String sort, String order, Warehouse_levelTwoEntity filter) {
        AnonymousStructure_7EAF13B320E1A0EF4BB5A07F9CC98D84 result = new AnonymousStructure_7EAF13B320E1A0EF4BB5A07F9CC98D84();
        result = CommonFunctionUtil.createListPage(loadWarehouseTableView1CustomizeServiceMapper.getAnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E(filter, page, size, getTableField("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E", sort), order), loadWarehouseTableView1CustomizeServiceMapper.countAnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E(filter, page, size, getTableField("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E", sort), order).intValue(), AnonymousStructure_7EAF13B320E1A0EF4BB5A07F9CC98D84.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadWarehouseTableView1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_levelTwo.detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.id", "`warehouse_level`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.createdTime", "`warehouse_level`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.updatedTime", "`warehouse_level`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.createdBy", "`warehouse_level`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.updatedBy", "`warehouse_level`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.warehouse_code", "`warehouse_level`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.warehouse_name", "`warehouse_level`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_level.warehouse_manager", "`warehouse_level`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
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
