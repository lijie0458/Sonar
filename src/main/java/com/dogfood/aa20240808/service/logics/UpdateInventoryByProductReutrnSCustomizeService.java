package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.UpdateInventoryByProductReutrnSCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_12F96C5D8E74852BD6835250199AD981; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新库存在产品入库退回-ljl
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
public class UpdateInventoryByProductReutrnSCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByProductReutrnSCustomizeServiceMapper updateInventoryByProductReutrnSCustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByProductReutrnS(String productReturnCode, Boolean addOrReduce) {
        List<AnonymousStructure_12F96C5D8E74852BD6835250199AD981> variable1 = new ArrayList<>();
        List<AnonymousStructure_12F96C5D8E74852BD6835250199AD981> variable2 = new ArrayList<>();
        Boolean variable3 = false;
        variable1 = updateInventoryByProductReutrnSCustomizeServiceMapper.getAnonymousStructure_12F96C5D8E74852BD6835250199AD981(productReturnCode); 
        CommonFunctionUtil.clear(variable2, "shallow");
        for (Long index = 0L; index < variable1.size(); index++) {
            AnonymousStructure_12F96C5D8E74852BD6835250199AD981 item = variable1.get(index.intValue());
            variable3 = false; 
            if (CommonFunctionUtil.hasValue(item.inventory.lotNumber, item.productInStorageDetails.lotNumber)) {
            } else {
                variable3 = true; 
                item.inventory.lotNumber = "123"; 
                item.productInStorageDetails.lotNumber = "123"; 
            } 

            if (((CommonFunctionUtil.equals(item.inventory.lotNumber, item.productInStorageDetails.lotNumber)) && ((CommonFunctionUtil.equals(item.inventory.warehouse, item.productInStorageDetails.warehouseId)) && (CommonFunctionUtil.equals(item.inventory.location, item.productInStorageDetails.storageLocationId))))) {
                if (variable3) {
                    item.inventory.lotNumber = null; 
                    item.inventory.lotNumber = null; 
                } else {
                } 

                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item));
            } else {
            } 

        } 

        if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable2.size(); index++) {
                AnonymousStructure_12F96C5D8E74852BD6835250199AD981 item = variable2.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.productReturnStorageDetails.quantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.productReturnStorageDetails.quantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable2, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 

}
