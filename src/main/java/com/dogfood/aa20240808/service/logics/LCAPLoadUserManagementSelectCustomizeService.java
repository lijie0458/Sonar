package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import com.dogfood.aa20240808.repository.LCAPLoadUserManagementSelectCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 用户管理直属领导选择器数据
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
public class LCAPLoadUserManagementSelectCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPLoadUserManagementSelectCustomizeServiceMapper lCAPLoadUserManagementSelectCustomizeServiceMapper;

    public AnonymousStructure_90BB04F104917B26166C550B4A1B0632 lCAPLoadUserManagementSelect(Long page, Long size, String userId, String name) {
        AnonymousStructure_90BB04F104917B26166C550B4A1B0632 result = new AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
        if (CommonFunctionUtil.hasValue(userId)) {
            result = CommonFunctionUtil.createListPage(lCAPLoadUserManagementSelectCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(page, size, name, userId), lCAPLoadUserManagementSelectCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(page, size, name, userId).intValue(), AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
        } else {
            result = CommonFunctionUtil.createListPage(lCAPLoadUserManagementSelectCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C01(page, size, name), lCAPLoadUserManagementSelectCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C01(page, size, name).intValue(), AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
        } 

        return result;
    } 

}
