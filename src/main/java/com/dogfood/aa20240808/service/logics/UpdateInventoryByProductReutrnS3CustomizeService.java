package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.UpdateInventoryByProductReutrnS3CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class UpdateInventoryByProductReutrnS3CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdateInventoryByProductReutrnS3CustomizeServiceMapper updateInventoryByProductReutrnS3CustomizeServiceMapper;
    @Autowired
    private InventoryEntityService inventoryEntityService;
    public void updateInventoryByProductReutrnS3(String goodsReturnCode, Boolean addOrReduce) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7> variable1 = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7> variable2 = new ArrayList<>();
        Boolean variable3 = false;
        variable1 = updateInventoryByProductReutrnS3CustomizeServiceMapper.getAnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7(goodsReturnCode); 
        CommonFunctionUtil.clear(variable2);
        for (Long index = 0L; index < variable1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7 item = variable1.get(index.intValue());
            variable3 = false; 
            if (CommonFunctionUtil.hasValue(item.inventory.lotNumber, item.bePutInStorageDetails.batchNumber)) {
            } else {
                variable3 = true; 
                item.inventory.lotNumber = "123"; 
                item.bePutInStorageDetails.batchNumber = "123"; 
            } 

            if (((CommonFunctionUtil.equals(item.inventory.lotNumber, item.bePutInStorageDetails.batchNumber)) && (CommonFunctionUtil.equals(item.inventory.warehouse, item.bePutInStorage.warehouse)))) {
                if (variable3) {
                    item.inventory.lotNumber = null; 
                    item.bePutInStorageDetails.batchNumber = null; 
                } else {
                } 

                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item));
            } else {
            } 

        } 

        if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable2.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7 item = variable2.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.goodsReturnedNoteDetails.bePutInStorageQuantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.goodsReturnedNoteDetails.bePutInStorageQuantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable2, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 


}
