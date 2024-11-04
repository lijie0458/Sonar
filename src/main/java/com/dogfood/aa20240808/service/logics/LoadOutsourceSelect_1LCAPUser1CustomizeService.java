package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadOutsourceSelect_1LCAPUser1CustomizeServiceMapper; 

@Service
public class LoadOutsourceSelect_1LCAPUser1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadOutsourceSelect_1LCAPUser1CustomizeServiceMapper loadOutsourceSelect_1LCAPUser1CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632 loadOutsourceSelect_1LCAPUser1(Long page, Long size) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
        result = CommonFunctionUtil.createListPage(loadOutsourceSelect_1LCAPUser1CustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(page, size), loadOutsourceSelect_1LCAPUser1CustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
        return result;
    } 


}
