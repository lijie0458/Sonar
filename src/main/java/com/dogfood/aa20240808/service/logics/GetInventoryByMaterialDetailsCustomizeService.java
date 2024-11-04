package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.GetInventoryByMaterialDetailsCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetInventoryByMaterialDetailsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetInventoryByMaterialDetailsCustomizeServiceMapper getInventoryByMaterialDetailsCustomizeServiceMapper;
    public Long getInventoryByMaterialDetails(String materialCode, Long warehouseId, Long locationId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> variable1 = new ArrayList<>();
        Long result = 0L;
        variable1 = getInventoryByMaterialDetailsCustomizeServiceMapper.getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(warehouseId, locationId, materialCode); 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            result = CommonFunctionUtil.listHead(variable1).inventory.id; 
        } else {
        } 

        return result;
    } 


}
