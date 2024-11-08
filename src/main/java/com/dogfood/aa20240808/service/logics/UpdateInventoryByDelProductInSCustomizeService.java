package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.UpdateInventoryByDelProductInSCustomizeServiceMapper; 
import java.util.Arrays; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_13755BF9F5DF567B2A0EEEB6FF223E6A; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_551A796780D99168E3E45C648EE58217; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

/**
 * 更新库存在删除产品入库单后-ljl
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
public class UpdateInventoryByDelProductInSCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByDelProductInSCustomizeServiceMapper updateInventoryByDelProductInSCustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByDelProductInS(String productInSNum) {
        AnonymousStructure_13755BF9F5DF567B2A0EEEB6FF223E6A variable1 = new AnonymousStructure_13755BF9F5DF567B2A0EEEB6FF223E6A();
        List<InventoryEntity> updateList = new ArrayList<>();
        List<Long> delList = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(updateInventoryByDelProductInSCustomizeServiceMapper.getAnonymousStructure_551A796780D99168E3E45C648EE58217(productInSNum), updateInventoryByDelProductInSCustomizeServiceMapper.countAnonymousStructure_551A796780D99168E3E45C648EE58217(productInSNum).intValue(), AnonymousStructure_13755BF9F5DF567B2A0EEEB6FF223E6A.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_551A796780D99168E3E45C648EE58217 item = variable1.list.get(index.intValue());
                item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.productInStorageDetails.quantity)); 
                if ((item.inventory.stockQuantity.compareTo(BigDecimal.valueOf(0L)) == 1)) {
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
