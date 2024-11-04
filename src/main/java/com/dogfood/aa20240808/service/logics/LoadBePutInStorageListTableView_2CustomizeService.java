package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.repository.LoadBePutInStorageListTableView_2CustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity; 
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

@Service
public class LoadBePutInStorageListTableView_2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadBePutInStorageListTableView_2CustomizeServiceMapper loadBePutInStorageListTableView_2CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C48E1CEBD9C524EDEF01D3202263DF78 loadBePutInStorageListTableView_2(Long page, Long size, String sort, String order, BePutInStorageEntity filter, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C48E1CEBD9C524EDEF01D3202263DF78 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C48E1CEBD9C524EDEF01D3202263DF78();
        result = CommonFunctionUtil.createListPage(loadBePutInStorageListTableView_2CustomizeServiceMapper.getAnonymousStructure_B3517114D7D75A04E66F8916E0CC7388(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388", sort), order), loadBePutInStorageListTableView_2CustomizeServiceMapper.countAnonymousStructure_B3517114D7D75A04E66F8916E0CC7388(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C48E1CEBD9C524EDEF01D3202263DF78.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadBePutInStorageListTableView_2CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.bePutInStorageId", "`be_put_in_storage`.`be_put_in_storage_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.bePutInStorageDate", "`be_put_in_storage`.`be_put_in_storage_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.orderNumber", "`be_put_in_storage`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.supplierName", "`be_put_in_storage`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.description", "`be_put_in_storage`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.annex", "`be_put_in_storage`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.warehouse", "`be_put_in_storage`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorage.createdBy", "`be_put_in_storage`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.id", "`supplier_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.createdTime", "`supplier_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.updatedTime", "`supplier_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.createdBy", "`supplier_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.updatedBy", "`supplier_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.remark", "`supplier_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierDetails.supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_levelTwo.detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDetails.id", "`be_put_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDetails.bePutInStorageId", "`be_put_in_storage_details`.`be_put_in_storage_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDetails.bePutInStorageQuantity", "`be_put_in_storage_details`.`be_put_in_storage_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDetails.materialNumber", "`be_put_in_storage_details`.`material_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDetails.receivableQuantity", "`be_put_in_storage_details`.`receivable_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDetails.batchNumber", "`be_put_in_storage_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDetails.receivingDetailsId", "`be_put_in_storage_details`.`receiving_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.purchaser", "`purchase_order`.`purchaser`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.orderNumber", "`purchase_order`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.supplier", "`purchase_order`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.orderDate", "`purchase_order`.`order_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.requiredDate", "`purchase_order`.`required_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.approvalStatus", "`purchase_order`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.executionStatus", "`purchase_order`.`execution_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.description", "`purchase_order`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.remarks", "`purchase_order`.`remarks`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.listPuchaseDetails", "`purchase_order`.`list_puchase_details`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.manuAuto", "`purchase_order`.`manu_auto`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.createdBy", "`purchase_order`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseOrder.purchaseDetailsIdList", "`purchase_order`.`purchase_details_id_list`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageId", "`be_put_in_storage_details`.`be_put_in_storage_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageDate", "`be_put_in_storage`.`be_put_in_storage_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("orderNumber", "`be_put_in_storage`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplierName", "`be_put_in_storage`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("description", "`be_put_in_storage`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("annex", "`be_put_in_storage`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse", "`be_put_in_storage`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("id", "`be_put_in_storage_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("bePutInStorageQuantity", "`be_put_in_storage_details`.`be_put_in_storage_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialNumber", "`be_put_in_storage_details`.`material_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("receivableQuantity", "`be_put_in_storage_details`.`receivable_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("batchNumber", "`be_put_in_storage_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("receivingDetailsId", "`be_put_in_storage_details`.`receiving_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaser", "`purchase_order`.`purchaser`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("orderDate", "`purchase_order`.`order_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("requiredDate", "`purchase_order`.`required_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("approvalStatus", "`purchase_order`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("executionStatus", "`purchase_order`.`execution_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("remarks", "`purchase_order`.`remarks`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("listPuchaseDetails", "`purchase_order`.`list_puchase_details`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("manuAuto", "`purchase_order`.`manu_auto`");
        orderByParamToColumnMap.get("AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388").put("purchaseDetailsIdList", "`purchase_order`.`purchase_details_id_list`");
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
