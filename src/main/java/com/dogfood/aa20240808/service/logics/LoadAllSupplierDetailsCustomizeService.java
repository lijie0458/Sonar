package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadAllSupplierDetailsCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadAllSupplierDetailsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadAllSupplierDetailsCustomizeServiceMapper loadAllSupplierDetailsCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 loadAllSupplierDetails() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7();
        result = CommonFunctionUtil.createListPage(loadAllSupplierDetailsCustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(), loadAllSupplierDetailsCustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class); 
        return result;
    } 


}
