package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import com.dogfood.aa20240808.repository.UpdateInventoryByOtherReutrnStorageCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class UpdateInventoryByOtherReutrnStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdateInventoryByOtherReutrnStorageCustomizeServiceMapper updateInventoryByOtherReutrnStorageCustomizeServiceMapper;
    @Autowired
    private InventoryEntityService inventoryEntityService;
    public void updateInventoryByOtherReutrnStorage(String otherReturnCode, Boolean addOrReduce) {
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0341EC3B00E60806B08330B31078BA33> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0341EC3B00E60806B08330B31078BA33());
        variable1.param = CommonFunctionUtil.createListPage(updateInventoryByOtherReutrnStorageCustomizeServiceMapper.getAnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283(otherReturnCode), updateInventoryByOtherReutrnStorageCustomizeServiceMapper.countAnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283(otherReturnCode).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0341EC3B00E60806B08330B31078BA33.class); 
        if ((variable1.param.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.param.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283 item = variable1.param.list.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.otherReturnStorageDetails.quantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.otherReturnStorageDetails.quantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.param.list, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 


}
