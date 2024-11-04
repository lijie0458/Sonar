package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LoadPurchaseRequestDetailsTableViewCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadPurchaseRequestDetailsTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadPurchaseRequestDetailsTableViewCustomizeServiceMapper loadPurchaseRequestDetailsTableViewCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1F4C609A51E84CB433B7BEC8880AD26 loadPurchaseRequestDetailsTableView(Long page, Long size, String sort, String order, MaterialDetailsEntity filter, List<String> dataViewAuthorityUserNameList) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1F4C609A51E84CB433B7BEC8880AD26 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1F4C609A51E84CB433B7BEC8880AD26();
        result = CommonFunctionUtil.createListPage(loadPurchaseRequestDetailsTableViewCustomizeServiceMapper.getAnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439(filter, dataViewAuthorityUserNameList, page, size, getTableField("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439", sort), order), loadPurchaseRequestDetailsTableViewCustomizeServiceMapper.countAnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439(filter, dataViewAuthorityUserNameList, page, size, getTableField("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1F4C609A51E84CB433B7BEC8880AD26.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadPurchaseRequestDetailsTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.id", "`purchase_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.createdTime", "`purchase_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.updatedTime", "`purchase_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.createdBy", "`purchase_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.updatedBy", "`purchase_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.request_quantity", "`purchase_details`.`request_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.expected_delivery_date", "`purchase_details`.`expected_delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.related_request_number", "`purchase_details`.`related_request_number`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.material_code", "`purchase_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.down_quantity", "`purchase_details`.`down_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.this_quantity", "`purchase_details`.`this_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseDetails.orderStatus", "`purchase_details`.`order_status`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.title", "`purchase_request`.`title`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.requestNumber", "`purchase_request`.`request_number`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.department", "`purchase_request`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.requestReason", "`purchase_request`.`request_reason`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.annex", "`purchase_request`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.createdBy", "`purchase_request`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.approvalStatus", "`purchase_request`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("purchaseRequest.applicationDate", "`purchase_request`.`application_date`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("id", "`purchase_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("createdTime", "`purchase_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("updatedTime", "`purchase_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("createdBy", "`purchase_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("updatedBy", "`purchase_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("request_quantity", "`purchase_details`.`request_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("expected_delivery_date", "`purchase_details`.`expected_delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("related_request_number", "`purchase_details`.`related_request_number`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("material_code", "`purchase_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("down_quantity", "`purchase_details`.`down_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("this_quantity", "`purchase_details`.`this_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("orderStatus", "`purchase_details`.`order_status`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("title", "`purchase_request`.`title`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("requestNumber", "`purchase_request`.`request_number`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department", "`purchase_request`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("requestReason", "`purchase_request`.`request_reason`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("annex", "`purchase_request`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("approvalStatus", "`purchase_request`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("applicationDate", "`purchase_request`.`application_date`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439").put("unitName", "`measuring_unit`.`unit_name`");
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
