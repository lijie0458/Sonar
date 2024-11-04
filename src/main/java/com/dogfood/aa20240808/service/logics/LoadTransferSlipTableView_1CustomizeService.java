package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.domain.entities.TransferSlipEntity; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.ListTransferSlipStructure; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.service.entities.Warehouse_levelTwoEntityService; 
import com.dogfood.aa20240808.repository.LoadTransferSlipTableView_1CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadTransferSlipTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadTransferSlipTableView_1CustomizeServiceMapper loadTransferSlipTableView_1CustomizeServiceMapper;
    @Autowired
    private Warehouse_levelTwoEntityService warehouse_levelTwoEntityService;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A617B684B2576BF205A0A005CC8AF429 loadTransferSlipTableView_1(Long page, Long size, String sort, String order, TransferSlipEntity filter, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        ListTransferSlipStructure ListTransferSlip = new ListTransferSlipStructure();
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E4F157EE5CC3DF1BE154C443EE6BDA13> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E4F157EE5CC3DF1BE154C443EE6BDA13());
        List<ListTransferSlipStructure> ListTransferSlip1 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A617B684B2576BF205A0A005CC8AF429 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A617B684B2576BF205A0A005CC8AF429();
        variable1.param = CommonFunctionUtil.createListPage(loadTransferSlipTableView_1CustomizeServiceMapper.getAnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B", sort), order), loadTransferSlipTableView_1CustomizeServiceMapper.countAnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E4F157EE5CC3DF1BE154C443EE6BDA13.class); 
        for (Long index = 0L; index < variable1.param.list.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B item = variable1.param.list.get(index.intValue());
            ListTransferSlip.transferSlip = item.transferSlip; 
            ListTransferSlip.user = item.lCAPUser; 
            ListTransferSlip.transferSlipDetails = item.transferSlipDetails; 
            ListTransferSlip.materialDetails = item.materialDetails; 
            ListTransferSlip.measuringUnit = item.measuringUnit; 
            ListTransferSlip.oUTwarehouse_levelTwo = item.warehouse_levelTwo; 
            ListTransferSlip.inwarehouse_levelTwo = warehouse_levelTwoEntityService.get(item.transferSlipDetails.inWarehouse).warehouse_name; 
            CommonFunctionUtil.add(ListTransferSlip1, CommonFunctionUtil.clone(ListTransferSlip));
        } 

        result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A617B684B2576BF205A0A005CC8AF429(), _bean539 -> {
    _bean539.total = variable1.param.total; 
    _bean539.list = ListTransferSlip1; 
} ); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadTransferSlipTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.documentNumber", "`transfer_slip`.`document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.inspector", "`transfer_slip`.`inspector`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.sourceDocumentNumber", "`transfer_slip`.`source_document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.requestDate", "`transfer_slip`.`request_date`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.summary", "`transfer_slip`.`summary`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.attachment", "`transfer_slip`.`attachment`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.approvalStatus", "`transfer_slip`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.shippingClerk", "`transfer_slip`.`shipping_clerk`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.outWarehouse", "`transfer_slip`.`out_warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.inWarehouse", "`transfer_slip`.`in_warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlip.createdBy", "`transfer_slip`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.id", "`transfer_slip_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.materialCode", "`transfer_slip_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.quantity", "`transfer_slip_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.notes", "`transfer_slip_details`.`notes`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.productionMaterialRequisition", "`transfer_slip_details`.`production_material_requisition`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.outWarehouse", "`transfer_slip_details`.`out_warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.batchNumber", "`transfer_slip_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.outStorageLocation", "`transfer_slip_details`.`out_storage_location`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.inWarehouse", "`transfer_slip_details`.`in_warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.inStorageLocation", "`transfer_slip_details`.`in_storage_location`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("transferSlipDetails.lotNumber", "`transfer_slip_details`.`lotNumber`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_levelTwo.detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("documentNumber", "`transfer_slip`.`document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("inspector", "`transfer_slip`.`inspector`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("sourceDocumentNumber", "`transfer_slip`.`source_document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("requestDate", "`transfer_slip`.`request_date`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("summary", "`transfer_slip`.`summary`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("attachment", "`transfer_slip`.`attachment`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("approvalStatus", "`transfer_slip`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("shippingClerk", "`transfer_slip`.`shipping_clerk`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("outWarehouse", "`transfer_slip_details`.`out_warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("inWarehouse", "`transfer_slip_details`.`in_warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("id", "`transfer_slip_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("materialCode", "`transfer_slip_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("quantity", "`transfer_slip_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("notes", "`transfer_slip_details`.`notes`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("productionMaterialRequisition", "`transfer_slip_details`.`production_material_requisition`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("batchNumber", "`transfer_slip_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("outStorageLocation", "`transfer_slip_details`.`out_storage_location`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("inStorageLocation", "`transfer_slip_details`.`in_storage_location`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("lotNumber", "`transfer_slip_details`.`lotNumber`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B").put("detailedAddress", "`warehouse_level_two`.`detailed_address`");
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
