package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.UpdateInventoryByProductReutrnS1CustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新库存在委托加工入库退回
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
public class UpdateInventoryByProductReutrnS1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByProductReutrnS1CustomizeServiceMapper updateInventoryByProductReutrnS1CustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByProductReutrnS1(String outsourceReturnCode, Boolean addOrReduce) {
        List<AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E> variable1 = new ArrayList<>();
        List<AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E> variable2 = new ArrayList<>();
        Boolean variable3 = false;
        variable1 = updateInventoryByProductReutrnS1CustomizeServiceMapper.getAnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E(outsourceReturnCode); 
        CommonFunctionUtil.clear(variable2, "shallow");
        for (Long index = 0L; index < variable1.size(); index++) {
            AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E item = variable1.get(index.intValue());
            variable3 = false; 
            if (CommonFunctionUtil.hasValue(item.inventory.lotNumber, item.outsourceInStorageDetails.lotNumber)) {
            } else {
                variable3 = true; 
                item.inventory.lotNumber = "123"; 
                item.outsourceInStorageDetails.lotNumber = "123"; 
            } 

            if (((CommonFunctionUtil.equals(item.inventory.lotNumber, item.outsourceInStorageDetails.lotNumber)) && ((CommonFunctionUtil.equals(item.inventory.warehouse, item.outsourceInStorageDetails.warehouseId)) && (CommonFunctionUtil.equals(item.inventory.location, item.outsourceInStorageDetails.storageLocationId))))) {
                if (variable3) {
                    item.inventory.lotNumber = null; 
                    item.outsourceInStorageDetails.lotNumber = null; 
                } else {
                } 

                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item));
            } else {
            } 

        } 

        if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable2.size(); index++) {
                AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E item = variable2.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.outsourceReturnStorageDetails.quantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.outsourceReturnStorageDetails.quantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable2, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 

}
