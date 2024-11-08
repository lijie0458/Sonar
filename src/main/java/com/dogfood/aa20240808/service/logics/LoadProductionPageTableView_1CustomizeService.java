package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionEntity; 
import com.dogfood.aa20240808.repository.LoadProductionPageTableView_1CustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70E8AA8AF66CC8BFB9F26E5BE1360EC7; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 生产领料列表
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
public class LoadProductionPageTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadProductionPageTableView_1CustomizeServiceMapper loadProductionPageTableView_1CustomizeServiceMapper;

    public AnonymousStructure_70E8AA8AF66CC8BFB9F26E5BE1360EC7 loadProductionPageTableView_1(Long page, Long size, String sort, String order, ProductionMaterialRequisitionEntity filter, DistinctionEnumEnum DistinctionEnum, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        AnonymousStructure_70E8AA8AF66CC8BFB9F26E5BE1360EC7 result = new AnonymousStructure_70E8AA8AF66CC8BFB9F26E5BE1360EC7();
        result = CommonFunctionUtil.createListPage(loadProductionPageTableView_1CustomizeServiceMapper.getAnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8(filter, DistinctionEnum, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8", sort), order), loadProductionPageTableView_1CustomizeServiceMapper.countAnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8(filter, DistinctionEnum, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8", sort), order).intValue(), AnonymousStructure_70E8AA8AF66CC8BFB9F26E5BE1360EC7.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadProductionPageTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.documentNumber", "`production_material_requisition`.`document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.department", "`production_material_requisition`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.employee", "`production_material_requisition`.`employee`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.requestDate", "`production_material_requisition`.`request_date`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.summary", "`production_material_requisition`.`summary`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.attachment", "`production_material_requisition`.`attachment`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.approvalStatus", "`production_material_requisition`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.issueReturnDistinction", "`production_material_requisition`.`issue_return_distinction`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.guardian", "`production_material_requisition`.`guardian`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.createdBy", "`production_material_requisition`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition.sourceDocumentNumber", "`production_material_requisition`.`source_document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.id", "`production_material_requisition_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.materialCode", "`production_material_requisition_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.quantity", "`production_material_requisition_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.unitPrice", "`production_material_requisition_details`.`unit_price`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.notes", "`production_material_requisition_details`.`notes`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.productionMaterialRequisition", "`production_material_requisition_details`.`production_material_requisition`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.warehouse", "`production_material_requisition_details`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.productionMaterialRequisitionId", "`production_material_requisition_details`.`production_material_requisition_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.batchNumber", "`production_material_requisition_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.totalPrice", "`production_material_requisition_details`.`total_price`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.sourceNumber", "`production_material_requisition_details`.`source_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.storageLocation", "`production_material_requisition_details`.`storage_location`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.returnQuanTity", "`production_material_requisition_details`.`return_quan_tity`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionDetails.sourceNumberId", "`production_material_requisition_details`.`source_number_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("documentNumber", "`production_material_requisition`.`document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department", "`production_material_requisition`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("employee", "`production_material_requisition`.`employee`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("requestDate", "`production_material_requisition`.`request_date`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("summary", "`production_material_requisition`.`summary`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("attachment", "`production_material_requisition`.`attachment`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("approvalStatus", "`production_material_requisition`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("issueReturnDistinction", "`production_material_requisition`.`issue_return_distinction`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("guardian", "`production_material_requisition`.`guardian`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("createdBy", "`production_material_requisition`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("sourceDocumentNumber", "`production_material_requisition`.`source_document_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("id", "`production_material_requisition_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("materialCode", "`production_material_requisition_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("quantity", "`production_material_requisition_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("unitPrice", "`production_material_requisition_details`.`unit_price`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("notes", "`production_material_requisition_details`.`notes`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisition", "`production_material_requisition_details`.`production_material_requisition`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("warehouse", "`production_material_requisition_details`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("productionMaterialRequisitionId", "`production_material_requisition_details`.`production_material_requisition_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("batchNumber", "`production_material_requisition_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("totalPrice", "`production_material_requisition_details`.`total_price`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("sourceNumber", "`production_material_requisition_details`.`source_number`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("storageLocation", "`production_material_requisition_details`.`storage_location`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("returnQuanTity", "`production_material_requisition_details`.`return_quan_tity`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("sourceNumberId", "`production_material_requisition_details`.`source_number_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
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
