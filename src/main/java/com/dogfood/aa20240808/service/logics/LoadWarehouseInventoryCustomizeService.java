package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.WarehouseinventoryStructure; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 处理仓库模块的库存加减-cmk
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
public class LoadWarehouseInventoryCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public List<InventoryEntity> loadWarehouseInventory(List<WarehouseinventoryStructure> Warehouseinventory, DistinctionEnumEnum DistinctionEnum) {
        InventoryEntity inventory = new InventoryEntity();
        List<InventoryEntity> List = new ArrayList<>();
        List<InventoryEntity> result = new ArrayList<>();
        if ((((CommonFunctionUtil.equals(DistinctionEnum, DistinctionEnumEnum.FIELD_DRAW)) || (CommonFunctionUtil.equals(DistinctionEnum, DistinctionEnumEnum.FIELD_JOUT))) || (CommonFunctionUtil.equals(DistinctionEnum, DistinctionEnumEnum.FIELD_QOUT)))) {
            for (Long index = 0L; index < Warehouseinventory.size(); index++) {
                WarehouseinventoryStructure item = Warehouseinventory.get(index.intValue());
                inventory = inventoryEntityService.get(item.batchNumberId); 
                inventory.stockQuantity = (inventory.stockQuantity.subtract(item.number)); 
                CommonFunctionUtil.add(List, CommonFunctionUtil.clone(inventory));
            } 

        } else {
            for (Long index = 0L; index < Warehouseinventory.size(); index++) {
                WarehouseinventoryStructure item = Warehouseinventory.get(index.intValue());
                inventory = inventoryEntityService.get(item.batchNumberId); 
                inventory.stockQuantity = (inventory.stockQuantity.add(item.number)); 
                CommonFunctionUtil.add(List, CommonFunctionUtil.clone(inventory));
            } 

        } 

        result = inventoryEntityService.batchUpdate(List, null); 
        return result;
    } 

}
