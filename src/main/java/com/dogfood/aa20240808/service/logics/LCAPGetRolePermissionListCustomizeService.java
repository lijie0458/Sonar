package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LCAPGetRolePermissionListCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPGetRolePermissionListCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPGetRolePermissionListCustomizeServiceMapper lCAPGetRolePermissionListCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0136396D558BF391361EA94F4EF87419 lCAPGetRolePermissionList(Long inputRoleId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0136396D558BF391361EA94F4EF87419 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0136396D558BF391361EA94F4EF87419();
        result = CommonFunctionUtil.createListPage(lCAPGetRolePermissionListCustomizeServiceMapper.getAnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9(inputRoleId), lCAPGetRolePermissionListCustomizeServiceMapper.countAnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9(inputRoleId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0136396D558BF391361EA94F4EF87419.class); 
        return result;
    } 


}
