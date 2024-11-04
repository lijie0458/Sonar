package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadOutsourceReturnStorageSelect_26CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadOutsourceReturnStorageSelect_26CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadOutsourceReturnStorageSelect_26CustomizeServiceMapper loadOutsourceReturnStorageSelect_26CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 loadOutsourceReturnStorageSelect_26(Long page, Long size) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7();
        result = CommonFunctionUtil.createListPage(loadOutsourceReturnStorageSelect_26CustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(page, size), loadOutsourceReturnStorageSelect_26CustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class); 
        return result;
    } 


}
