package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadAduitSelectByOrderNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9C387961E6D66F52987268EB7DB609B7; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C; 

/**
 * 出库点击审核时更新库存用的逻辑
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
public class LoadAduitSelectByOrderNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadAduitSelectByOrderNumberCustomizeServiceMapper loadAduitSelectByOrderNumberCustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void loadAduitSelectByOrderNumber(String orderNumber) {
        AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C variable1 = new AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C();
        InventoryEntity inventory = new InventoryEntity();
        List<InventoryEntity> inventoryList = new ArrayList<>();
        // 查询当前出库点下面的所有详情
        variable1 = CommonFunctionUtil.createListPage(loadAduitSelectByOrderNumberCustomizeServiceMapper.getAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(orderNumber), loadAduitSelectByOrderNumberCustomizeServiceMapper.countAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(orderNumber).intValue(), AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C.class); 
        for (Long index = 0L; index < variable1.list.size(); index++) {
            AnonymousStructure_9C387961E6D66F52987268EB7DB609B7 item = variable1.list.get(index.intValue());
            inventory = inventoryEntityService.get(item.salesOrderDetails.batchNumber); 
            if ((CommonFunctionUtil.equals(item.salesOrders.distinction, DistinctionEnumEnum.FIELD_SRE))) {
                inventory.stockQuantity = (inventory.stockQuantity.add(item.salesOrderDetails.returnQuanTity)); 
            } else {
                inventory.occupiedQuantity = (inventory.occupiedQuantity.subtract(item.salesOrderDetails.outboundQuantity)); 
                inventory.stockQuantity = (inventory.stockQuantity.subtract(item.salesOrderDetails.outboundQuantity)); 
            } 

            CommonFunctionUtil.add(inventoryList, CommonFunctionUtil.clone(inventory));
        } 

        inventoryEntityService.batchUpdate(inventoryList, null);
        return ;
    } 

}
