package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.UpdateInventoryByTransferSlipCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class UpdateInventoryByTransferSlipCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdateInventoryByTransferSlipCustomizeServiceMapper updateInventoryByTransferSlipCustomizeServiceMapper;
    @Autowired
    private InventoryEntityService inventoryEntityService;
    public void updateInventoryByTransferSlip(String documentNumber) {
        Boolean variable1 = false;
        List<InventoryEntity> variable2 = new ArrayList<>();
        CommonFunctionUtil.clear(variable2);
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF> currentLcpEachName_1 = updateInventoryByTransferSlipCustomizeServiceMapper.getAnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF(documentNumber);
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF item = currentLcpEachName_1.get(index.intValue());
            variable1 = false; 
            if (CommonFunctionUtil.hasValue(item.inventory.lotNumber, item.transferSlipDetails.lotNumber)) {
            } else {
                variable1 = true; 
                item.inventory.lotNumber = "123"; 
                item.transferSlipDetails.lotNumber = "123"; 
            } 

            if ((CommonFunctionUtil.equals(item.inventory.lotNumber, item.transferSlipDetails.lotNumber))) {
                if (variable1) {
                    item.inventory.lotNumber = null; 
                    item.transferSlipDetails.lotNumber = null; 
                } else {
                } 

                item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.transferSlipDetails.quantity)); 
                item.inventory.occupiedQuantity = (item.inventory.occupiedQuantity.subtract(item.transferSlipDetails.quantity)); 
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item.inventory));
            } else {
            } 

        } 

        if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
            inventoryEntityService.batchUpdate(variable2, null);
        } else {
        } 

        return ;
    } 


}
