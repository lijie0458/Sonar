package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.IAMGetUserByUserIdCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class IAMGetUserByUserIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private IAMGetUserByUserIdCustomizeServiceMapper iAMGetUserByUserIdCustomizeServiceMapper;
    public LCAPUser iAMGetUserByUserId(String userId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
        LCAPUser result = new LCAPUser();
        if ((CommonFunctionUtil.notEquals(userId, null))) {
            variable1 = CommonFunctionUtil.createListPage(iAMGetUserByUserIdCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(userId), iAMGetUserByUserIdCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(userId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1.list), 1L))) {
                result = CommonFunctionUtil.listHead(variable1.list).lCAPUser; 
            } else {
                result = CommonFunctionUtil.New(LCAPUser.class); 
                return result;
            } 

        } else {
            result = CommonFunctionUtil.New(LCAPUser.class); 
        } 

        return result;
    } 


}
