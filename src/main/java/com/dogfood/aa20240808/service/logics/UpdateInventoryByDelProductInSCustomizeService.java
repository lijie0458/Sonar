package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.UpdateInventoryByDelProductInSCustomizeServiceMapper; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class UpdateInventoryByDelProductInSCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdateInventoryByDelProductInSCustomizeServiceMapper updateInventoryByDelProductInSCustomizeServiceMapper;
    @Autowired
    private InventoryEntityService inventoryEntityService;
    public void updateInventoryByDelProductInS(String productInSNum) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_13755BF9F5DF567B2A0EEEB6FF223E6A variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_13755BF9F5DF567B2A0EEEB6FF223E6A();
        List<InventoryEntity> updateList = new ArrayList<>();
        List<Long> delList = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(updateInventoryByDelProductInSCustomizeServiceMapper.getAnonymousStructure_551A796780D99168E3E45C648EE58217(productInSNum), updateInventoryByDelProductInSCustomizeServiceMapper.countAnonymousStructure_551A796780D99168E3E45C648EE58217(productInSNum).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_13755BF9F5DF567B2A0EEEB6FF223E6A.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_551A796780D99168E3E45C648EE58217 item = variable1.list.get(index.intValue());
                item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.productInStorageDetails.quantity)); 
                if ((item.inventory.stockQuantity.compareTo(new BigDecimal(0L)) == 1)) {
                    CommonFunctionUtil.add(updateList, item.inventory);
                } else {
                    CommonFunctionUtil.add(delList, item.inventory.id);
                } 

            } 

            if ((CommonFunctionUtil.length(updateList).compareTo(0L) > 0)) {
                inventoryEntityService.batchUpdate(updateList, Arrays.asList("id", "stockQuantity"));
            } else {
            } 

            if ((CommonFunctionUtil.length(delList).compareTo(0L) > 0)) {
                inventoryEntityService.batchDelete(delList);
            } else {
            } 

        } else {
        } 

        return ;
    } 


}
