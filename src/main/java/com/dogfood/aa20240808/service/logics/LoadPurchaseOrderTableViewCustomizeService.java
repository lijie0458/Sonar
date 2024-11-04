package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.repository.LoadPurchaseOrderTableViewCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.PurchaseOrderDetailsListStructure; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadPurchaseOrderTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadPurchaseOrderTableViewCustomizeServiceMapper loadPurchaseOrderTableViewCustomizeServiceMapper;
    @Autowired
    private LoadTotalQuantityCustomizeService loadTotalQuantityCustomizeService;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9BDEEC62EBFE6F3A9DF1F8D2F7DB0077 loadPurchaseOrderTableView(Long page, Long size, String sort, String order, PurchaseOrderEntity filter, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        PurchaseOrderDetailsListStructure PurchaseOrderDetails = new PurchaseOrderDetailsListStructure();
        List<PurchaseOrderDetailsListStructure> PurchaseOrderDetailsList = new ArrayList<>();
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C94C765BE3CED1EDF981064EE5CAD26> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C94C765BE3CED1EDF981064EE5CAD26());
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9BDEEC62EBFE6F3A9DF1F8D2F7DB0077 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9BDEEC62EBFE6F3A9DF1F8D2F7DB0077();
        variable1.param = CommonFunctionUtil.createListPage(loadPurchaseOrderTableViewCustomizeServiceMapper.getAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6", sort), order), loadPurchaseOrderTableViewCustomizeServiceMapper.countAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C94C765BE3CED1EDF981064EE5CAD26.class); 
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadPurchaseOrderTableViewCustomizeServiceMapper.getAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE61(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6", sort), order), loadPurchaseOrderTableViewCustomizeServiceMapper.countAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE61(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C94C765BE3CED1EDF981064EE5CAD26.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6 item = currentLcpEachName_1.get(index.intValue());
            PurchaseOrderDetails.materialDetails = item.materialDetails; 
            PurchaseOrderDetails.purchaseOrder = item.purchaseOrder; 
            PurchaseOrderDetails.purchaseOrderDetail = item.purchaseOrderDetail; 
            PurchaseOrderDetails.supplierDetails = item.supplierDetails; 
            PurchaseOrderDetails.measuringUnit = item.measuringUnit; 
            PurchaseOrderDetails.cumulativeQWuantity = loadTotalQuantityCustomizeService.loadTotalQuantity(item.purchaseOrderDetail.id, item.purchaseOrderDetail.material_code); 
            CommonFunctionUtil.add(PurchaseOrderDetailsList, CommonFunctionUtil.clone(PurchaseOrderDetails));
        } 

        result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9BDEEC62EBFE6F3A9DF1F8D2F7DB0077(), _bean954 -> {
    _bean954.list = PurchaseOrderDetailsList; 
    _bean954.total = variable1.param.total; 
} ); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadPurchaseOrderTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.purchaser", "`purchase_order`.`purchaser`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.orderNumber", "`purchase_order`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.supplier", "`purchase_order`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.orderDate", "`purchase_order`.`order_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.requiredDate", "`purchase_order`.`required_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.approvalStatus", "`purchase_order`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.executionStatus", "`purchase_order`.`execution_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.description", "`purchase_order`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.remarks", "`purchase_order`.`remarks`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.listPuchaseDetails", "`purchase_order`.`list_puchase_details`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.manuAuto", "`purchase_order`.`manu_auto`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.createdBy", "`purchase_order`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrder.purchaseDetailsIdList", "`purchase_order`.`purchase_details_id_list`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.id", "`supplier_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.createdTime", "`supplier_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.updatedTime", "`supplier_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.createdBy", "`supplier_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.updatedBy", "`supplier_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.remark", "`supplier_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplierDetails.supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrderDetail.id", "`purchase_order_detail`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrderDetail.material_code", "`purchase_order_detail`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrderDetail.orderQuantity", "`purchase_order_detail`.`order_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrderDetail.priceIncludingTax", "`purchase_order_detail`.`price_including_tax`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrderDetail.taxRate", "`purchase_order_detail`.`tax_rate`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrderDetail.relatedOrderNumber", "`purchase_order_detail`.`related_order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseOrderDetail.purchaseDetailsId", "`purchase_order_detail`.`purchase_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaser", "`purchase_order`.`purchaser`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("orderNumber", "`purchase_order`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("orderDate", "`purchase_order`.`order_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("requiredDate", "`purchase_order`.`required_date`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("approvalStatus", "`purchase_order`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("executionStatus", "`purchase_order`.`execution_status`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("remarks", "`purchase_order`.`remarks`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("listPuchaseDetails", "`purchase_order`.`list_puchase_details`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("manuAuto", "`purchase_order`.`manu_auto`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("createdBy", "`supplier_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseDetailsIdList", "`purchase_order`.`purchase_details_id_list`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("id", "`purchase_order_detail`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("createdTime", "`supplier_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("updatedTime", "`supplier_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("updatedBy", "`supplier_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("remark", "`supplier_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("material_code", "`purchase_order_detail`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("orderQuantity", "`purchase_order_detail`.`order_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("priceIncludingTax", "`purchase_order_detail`.`price_including_tax`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("taxRate", "`purchase_order_detail`.`tax_rate`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("relatedOrderNumber", "`purchase_order_detail`.`related_order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("purchaseDetailsId", "`purchase_order_detail`.`purchase_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6").put("unitName", "`measuring_unit`.`unit_name`");
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
