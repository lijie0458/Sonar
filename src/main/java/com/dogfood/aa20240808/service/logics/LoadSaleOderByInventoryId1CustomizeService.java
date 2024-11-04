package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.SaleOrderDetailStrutureStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LoadSaleOderByInventoryId1CustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class LoadSaleOderByInventoryId1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadSaleOderByInventoryId1CustomizeServiceMapper loadSaleOderByInventoryId1CustomizeServiceMapper;
    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;
    @Autowired
    private LoadBathNumberByCodeAnddistinction1CustomizeService loadBathNumberByCodeAnddistinction1CustomizeService;
    @Autowired
    private LoadDeliveryReleaseDetailsSelect_15CustomizeService loadDeliveryReleaseDetailsSelect_15CustomizeService;
    public List<SaleOrderDetailStrutureStructure> loadSaleOderByInventoryId1(List<Long> param1) {
        SaleOrderDetailStrutureStructure SaleOrderDetails = new SaleOrderDetailStrutureStructure();
        List<InventoryEntity> variable2 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0770061126AE9E1D3FA90E242933E841 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0770061126AE9E1D3FA90E242933E841();
        List<SaleOrderDetailStrutureStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(loadSaleOderByInventoryId1CustomizeServiceMapper.getAnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A(param1), loadSaleOderByInventoryId1CustomizeServiceMapper.countAnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0770061126AE9E1D3FA90E242933E841.class); 
        for (Long index = 0L; index < variable1.list.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A item = variable1.list.get(index.intValue());
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.createListPage(loadSaleOderByInventoryId1CustomizeServiceMapper.getAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788(item), loadSaleOderByInventoryId1CustomizeServiceMapper.countAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788(item).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF21B87E62234B67E6B30D199A60032F.class).total, 0L))) {
                SaleOrderDetails.unshippedQuantity = new BigDecimal(0L); 
            } else {
                SaleOrderDetails.unshippedQuantity = loadSaleOderByInventoryId1CustomizeServiceMapper.getStructure1(item); 
            } 

            SaleOrderDetails.saleOrderDetails = item.salesOrderDetails; 
            SaleOrderDetails.name = item.materialDetails; 
            SaleOrderDetails.sp = item.materialDetails.specification; 
            SaleOrderDetails.unitname = item.measuringUnit.unitName; 
            SaleOrderDetails.inventory = (item.inventory.stockQuantity.subtract(item.inventory.occupiedQuantity)); 
            SaleOrderDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item.salesOrderDetails.materialCode); 
            List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> currentLcpEachName_1 = loadBathNumberByCodeAnddistinction1CustomizeService.loadBathNumberByCodeAnddistinction1(item.salesOrderDetails.materialCode, item.salesOrderDetails.warehouse, loadDeliveryReleaseDetailsSelect_15CustomizeService.loadDeliveryReleaseDetailsSelect_15(item.salesOrderDetails.warehouse).id).list;
            for (Long index1 = 0L; index1 < currentLcpEachName_1.size(); index1++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 item1 = currentLcpEachName_1.get(index1.intValue());
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item1.inventory));
            } 

            SaleOrderDetails.inventoryList = variable2; 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(SaleOrderDetails));
        } 

        return result;
    } 


}
