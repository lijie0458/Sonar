package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22AE7863E3C41560E38F2AE6B1FA08AD; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadOtherTableView_1CustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

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
public class LoadOtherTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadOtherTableView_1CustomizeServiceMapper loadOtherTableView_1CustomizeServiceMapper;

    public AnonymousStructure_22AE7863E3C41560E38F2AE6B1FA08AD loadOtherTableView_1(Long page, Long size, String sort, String order, OtherInStorageEntity filter, List<String> dataViewAuthority, TimeHorizonStructure timeHorizon) {
        AnonymousStructure_22AE7863E3C41560E38F2AE6B1FA08AD result = new AnonymousStructure_22AE7863E3C41560E38F2AE6B1FA08AD();
        result = CommonFunctionUtil.createListPage(loadOtherTableView_1CustomizeServiceMapper.getAnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF(filter, timeHorizon, page, size, getTableField("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF", sort), dataViewAuthority, order), loadOtherTableView_1CustomizeServiceMapper.countAnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF(filter, timeHorizon, page, size, getTableField("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF", sort), dataViewAuthority, order).intValue(), AnonymousStructure_22AE7863E3C41560E38F2AE6B1FA08AD.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadOtherTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.code", "`other_in_storage`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.createdTime", "`other_in_storage`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.createdBy", "`other_in_storage`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.updatedTime", "`other_in_storage`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.updatedBy", "`other_in_storage`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.userId", "`other_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.sourceCode", "`other_in_storage`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.desc", "`other_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.state", "`other_in_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.applyDate", "`other_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.deliveryDate", "`other_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.unit", "`other_in_storage`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorage.accessory", "`other_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.id", "`other_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.createdTime", "`other_in_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.updatedTime", "`other_in_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.createdBy", "`other_in_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.updatedBy", "`other_in_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.otherInSCode", "`other_in_storage_details`.`other_in_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.materialCode", "`other_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.lotNumber", "`other_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.quantity", "`other_in_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.sourceCode", "`other_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.warehouseId", "`other_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.remark", "`other_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.unreturnQuantity", "`other_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInStorageDetails.storageLocationId", "`other_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("code", "`other_in_storage`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("createdTime", "`other_in_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("createdBy", "`other_in_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("updatedTime", "`other_in_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("updatedBy", "`other_in_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("userId", "`other_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("sourceCode", "`other_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("desc", "`other_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("state", "`other_in_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("applyDate", "`other_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("deliveryDate", "`other_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("unit", "`other_in_storage`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("accessory", "`other_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("id", "`other_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("otherInSCode", "`other_in_storage_details`.`other_in_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("materialCode", "`other_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("lotNumber", "`other_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("quantity", "`other_in_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("warehouseId", "`other_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("remark", "`other_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("unreturnQuantity", "`other_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("storageLocationId", "`other_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
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
