package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0136396D558BF391361EA94F4EF87419; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LCAPGetRolePermissionListCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 
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
public class LCAPGetRolePermissionListCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPGetRolePermissionListCustomizeServiceMapper lCAPGetRolePermissionListCustomizeServiceMapper;

    public AnonymousStructure_0136396D558BF391361EA94F4EF87419 lCAPGetRolePermissionList(Long inputRoleId) {
        AnonymousStructure_0136396D558BF391361EA94F4EF87419 result = new AnonymousStructure_0136396D558BF391361EA94F4EF87419();
        result = CommonFunctionUtil.createListPage(lCAPGetRolePermissionListCustomizeServiceMapper.getAnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9(inputRoleId), lCAPGetRolePermissionListCustomizeServiceMapper.countAnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9(inputRoleId).intValue(), AnonymousStructure_0136396D558BF391361EA94F4EF87419.class); 
        return result;
    } 

}
