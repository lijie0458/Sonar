package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.UpdateInventoryByTransferSlip1CustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF; 

/**
 * 更新库存在调拨单审核-入库库存
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
public class UpdateInventoryByTransferSlip1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateInventoryByTransferSlip1CustomizeServiceMapper updateInventoryByTransferSlip1CustomizeServiceMapper;

    @Autowired
    private InventoryEntityService inventoryEntityService;

    public void updateInventoryByTransferSlip1(String documentNumber) {
        Boolean bool = false;
        List<InventoryEntity> variable1 = new ArrayList<>();
        Boolean bool1 = false;
        List<InventoryEntity> variable2 = new ArrayList<>();
        CommonFunctionUtil.clear(variable1, "shallow");
        CommonFunctionUtil.clear(variable2, "shallow");
        List<AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF> currentLcpEachName_1 = updateInventoryByTransferSlip1CustomizeServiceMapper.getAnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF(documentNumber);
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF item = currentLcpEachName_1.get(index.intValue());
            bool = false; 
            bool1 = true; 
            if ((CommonFunctionUtil.equals(item.inventory, null))) {
                bool1 = false; 
            } else {
                if (CommonFunctionUtil.hasValue(item.inventory.lotNumber, item.transferSlipDetails.lotNumber)) {
                } else {
                    bool = true; 
                    item.inventory.lotNumber = "123"; 
                    item.transferSlipDetails.lotNumber = "123"; 
                } 

                if ((CommonFunctionUtil.equals(item.inventory.lotNumber, item.transferSlipDetails.lotNumber))) {
                    if (bool) {
                        item.inventory.lotNumber = null; 
                        item.transferSlipDetails.lotNumber = null; 
                    } else {
                    } 

                    item.inventory.stockQuantity = (item.inventory.stockQuantity.add(item.transferSlipDetails.quantity)); 
                    CommonFunctionUtil.add(variable1, CommonFunctionUtil.clone(item.inventory));
                } else {
                } 

            } 

            if (bool1) {
            } else {
                item.inventory = CommonFunctionUtil.newWithInitiation(new InventoryEntity(), _bean1 -> {
    _bean1.materialCode = item.transferSlipDetails.materialCode; 
    _bean1.lotNumber = item.transferSlipDetails.lotNumber; 
    _bean1.warehouse = item.transferSlipDetails.inWarehouse; 
    _bean1.stockQuantity = item.transferSlipDetails.quantity; 
} ); 
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item.inventory));
            } 

        } 

        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            inventoryEntityService.batchUpdate(variable1, null);
        } else {
        } 

        if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
            inventoryEntityService.batchCreate(variable2);
        } else {
        } 

        return ;
    } 

}
