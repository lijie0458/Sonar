package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.UpdateInventoryByProductReutrnS2CustomizeServiceMapper; 

/**
 * 更新库存在其他入库退回
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
public class UpdateInventoryByProductReutrnS2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByProductReutrnS2CustomizeServiceMapper updateInventoryByProductReutrnS2CustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByProductReutrnS2(String otherReturnCode, Boolean addOrReduce) {
        List<AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283> variable1 = new ArrayList<>();
        List<AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283> variable2 = new ArrayList<>();
        Boolean variable3 = false;
        variable1 = updateInventoryByProductReutrnS2CustomizeServiceMapper.getAnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283(otherReturnCode); 
        CommonFunctionUtil.clear(variable2, "shallow");
        for (Long index = 0L; index < variable1.size(); index++) {
            AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283 item = variable1.get(index.intValue());
            variable3 = false; 
            if (CommonFunctionUtil.hasValue(item.inventory.lotNumber, item.otherInStorageDetails.lotNumber)) {
            } else {
                variable3 = true; 
                item.inventory.lotNumber = "123"; 
                item.otherInStorageDetails.lotNumber = "123"; 
            } 

            if (((CommonFunctionUtil.equals(item.inventory.lotNumber, item.otherInStorageDetails.lotNumber)) && ((CommonFunctionUtil.equals(item.inventory.warehouse, item.otherInStorageDetails.warehouseId)) && (CommonFunctionUtil.equals(item.inventory.location, item.otherInStorageDetails.storageLocationId))))) {
                if (variable3) {
                    item.inventory.lotNumber = null; 
                    item.otherInStorageDetails.lotNumber = null; 
                } else {
                } 

                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item));
            } else {
            } 

        } 

        if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable2.size(); index++) {
                AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283 item = variable2.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.otherReturnStorageDetails.quantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.otherReturnStorageDetails.quantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable2, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 

}
