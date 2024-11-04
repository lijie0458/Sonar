package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.SaleOrderDetailStrutureStructure; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 
import com.dogfood.aa20240808.service.entities.SalesOrderDetailsEntityService; 

@Service
public class LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeServiceMapper loadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeServiceMapper;
    @Autowired
    private LoadoutboundQuantityByDetailsId1CustomizeService loadoutboundQuantityByDetailsId1CustomizeService;
    @Autowired
    private LoadSaleOderByInventoryIdCustomizeService loadSaleOderByInventoryIdCustomizeService;
    @Autowired
    private GetStoragelocationByStorageCustomizeService getStoragelocationByStorageCustomizeService;
    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;
    @Autowired
    private InventoryEntityService inventoryEntityService;
    @Autowired
    private LoadBathNumberByCodeAnddistinction1CustomizeService loadBathNumberByCodeAnddistinction1CustomizeService;
    @Autowired
    private LoadDeliveryReleaseDetailsSelect_15CustomizeService loadDeliveryReleaseDetailsSelect_15CustomizeService;
    @Autowired
    private LoadCountInventoryByCodeAndWahouseCustomizeService loadCountInventoryByCodeAndWahouseCustomizeService;
    @Autowired
    private LoadUnshippedQuantityCustomizeService loadUnshippedQuantityCustomizeService;
    @Autowired
    private SalesOrderDetailsEntityService salesOrderDetailsEntityService;
    public List<SaleOrderDetailStrutureStructure> loadXOUTsaleOrdersDetailsBySaleOrderNum(String request_number, Boolean isUpdate) {
        List<SaleOrderDetailStrutureStructure> List = new ArrayList<>();
        SaleOrderDetailStrutureStructure saleOrderDetails = new SaleOrderDetailStrutureStructure();
        LambdaParamWrapper<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_873CF28DE5093DD1906C2E345F84CE28>> variable1 = new LambdaParamWrapper<>(new ArrayList<>());
        Map<String, BigDecimal> Map = new HashMap<>();
        List<InventoryEntity> variable2 = new ArrayList<>();
        Map<Long, BigDecimal> Map2 = new HashMap<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626> ListDetailsId = new ArrayList<>();
        InventoryEntity variable3 = new InventoryEntity();
        Storage_locationEntity variable4 = new Storage_locationEntity();
        List<SaleOrderDetailStrutureStructure> result = new ArrayList<>();
        variable1.param = CommonFunctionUtil.createListPage(loadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeServiceMapper.getAnonymousStructure_873CF28DE5093DD1906C2E345F84CE28(request_number), loadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeServiceMapper.countAnonymousStructure_873CF28DE5093DD1906C2E345F84CE28(request_number).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C6F46AF0646F4C6D829DCCDE2CD5BDDD.class).list; 
        ListDetailsId = loadoutboundQuantityByDetailsId1CustomizeService.loadoutboundQuantityByDetailsId1(); 
        if ((CommonFunctionUtil.length(ListDetailsId).compareTo(0L) > 0)) {
            Map2 = CommonFunctionUtil.listToMap(ListDetailsId, (item) -> item.salesOrderDetailsId, (item) -> item.sum); 
        } else {
        } 

        Map = CommonFunctionUtil.listToMap(loadSaleOderByInventoryIdCustomizeService.loadSaleOderByInventoryId(CommonFunctionUtil.listTransform(variable1.param, (item) -> item.salesOrderDetails.materialCode)), (item) -> item.materialCode, (item) -> item.total); 
        for (Long index = 0L; index < variable1.param.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_873CF28DE5093DD1906C2E345F84CE28 item = variable1.param.get(index.intValue());
            if ((CommonFunctionUtil.equals(isUpdate, null))) {
                if ((CommonFunctionUtil.equals(CommonFunctionUtil.mapGet(Map2, item.salesOrderDetails.id), null))) {
                    saleOrderDetails.unshippedQuantity = new BigDecimal(0L); 
                } else {
                    saleOrderDetails.unshippedQuantity = CommonFunctionUtil.mapGet(Map2, item.salesOrderDetails.id); 
                } 

                if ((saleOrderDetails.unshippedQuantity.compareTo(item.salesOrderDetails.quantityShipped) == -1)) {
                    saleOrderDetails.saleOrderDetails = item.salesOrderDetails; 
                    if (CommonFunctionUtil.hasValue(saleOrderDetails.saleOrderDetails.warehouse)) {
                        variable4 = CommonFunctionUtil.listHead(getStoragelocationByStorageCustomizeService.getStoragelocationByStorage(saleOrderDetails.saleOrderDetails.warehouse)); 
                        saleOrderDetails.location = variable4.location_name; 
                    } else {
                    } 

                    saleOrderDetails.name = item.materialDetails; 
                    saleOrderDetails.sp = item.materialDetails.specification; 
                    saleOrderDetails.unitname = item.measuringUnit.unitName; 
                    saleOrderDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item.salesOrderDetails.materialCode); 
                    if (saleOrderDetails.name.is_batch_enabled) {
                        variable3 = inventoryEntityService.get(item.salesOrderDetails.batchNumber); 
                        saleOrderDetails.inventory = (variable3.stockQuantity.subtract(variable3.occupiedQuantity)); 
                        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> currentLcpEachName_1 = loadBathNumberByCodeAnddistinction1CustomizeService.loadBathNumberByCodeAnddistinction1(item.salesOrderDetails.materialCode, item.salesOrderDetails.warehouse, loadDeliveryReleaseDetailsSelect_15CustomizeService.loadDeliveryReleaseDetailsSelect_15(item.salesOrderDetails.warehouse).id).list;
                        for (Long index1 = 0L; index1 < currentLcpEachName_1.size(); index1++) {
                            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 item1 = currentLcpEachName_1.get(index1.intValue());
                            CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item1.inventory));
                        } 

                        saleOrderDetails.inventoryList = CommonFunctionUtil.clone(variable2); 
                    } else {
                        saleOrderDetails.inventory = loadCountInventoryByCodeAndWahouseCustomizeService.loadCountInventoryByCodeAndWahouse(saleOrderDetails.saleOrderDetails.warehouse, saleOrderDetails.saleOrderDetails.materialCode).total; 
                    } 

                    CommonFunctionUtil.add(List, CommonFunctionUtil.clone(saleOrderDetails));
                } else {
                } 

            } else {
                if (isUpdate) {
                    saleOrderDetails.saleOrderDetails = item.salesOrderDetails; 
                    if (CommonFunctionUtil.hasValue(saleOrderDetails.saleOrderDetails.warehouse)) {
                        variable4 = CommonFunctionUtil.listHead(getStoragelocationByStorageCustomizeService.getStoragelocationByStorage(saleOrderDetails.saleOrderDetails.warehouse)); 
                        saleOrderDetails.location = variable4.location_name; 
                    } else {
                    } 

                    saleOrderDetails.name = item.materialDetails; 
                    saleOrderDetails.sp = item.materialDetails.specification; 
                    saleOrderDetails.unitname = item.measuringUnit.unitName; 
                    saleOrderDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item.salesOrderDetails.materialCode); 
                    if (saleOrderDetails.name.is_batch_enabled) {
                        variable3 = inventoryEntityService.get(item.salesOrderDetails.batchNumber); 
                        saleOrderDetails.inventory = (variable3.stockQuantity.subtract(variable3.occupiedQuantity)); 
                        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> currentLcpEachName_2 = loadBathNumberByCodeAnddistinction1CustomizeService.loadBathNumberByCodeAnddistinction1(item.salesOrderDetails.materialCode, item.salesOrderDetails.warehouse, loadDeliveryReleaseDetailsSelect_15CustomizeService.loadDeliveryReleaseDetailsSelect_15(item.salesOrderDetails.warehouse).id).list;
                        for (Long index1 = 0L; index1 < currentLcpEachName_2.size(); index1++) {
                            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 item1 = currentLcpEachName_2.get(index1.intValue());
                            CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item1.inventory));
                        } 

                        saleOrderDetails.inventoryList = CommonFunctionUtil.clone(variable2); 
                    } else {
                        saleOrderDetails.inventory = loadCountInventoryByCodeAndWahouseCustomizeService.loadCountInventoryByCodeAndWahouse(saleOrderDetails.saleOrderDetails.warehouse, saleOrderDetails.saleOrderDetails.materialCode).total; 
                    } 

                    saleOrderDetails.unshippedQuantity = loadUnshippedQuantityCustomizeService.loadUnshippedQuantity(salesOrderDetailsEntityService.get(item.salesOrderDetails.id).salesOrderDetailsId, item.salesOrderDetails.id); 
                    CommonFunctionUtil.add(List, CommonFunctionUtil.clone(saleOrderDetails));
                } else {
                    saleOrderDetails.saleOrderDetails = item.salesOrderDetails; 
                    if (CommonFunctionUtil.hasValue(saleOrderDetails.saleOrderDetails.warehouse)) {
                        variable4 = CommonFunctionUtil.listHead(getStoragelocationByStorageCustomizeService.getStoragelocationByStorage(saleOrderDetails.saleOrderDetails.warehouse)); 
                        saleOrderDetails.location = variable4.location_name; 
                    } else {
                    } 

                    saleOrderDetails.name = item.materialDetails; 
                    saleOrderDetails.sp = item.materialDetails.specification; 
                    saleOrderDetails.unitname = item.measuringUnit.unitName; 
                    saleOrderDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item.salesOrderDetails.materialCode); 
                    saleOrderDetails.inventory = CommonFunctionUtil.mapGet(Map, item.salesOrderDetails.materialCode); 
                    CommonFunctionUtil.add(List, CommonFunctionUtil.clone(saleOrderDetails));
                } 

            } 

        } 

        result = CommonFunctionUtil.clone(List); 
        return result;
    } 


}
