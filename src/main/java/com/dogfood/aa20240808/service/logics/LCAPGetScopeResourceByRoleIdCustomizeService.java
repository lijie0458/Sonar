package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LCAPGetScopeResourceByRoleIdCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPGetScopeResourceByRoleIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPGetScopeResourceByRoleIdCustomizeServiceMapper lCAPGetScopeResourceByRoleIdCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B676D945A9DD0D6FB27D68FFAC48D5EE lCAPGetScopeResourceByRoleId(Long roleId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B676D945A9DD0D6FB27D68FFAC48D5EE result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B676D945A9DD0D6FB27D68FFAC48D5EE();
        result = CommonFunctionUtil.createListPage(lCAPGetScopeResourceByRoleIdCustomizeServiceMapper.getAnonymousStructure_CF51E2CA3BEA957FFEB6CEA32F96003B(roleId), lCAPGetScopeResourceByRoleIdCustomizeServiceMapper.countAnonymousStructure_CF51E2CA3BEA957FFEB6CEA32F96003B(roleId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B676D945A9DD0D6FB27D68FFAC48D5EE.class); 
        return result;
    } 


}
