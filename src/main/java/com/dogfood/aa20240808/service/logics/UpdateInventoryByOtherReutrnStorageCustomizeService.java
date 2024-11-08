package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import com.dogfood.aa20240808.repository.UpdateInventoryByOtherReutrnStorageCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0341EC3B00E60806B08330B31078BA33; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新库存其他入库-ljl
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
public class UpdateInventoryByOtherReutrnStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByOtherReutrnStorageCustomizeServiceMapper updateInventoryByOtherReutrnStorageCustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByOtherReutrnStorage(String otherReturnCode, Boolean addOrReduce) {
        AnonymousStructure_0341EC3B00E60806B08330B31078BA33 variable1 = new AnonymousStructure_0341EC3B00E60806B08330B31078BA33();
        variable1 = CommonFunctionUtil.createListPage(updateInventoryByOtherReutrnStorageCustomizeServiceMapper.getAnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283(otherReturnCode), updateInventoryByOtherReutrnStorageCustomizeServiceMapper.countAnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283(otherReturnCode).intValue(), AnonymousStructure_0341EC3B00E60806B08330B31078BA33.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283 item = variable1.list.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.otherReturnStorageDetails.quantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.otherReturnStorageDetails.quantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.list, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 

}
