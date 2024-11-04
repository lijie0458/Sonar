package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import com.dogfood.aa20240808.repository.UpdateInventoryByOutsourceReutrnStorageCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class UpdateInventoryByOutsourceReutrnStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdateInventoryByOutsourceReutrnStorageCustomizeServiceMapper updateInventoryByOutsourceReutrnStorageCustomizeServiceMapper;
    @Autowired
    private InventoryEntityService inventoryEntityService;
    public void updateInventoryByOutsourceReutrnStorage(String code, Boolean addOrReduce) {
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F41BF53C8317A8964AF2BED69B175E4> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F41BF53C8317A8964AF2BED69B175E4());
        variable1.param = CommonFunctionUtil.createListPage(updateInventoryByOutsourceReutrnStorageCustomizeServiceMapper.getAnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E(code), updateInventoryByOutsourceReutrnStorageCustomizeServiceMapper.countAnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E(code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F41BF53C8317A8964AF2BED69B175E4.class); 
        if ((variable1.param.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.param.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E item = variable1.param.list.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.outsourceReturnStorageDetails.quantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.outsourceReturnStorageDetails.quantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.param.list, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 


}
