package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.repository.LoadWarehousingTableView_1CustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadWarehousingTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadWarehousingTableView_1CustomizeServiceMapper loadWarehousingTableView_1CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_45571C3EF8A82D2F17998324EAA71AAD loadWarehousingTableView_1(Long size, String sort, String order, ProductInStorageEntity filter, Long page, List<String> dataViewAuthority, TimeHorizonStructure timeHorizon) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_45571C3EF8A82D2F17998324EAA71AAD result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_45571C3EF8A82D2F17998324EAA71AAD();
        result = CommonFunctionUtil.createListPage(loadWarehousingTableView_1CustomizeServiceMapper.getAnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8(filter, timeHorizon, page, size, getTableField("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8", sort), dataViewAuthority, order), loadWarehousingTableView_1CustomizeServiceMapper.countAnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8(filter, timeHorizon, page, size, getTableField("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8", sort), dataViewAuthority, order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_45571C3EF8A82D2F17998324EAA71AAD.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadWarehousingTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.num", "`product_in_storage`.`num`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.createdTime", "`product_in_storage`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.createdBy", "`product_in_storage`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.updatedTime", "`product_in_storage`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.updatedBy", "`product_in_storage`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.userId", "`product_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.sourceCode", "`product_in_storage`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.desc", "`product_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.state", "`product_in_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.applyDate", "`product_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.deliveryDate", "`product_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.departmentId", "`product_in_storage`.`department_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorage.accessory", "`product_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.id", "`product_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.createdTime", "`product_in_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.updatedTime", "`product_in_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.createdBy", "`product_in_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.updatedBy", "`product_in_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.code", "`product_in_storage_details`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.materialCode", "`product_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.lotNumber", "`product_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.quantity", "`product_in_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.sourceCode", "`product_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.warehouseId", "`product_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.remark", "`product_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.unreturnQuantity", "`product_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("productInStorageDetails.storageLocationId", "`product_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("num", "`product_in_storage`.`num`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("createdTime", "`product_in_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("createdBy", "`product_in_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("updatedTime", "`product_in_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("updatedBy", "`product_in_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("userId", "`product_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("sourceCode", "`product_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("desc", "`product_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("state", "`product_in_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("applyDate", "`product_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("deliveryDate", "`product_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("departmentId", "`product_in_storage`.`department_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("accessory", "`product_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("id", "`product_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("code", "`product_in_storage_details`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("materialCode", "`product_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("lotNumber", "`product_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("quantity", "`product_in_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("warehouseId", "`product_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("remark", "`product_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("unreturnQuantity", "`product_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("storageLocationId", "`product_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8").put("unitName", "`measuring_unit`.`unit_name`");
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
