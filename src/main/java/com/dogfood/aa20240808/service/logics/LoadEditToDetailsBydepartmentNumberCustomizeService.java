package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3945FA2E6170A5D5AB3E7210310D8F81; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadEditToDetailsBydepartmentNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.ProductionMaterialRequisitionDetailsStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 点击编辑进入详情逻辑
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
public class LoadEditToDetailsBydepartmentNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadEditToDetailsBydepartmentNumberCustomizeServiceMapper loadEditToDetailsBydepartmentNumberCustomizeServiceMapper;

    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;

    @Autowired
    private LoadInventoryListBywareHouseAndCodeCustomizeService loadInventoryListBywareHouseAndCodeCustomizeService;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public List<ProductionMaterialRequisitionDetailsStructure> loadEditToDetailsBydepartmentNumber(String department_Number) {
        AnonymousStructure_3945FA2E6170A5D5AB3E7210310D8F81 variable1 = new AnonymousStructure_3945FA2E6170A5D5AB3E7210310D8F81();
        ProductionMaterialRequisitionDetailsStructure ProductionMaterialRequisitionDetails = new ProductionMaterialRequisitionDetailsStructure();
        InventoryEntity variable2 = new InventoryEntity();
        List<ProductionMaterialRequisitionDetailsStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(loadEditToDetailsBydepartmentNumberCustomizeServiceMapper.getAnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9(department_Number), loadEditToDetailsBydepartmentNumberCustomizeServiceMapper.countAnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9(department_Number).intValue(), AnonymousStructure_3945FA2E6170A5D5AB3E7210310D8F81.class); 
        for (Long index = 0L; index < variable1.list.size(); index++) {
            AnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9 item = variable1.list.get(index.intValue());
            ProductionMaterialRequisitionDetails.productionMaterialRequisitionDetails = item.productionMaterialRequisitionDetails; 
            ProductionMaterialRequisitionDetails.material = item.materialDetails; 
            ProductionMaterialRequisitionDetails.unitName = item.measuringUnit; 
            ProductionMaterialRequisitionDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item.productionMaterialRequisitionDetails.materialCode); 
            ProductionMaterialRequisitionDetails.inventoryList = loadInventoryListBywareHouseAndCodeCustomizeService.loadInventoryListBywareHouseAndCode(item.productionMaterialRequisitionDetails.warehouse, item.productionMaterialRequisitionDetails.materialCode).List; 
            variable2 = inventoryEntityService.get(item.productionMaterialRequisitionDetails.batchNumber); 
            ProductionMaterialRequisitionDetails.inventory = (variable2.stockQuantity.subtract(variable2.occupiedQuantity)); 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(ProductionMaterialRequisitionDetails));
        } 

        return result;
    } 

}
