package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPGetUserByUserIdCustomizeServiceMapper; 

/**
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class LCAPGetUserByUserIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPGetUserByUserIdCustomizeServiceMapper lCAPGetUserByUserIdCustomizeServiceMapper;

    public LCAPUser lCAPGetUserByUserId(String userId) {
        AnonymousStructure_90BB04F104917B26166C550B4A1B0632 variable1 = new AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
        LCAPUser result = new LCAPUser();
        variable1 = CommonFunctionUtil.createListPage(lCAPGetUserByUserIdCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(userId), lCAPGetUserByUserIdCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(userId).intValue(), AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
        for (Long index = 0L; index < CommonFunctionUtil.length(variable1.list); index++) {
            AnonymousStructure_47C167E7217746A55100F50A57F637C0 item = variable1.list.get(index.intValue());
            result = item.lCAPUser; 
        } 

        return result;
    } 

}
