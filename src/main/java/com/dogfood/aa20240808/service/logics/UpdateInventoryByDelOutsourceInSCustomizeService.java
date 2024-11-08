package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_165F151968ED1905D619B304227B6925; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6000B46E601140BAEDF82461B2120FA9; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.UpdateInventoryByDelOutsourceInSCustomizeServiceMapper; 
import java.math.BigDecimal; 

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
public class UpdateInventoryByDelOutsourceInSCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByDelOutsourceInSCustomizeServiceMapper updateInventoryByDelOutsourceInSCustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByDelOutsourceInS(String outsourceInSCode) {
        AnonymousStructure_165F151968ED1905D619B304227B6925 variable1 = new AnonymousStructure_165F151968ED1905D619B304227B6925();
        List<InventoryEntity> updateList = new ArrayList<>();
        List<Long> delList = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(updateInventoryByDelOutsourceInSCustomizeServiceMapper.getAnonymousStructure_6000B46E601140BAEDF82461B2120FA9(outsourceInSCode), updateInventoryByDelOutsourceInSCustomizeServiceMapper.countAnonymousStructure_6000B46E601140BAEDF82461B2120FA9(outsourceInSCode).intValue(), AnonymousStructure_165F151968ED1905D619B304227B6925.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_6000B46E601140BAEDF82461B2120FA9 item = variable1.list.get(index.intValue());
                item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.outsourceInStorageDetails.quantity)); 
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
