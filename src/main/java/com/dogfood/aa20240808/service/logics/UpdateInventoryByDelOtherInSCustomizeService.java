package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A6681F13D1D06998DC83A6E0A9F43FD9; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.UpdateInventoryByDelOtherInSCustomizeServiceMapper; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新库存在删除委外加工入库单后-ljl
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
public class UpdateInventoryByDelOtherInSCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByDelOtherInSCustomizeServiceMapper updateInventoryByDelOtherInSCustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByDelOtherInS(String otherCode) {
        AnonymousStructure_A6681F13D1D06998DC83A6E0A9F43FD9 variable1 = new AnonymousStructure_A6681F13D1D06998DC83A6E0A9F43FD9();
        List<InventoryEntity> updateList = new ArrayList<>();
        List<Long> delList = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(updateInventoryByDelOtherInSCustomizeServiceMapper.getAnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9(otherCode), updateInventoryByDelOtherInSCustomizeServiceMapper.countAnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9(otherCode).intValue(), AnonymousStructure_A6681F13D1D06998DC83A6E0A9F43FD9.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9 item = variable1.list.get(index.intValue());
                item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.otherInStorageDetails.quantity)); 
                CommonFunctionUtil.add(updateList, item.inventory);
            } 

            if ((CommonFunctionUtil.length(updateList).compareTo(0L) > 0)) {
                inventoryEntityService.batchUpdate(updateList, Arrays.asList("id", "stockQuantity"));
            } else {
            } 

        } else {
        } 

        return ;
    } 

}
