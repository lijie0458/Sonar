package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadAllMeasuringUnitldCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadAllMeasuringUnitldCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadAllMeasuringUnitldCustomizeServiceMapper loadAllMeasuringUnitldCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85 loadAllMeasuringUnitld() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85();
        result = CommonFunctionUtil.createListPage(loadAllMeasuringUnitldCustomizeServiceMapper.getAnonymousStructure_E4D66C6B00115C2619796053521EA8C0(), loadAllMeasuringUnitldCustomizeServiceMapper.countAnonymousStructure_E4D66C6B00115C2619796053521EA8C0().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85.class); 
        return result;
    } 


}
