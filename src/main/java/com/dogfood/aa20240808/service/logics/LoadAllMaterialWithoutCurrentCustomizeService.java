package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LoadAllMaterialWithoutCurrentCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadAllMaterialWithoutCurrentCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadAllMaterialWithoutCurrentCustomizeServiceMapper loadAllMaterialWithoutCurrentCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C loadAllMaterialWithoutCurrent(Long currentMaterialId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C();
        result = CommonFunctionUtil.createListPage(loadAllMaterialWithoutCurrentCustomizeServiceMapper.getAnonymousStructure_988572FC06FE621688549C0BC53D9030(currentMaterialId), loadAllMaterialWithoutCurrentCustomizeServiceMapper.countAnonymousStructure_988572FC06FE621688549C0BC53D9030(currentMaterialId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C.class); 
        return result;
    } 


}
