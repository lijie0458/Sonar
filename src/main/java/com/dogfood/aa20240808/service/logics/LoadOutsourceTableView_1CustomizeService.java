package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E420ABE805861FC61B5498A37C236D6; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadOutsourceTableView_1CustomizeServiceMapper; 

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
public class LoadOutsourceTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadOutsourceTableView_1CustomizeServiceMapper loadOutsourceTableView_1CustomizeServiceMapper;

    public AnonymousStructure_9E420ABE805861FC61B5498A37C236D6 loadOutsourceTableView_1(Long page, Long size, String sort, String order, OutsourceInStorageEntity filter, List<String> dataViewAuthority, TimeHorizonStructure timeHorizon) {
        AnonymousStructure_9E420ABE805861FC61B5498A37C236D6 result = new AnonymousStructure_9E420ABE805861FC61B5498A37C236D6();
        result = CommonFunctionUtil.createListPage(loadOutsourceTableView_1CustomizeServiceMapper.getAnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A(filter, timeHorizon, page, size, getTableField("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A", sort), dataViewAuthority, order), loadOutsourceTableView_1CustomizeServiceMapper.countAnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A(filter, timeHorizon, page, size, getTableField("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A", sort), dataViewAuthority, order).intValue(), AnonymousStructure_9E420ABE805861FC61B5498A37C236D6.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadOutsourceTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.code", "`outsource_in_storage`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.createdTime", "`outsource_in_storage`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.createdBy", "`outsource_in_storage`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.updatedTime", "`outsource_in_storage`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.updatedBy", "`outsource_in_storage`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.userId", "`outsource_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.sourceCode", "`outsource_in_storage`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.desc", "`outsource_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.state", "`outsource_in_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.applyDate", "`outsource_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.deliveryDate", "`outsource_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.supplierId", "`outsource_in_storage`.`supplier_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorage.accessory", "`outsource_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.id", "`supplier_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.createdTime", "`supplier_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.updatedTime", "`supplier_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.createdBy", "`supplier_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.updatedBy", "`supplier_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.remark", "`supplier_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierDetails.supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.id", "`outsource_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.createdTime", "`outsource_in_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.updatedTime", "`outsource_in_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.createdBy", "`outsource_in_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.updatedBy", "`outsource_in_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.outsourceInSCode", "`outsource_in_storage_details`.`outsource_in_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.materialCode", "`outsource_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.lotNumber", "`outsource_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.quantity", "`outsource_in_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.sourceCode", "`outsource_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.warehouseId", "`outsource_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.remark", "`outsource_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.unreturnQuantity", "`outsource_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInStorageDetails.storageLocationId", "`outsource_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("code", "`outsource_in_storage`.`code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("createdTime", "`outsource_in_storage_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("createdBy", "`outsource_in_storage_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("updatedTime", "`outsource_in_storage_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("updatedBy", "`outsource_in_storage_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("userId", "`outsource_in_storage`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("sourceCode", "`outsource_in_storage_details`.`source_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("desc", "`outsource_in_storage`.`desc`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("state", "`outsource_in_storage`.`state`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("applyDate", "`outsource_in_storage`.`apply_date`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("deliveryDate", "`outsource_in_storage`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplierId", "`outsource_in_storage`.`supplier_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("accessory", "`outsource_in_storage`.`accessory`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("id", "`outsource_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("remark", "`outsource_in_storage_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("outsourceInSCode", "`outsource_in_storage_details`.`outsource_in_s_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("materialCode", "`outsource_in_storage_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("lotNumber", "`outsource_in_storage_details`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("quantity", "`outsource_in_storage_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("warehouseId", "`outsource_in_storage_details`.`warehouse_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("unreturnQuantity", "`outsource_in_storage_details`.`unreturn_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("storageLocationId", "`outsource_in_storage_details`.`storage_location_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A").put("unitName", "`measuring_unit`.`unit_name`");
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
