package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.GetInventoryByMaterialDetails2CustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetInventoryByMaterialDetails2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetInventoryByMaterialDetails2CustomizeServiceMapper getInventoryByMaterialDetails2CustomizeServiceMapper;
    public InventoryEntity getInventoryByMaterialDetails2(String materialCode, Long warehouseId, String lotNumber) {
        Boolean bool = false;
        InventoryEntity result = new InventoryEntity();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> currentLcpEachName_1 = getInventoryByMaterialDetails2CustomizeServiceMapper.getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(warehouseId, materialCode);
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 item = currentLcpEachName_1.get(index.intValue());
            bool = false; 
            if (CommonFunctionUtil.hasValue(item.inventory.lotNumber)) {
            } else {
                bool = true; 
                item.inventory.lotNumber = "123"; 
            } 

            if (((CommonFunctionUtil.equals(item.inventory.lotNumber, lotNumber)) || (CommonFunctionUtil.equals(item.inventory.lotNumber, "123")))) {
                if (bool) {
                    item.inventory.lotNumber = null; 
                } else {
                } 

                result = item.inventory; 
            } else {
            } 

        } 

        return result;
    } 


}
