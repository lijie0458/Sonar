package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadMaterialSelectMaterial1CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadMaterialSelectMaterial1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadMaterialSelectMaterial1CustomizeServiceMapper loadMaterialSelectMaterial1CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C loadMaterialSelectMaterial1() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C();
        result = CommonFunctionUtil.createListPage(loadMaterialSelectMaterial1CustomizeServiceMapper.getAnonymousStructure_988572FC06FE621688549C0BC53D9030(), loadMaterialSelectMaterial1CustomizeServiceMapper.countAnonymousStructure_988572FC06FE621688549C0BC53D9030().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C.class); 
        return result;
    } 


}
