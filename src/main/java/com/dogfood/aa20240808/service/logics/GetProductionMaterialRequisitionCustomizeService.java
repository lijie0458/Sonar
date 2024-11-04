package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.GetProductionMaterialRequisitionCustomizeServiceMapper; 

@Service
public class GetProductionMaterialRequisitionCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetProductionMaterialRequisitionCustomizeServiceMapper getProductionMaterialRequisitionCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396 getProductionMaterialRequisition(String param1) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396> variable1 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396();
        variable1 = getProductionMaterialRequisitionCustomizeServiceMapper.getSql1(param1); 
        result = CommonFunctionUtil.get(variable1, 0L); 
        return result;
    } 


}
