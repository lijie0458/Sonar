package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadUserByUserIdCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadUserByUserIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadUserByUserIdCustomizeServiceMapper loadUserByUserIdCustomizeServiceMapper;
    public LCAPUser loadUserByUserId(String param1) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
        LCAPUser result = new LCAPUser();
        variable1 = CommonFunctionUtil.createListPage(loadUserByUserIdCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(param1), loadUserByUserIdCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
        result = CommonFunctionUtil.get(variable1.list, 0L).lCAPUser; 
        return result;
    } 


}
