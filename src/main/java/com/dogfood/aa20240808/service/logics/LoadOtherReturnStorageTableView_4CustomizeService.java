package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E3C613168060E6F1BC082A6B8E2A4D59; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadOtherReturnStorageTableView_4CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageEntity; 
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
public class LoadOtherReturnStorageTableView_4CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadOtherReturnStorageTableView_4CustomizeServiceMapper loadOtherReturnStorageTableView_4CustomizeServiceMapper;

    public AnonymousStructure_E3C613168060E6F1BC082A6B8E2A4D59 loadOtherReturnStorageTableView_4(Long page, Long size, String sort, String order, OtherInStorageEntity filter, OtherReturnStorageEntity filter1, List<String> dataViewAuthority, TimeHorizonStructure timeHorizon) {
        AnonymousStructure_E3C613168060E6F1BC082A6B8E2A4D59 result = new AnonymousStructure_E3C613168060E6F1BC082A6B8E2A4D59();
        result = CommonFunctionUtil.createListPage(loadOtherReturnStorageTableView_4CustomizeServiceMapper.getAnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC(filter, timeHorizon, page, size, filter1, getTableField("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC", sort), dataViewAuthority, order), loadOtherReturnStorageTableView_4CustomizeServiceMapper.countAnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC(filter, timeHorizon, page, size, filter1, getTableField("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC", sort), dataViewAuthority, order).intValue(), AnonymousStructure_E3C613168060E6F1BC082A6B8E2A4D59.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadOtherReturnStorageTableView_4CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorage.returnCode", "`other_return_storage`.`return_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorage.createdTime", "`other_return_storage`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorage.createdBy", "`other_return_storage`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorage.updatedTime", "`other_return_storage`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorage.updatedBy", "`other_return_storage`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorage.state", "`other_return_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorage.otherInSCode", "`other_return_storage`.`other_in_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.code", "`other_in_storage`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.createdTime", "`other_in_storage`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.createdBy", "`other_in_storage`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.updatedTime", "`other_in_storage`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.updatedBy", "`other_in_storage`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.userId", "`other_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.sourceCode", "`other_in_storage`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.desc", "`other_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.state", "`other_in_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.applyDate", "`other_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.deliveryDate", "`other_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.unit", "`other_in_storage`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorage.accessory", "`other_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.id", "`other_return_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.createdTime", "`other_return_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.updatedTime", "`other_return_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.createdBy", "`other_return_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.updatedBy", "`other_return_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.otherInSDetailsId", "`other_return_storage_details`.`other_in_s_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.quantity", "`other_return_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnStorageDetails.otherReturnSCode", "`other_return_storage_details`.`other_return_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.id", "`other_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.createdTime", "`other_in_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.updatedTime", "`other_in_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.createdBy", "`other_in_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.updatedBy", "`other_in_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.otherInSCode", "`other_in_storage_details`.`other_in_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.materialCode", "`other_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.lotNumber", "`other_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.quantity", "`other_in_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.sourceCode", "`other_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.warehouseId", "`other_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.remark", "`other_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.unreturnQuantity", "`other_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInStorageDetails.storageLocationId", "`other_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_levelTwo.detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("returnCode", "`other_return_storage`.`return_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("createdTime", "`other_return_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("createdBy", "`other_return_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("updatedTime", "`other_return_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("updatedBy", "`other_return_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("state", "`other_return_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInSCode", "`other_in_storage_details`.`other_in_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("code", "`other_in_storage`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("userId", "`other_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("sourceCode", "`other_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("desc", "`other_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("applyDate", "`other_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("deliveryDate", "`other_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("unit", "`other_in_storage`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("accessory", "`other_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("id", "`other_return_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherInSDetailsId", "`other_return_storage_details`.`other_in_s_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("quantity", "`other_return_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("otherReturnSCode", "`other_return_storage_details`.`other_return_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("materialCode", "`other_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("lotNumber", "`other_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouseId", "`other_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("remark", "`other_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("unreturnQuantity", "`other_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("storageLocationId", "`other_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC").put("detailedAddress", "`warehouse_level_two`.`detailed_address`");
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
