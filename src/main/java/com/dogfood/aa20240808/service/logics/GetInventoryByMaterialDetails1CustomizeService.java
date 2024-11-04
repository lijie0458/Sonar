package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.GetInventoryByMaterialDetails1CustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class GetInventoryByMaterialDetails1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetInventoryByMaterialDetails1CustomizeServiceMapper getInventoryByMaterialDetails1CustomizeServiceMapper;
    public BigDecimal getInventoryByMaterialDetails1(String materialCode, Long warehouseId, Long locationId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> variable1 = new ArrayList<>();
        BigDecimal result = BigDecimal.ZERO;
        variable1 = getInventoryByMaterialDetails1CustomizeServiceMapper.getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(warehouseId, locationId, materialCode); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1), 0L))) {
            result = new BigDecimal(0L); 
        } else {
            result = CommonFunctionUtil.listSum(CommonFunctionUtil.listTransform(variable1, (item) -> item.inventory.stockQuantity)); 
        } 

        return result;
    } 


}
