package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import com.dogfood.aa20240808.repository.UpdateInventoryByOutsourceReutrnStorageCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0F41BF53C8317A8964AF2BED69B175E4; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新库存委外加工入库-ljl
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
public class UpdateInventoryByOutsourceReutrnStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByOutsourceReutrnStorageCustomizeServiceMapper updateInventoryByOutsourceReutrnStorageCustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByOutsourceReutrnStorage(String code, Boolean addOrReduce) {
        AnonymousStructure_0F41BF53C8317A8964AF2BED69B175E4 variable1 = new AnonymousStructure_0F41BF53C8317A8964AF2BED69B175E4();
        variable1 = CommonFunctionUtil.createListPage(updateInventoryByOutsourceReutrnStorageCustomizeServiceMapper.getAnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E(code), updateInventoryByOutsourceReutrnStorageCustomizeServiceMapper.countAnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E(code).intValue(), AnonymousStructure_0F41BF53C8317A8964AF2BED69B175E4.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E item = variable1.list.get(index.intValue());
                if (addOrReduce) {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.outsourceReturnStorageDetails.quantity)); 
                } else {
                    item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.outsourceReturnStorageDetails.quantity)); 
                } 

            } 

            inventoryEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.list, (item) -> item.inventory), Arrays.asList("id", "stockQuantity"));
        } else {
        } 

        return ;
    } 

}
