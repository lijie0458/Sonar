package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.entities.MeasuringUnitEntityService; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.ProductionMaterialRequisitionDetailsStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 
import com.dogfood.aa20240808.service.entities.MaterialDetailsEntityService; 

@Service
public class LoadProductionDetailByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private MaterialDetailsEntityService materialDetailsEntityService;
    @Autowired
    private MeasuringUnitEntityService measuringUnitEntityService;
    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;
    @Autowired
    private LoadTotalByCodeCustomizeService loadTotalByCodeCustomizeService;
    public List<ProductionMaterialRequisitionDetailsStructure> loadProductionDetailByCode(List<String> InventoryList) {
        ProductionMaterialRequisitionDetailsStructure ProductionMaterialRequisitionDetails = new ProductionMaterialRequisitionDetailsStructure();
        List<ProductionMaterialRequisitionDetailsStructure> result = new ArrayList<>();
        for (Long index = 0L; index < InventoryList.size(); index++) {
            String item = InventoryList.get(index.intValue());
            ProductionMaterialRequisitionDetails.material = materialDetailsEntityService.get(item); 
            ProductionMaterialRequisitionDetails.unitName = measuringUnitEntityService.get(ProductionMaterialRequisitionDetails.material.unit); 
            ProductionMaterialRequisitionDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item); 
            ProductionMaterialRequisitionDetails.productionMaterialRequisitionDetails = CommonFunctionUtil.New(ProductionMaterialRequisitionDetailsEntity.class); 
            ProductionMaterialRequisitionDetails.productionMaterialRequisitionDetails.materialCode = ProductionMaterialRequisitionDetails.material.materialCode; 
            ProductionMaterialRequisitionDetails.inventory = loadTotalByCodeCustomizeService.loadTotalByCode(item); 
            if ((CommonFunctionUtil.equals(ProductionMaterialRequisitionDetails.inventory, null))) {
                ProductionMaterialRequisitionDetails.inventory = new BigDecimal(0L); 
            } else {
            } 

            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(ProductionMaterialRequisitionDetails));
        } 

        return result;
    } 


}
