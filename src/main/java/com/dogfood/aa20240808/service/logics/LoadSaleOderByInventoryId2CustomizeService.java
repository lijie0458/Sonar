package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadSaleOderByInventoryId2CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.ProductionMaterialRequisitionDetailsStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadSaleOderByInventoryId2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadSaleOderByInventoryId2CustomizeServiceMapper loadSaleOderByInventoryId2CustomizeServiceMapper;
    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;
    @Autowired
    private LoadBathNumberByCodeAnddistinction1CustomizeService loadBathNumberByCodeAnddistinction1CustomizeService;
    @Autowired
    private LoadDeliveryReleaseDetailsSelect_15CustomizeService loadDeliveryReleaseDetailsSelect_15CustomizeService;
    public List<ProductionMaterialRequisitionDetailsStructure> loadSaleOderByInventoryId2(List<Long> param1) {
        ProductionMaterialRequisitionDetailsStructure ProductionMaterialRequisitionDetails = new ProductionMaterialRequisitionDetailsStructure();
        List<InventoryEntity> variable2 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_BFB6AEF8F0ADB64115D2950818CD63FF variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_BFB6AEF8F0ADB64115D2950818CD63FF();
        List<ProductionMaterialRequisitionDetailsStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(loadSaleOderByInventoryId2CustomizeServiceMapper.getAnonymousStructure_A11152A0305D954062AEE1E2D51653C2(param1), loadSaleOderByInventoryId2CustomizeServiceMapper.countAnonymousStructure_A11152A0305D954062AEE1E2D51653C2(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_BFB6AEF8F0ADB64115D2950818CD63FF.class); 
        for (Long index = 0L; index < variable1.list.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A11152A0305D954062AEE1E2D51653C2 item = variable1.list.get(index.intValue());
            ProductionMaterialRequisitionDetails.retrunQuerty = loadSaleOderByInventoryId2CustomizeServiceMapper.getStructure1(item); 
            ProductionMaterialRequisitionDetails.productionMaterialRequisitionDetails = item.productionMaterialRequisitionDetails; 
            ProductionMaterialRequisitionDetails.material = item.materialDetails; 
            ProductionMaterialRequisitionDetails.unitName = item.measuringUnit; 
            ProductionMaterialRequisitionDetails.inventory = (item.inventory.stockQuantity.subtract(item.inventory.occupiedQuantity)); 
            ProductionMaterialRequisitionDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item.productionMaterialRequisitionDetails.materialCode); 
            List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> currentLcpEachName_1 = loadBathNumberByCodeAnddistinction1CustomizeService.loadBathNumberByCodeAnddistinction1(item.productionMaterialRequisitionDetails.materialCode, item.productionMaterialRequisitionDetails.warehouse, loadDeliveryReleaseDetailsSelect_15CustomizeService.loadDeliveryReleaseDetailsSelect_15(item.productionMaterialRequisitionDetails.warehouse).id).list;
            for (Long index1 = 0L; index1 < currentLcpEachName_1.size(); index1++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 item1 = currentLcpEachName_1.get(index1.intValue());
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item1.inventory));
            } 

            ProductionMaterialRequisitionDetails.inventoryList = variable2; 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(ProductionMaterialRequisitionDetails));
        } 

        return result;
    } 


}
