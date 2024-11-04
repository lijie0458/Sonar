package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.SaleOrderListStructure; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LoadSalesOrderPageTableView_2CustomizeServiceMapper; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class LoadSalesOrderPageTableView_2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadquantityShippedByDetailsIdCustomizeService loadquantityShippedByDetailsIdCustomizeService;
    @Autowired
    private LoadoutboundQuantityByDetailsId1CustomizeService loadoutboundQuantityByDetailsId1CustomizeService;
    @Autowired
    private LoadSalesOrderPageTableView_2CustomizeServiceMapper loadSalesOrderPageTableView_2CustomizeServiceMapper;
    public List<SaleOrderListStructure> loadSalesOrderPageTableView_2(Long page, Long size, String sort, String order, SalesOrdersEntity filter, DistinctionEnumEnum DistinctionEnum, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        SaleOrderListStructure salesOrderList = new SaleOrderListStructure();
        List<SaleOrderListStructure> salesOrderLists = new ArrayList<>();
        Map<Long, BigDecimal> Map = new HashMap<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626> ListDetailsId = new ArrayList<>();
        Map<Long, BigDecimal> Map2 = new HashMap<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_89F444DCB36F3A425473660EC2B0814E> variable1 = new ArrayList<>();
        List<SaleOrderListStructure> result = new ArrayList<>();
        Map = CommonFunctionUtil.listToMap(loadquantityShippedByDetailsIdCustomizeService.loadquantityShippedByDetailsId(), (item) -> item.salesOrderDetailsId, (item) -> item.sum); 
        ListDetailsId = loadoutboundQuantityByDetailsId1CustomizeService.loadoutboundQuantityByDetailsId1(); 
        if ((CommonFunctionUtil.length(ListDetailsId).compareTo(0L) > 0)) {
            Map2 = CommonFunctionUtil.listToMap(ListDetailsId, (item) -> item.salesOrderDetailsId, (item) -> item.sum); 
        } else {
        } 

        variable1 = loadSalesOrderPageTableView_2CustomizeServiceMapper.getAnonymousStructure_89F444DCB36F3A425473660EC2B0814E(filter, DistinctionEnum, dataViewAuthorityUserNameList, TimeHorizon, getTableField("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E", sort), order); 
        for (Long index = 0L; index < variable1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_89F444DCB36F3A425473660EC2B0814E item = variable1.get(index.intValue());
            salesOrderList.salesOrders = item.salesOrders; 
            salesOrderList.customerManagement = item.customerManagement; 
            salesOrderList.user = item.lCAPUser; 
            salesOrderList.department = item.department; 
            salesOrderList.salesOrderDetails = item.salesOrderDetails; 
            salesOrderList.materialDetails = item.materialDetails; 
            salesOrderList.measuringUnit = item.measuringUnit; 
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.mapGet(Map2, item.salesOrderDetails.id), null))) {
                salesOrderList.unshippedQuantity = new BigDecimal(0L); 
            } else {
                salesOrderList.unshippedQuantity = CommonFunctionUtil.mapGet(Map2, item.salesOrderDetails.id); 
            } 

            CommonFunctionUtil.add(salesOrderLists, CommonFunctionUtil.clone(salesOrderList));
        } 

        result = salesOrderLists; 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadSalesOrderPageTableView_2CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.orderNumber", "`sales_orders`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.customer", "`sales_orders`.`customer`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.salesperson", "`sales_orders`.`salesperson`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.department", "`sales_orders`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.requestDate", "`sales_orders`.`request_date`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.summary", "`sales_orders`.`summary`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.attachment", "`sales_orders`.`attachment`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.approvalStatus", "`sales_orders`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.distinction", "`sales_orders`.`distinction`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.warehouse", "`sales_orders`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.manuAuto", "`sales_orders`.`manu_auto`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.sourceNumber", "`sales_orders`.`source_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.salesman", "`sales_orders`.`salesman`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrders.createdBy", "`sales_orders`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.id", "`customer_management`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.createdTime", "`customer_management`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.updatedTime", "`customer_management`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.createdBy", "`customer_management`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.updatedBy", "`customer_management`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.customerCode", "`customer_management`.`customer_code`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.customerName", "`customer_management`.`customer_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.linkMan", "`customer_management`.`link_man`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.contactNumber", "`customer_management`.`contact_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.address", "`customer_management`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerManagement.detailedAddress", "`customer_management`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.id", "`sales_order_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.materialCode", "`sales_order_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.quantity", "`sales_order_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.unitPrice", "`sales_order_details`.`unit_price`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.deliveryDate", "`sales_order_details`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.notes", "`sales_order_details`.`notes`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.salesOrderNumber", "`sales_order_details`.`sales_order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.warehouse", "`sales_order_details`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.quantityShipped", "`sales_order_details`.`quantity_shipped`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.salesOrderDetailsId", "`sales_order_details`.`sales_order_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.batchNumber", "`sales_order_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.outboundQuantity", "`sales_order_details`.`outbound_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.returnQuanTity", "`sales_order_details`.`return_quan_tity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetails.availableQuantity", "`sales_order_details`.`available_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("orderNumber", "`sales_orders`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customer", "`sales_orders`.`customer`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesperson", "`sales_orders`.`salesperson`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department", "`sales_orders`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("requestDate", "`sales_orders`.`request_date`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("summary", "`sales_orders`.`summary`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("attachment", "`sales_orders`.`attachment`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("approvalStatus", "`sales_orders`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("distinction", "`sales_orders`.`distinction`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("warehouse", "`sales_order_details`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("manuAuto", "`sales_orders`.`manu_auto`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("sourceNumber", "`sales_orders`.`source_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesman", "`sales_orders`.`salesman`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("createdBy", "`customer_management`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("id", "`customer_management`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("createdTime", "`customer_management`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("updatedTime", "`customer_management`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("updatedBy", "`customer_management`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerCode", "`customer_management`.`customer_code`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("customerName", "`customer_management`.`customer_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("linkMan", "`customer_management`.`link_man`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("contactNumber", "`customer_management`.`contact_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("address", "`customer_management`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("detailedAddress", "`customer_management`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("materialCode", "`sales_order_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("quantity", "`sales_order_details`.`quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("unitPrice", "`sales_order_details`.`unit_price`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("deliveryDate", "`sales_order_details`.`delivery_date`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("notes", "`sales_order_details`.`notes`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderNumber", "`sales_order_details`.`sales_order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("quantityShipped", "`sales_order_details`.`quantity_shipped`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("salesOrderDetailsId", "`sales_order_details`.`sales_order_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("batchNumber", "`sales_order_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("outboundQuantity", "`sales_order_details`.`outbound_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("returnQuanTity", "`sales_order_details`.`return_quan_tity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("availableQuantity", "`sales_order_details`.`available_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_89F444DCB36F3A425473660EC2B0814E").put("unitName", "`measuring_unit`.`unit_name`");
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
