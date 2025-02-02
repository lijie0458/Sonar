package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LCAPIsRoleNameRepeatedCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPIsRoleNameRepeatedCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPIsRoleNameRepeatedCustomizeServiceMapper lCAPIsRoleNameRepeatedCustomizeServiceMapper;
    public Boolean lCAPIsRoleNameRepeated(String roleName) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6();
        Boolean isExist = false;
        variable1 = CommonFunctionUtil.createListPage(lCAPIsRoleNameRepeatedCustomizeServiceMapper.getAnonymousStructure_70791B893F53C2EFB9E501591763B020(roleName), lCAPIsRoleNameRepeatedCustomizeServiceMapper.countAnonymousStructure_70791B893F53C2EFB9E501591763B020(roleName).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class); 
        if ((CommonFunctionUtil.length(variable1.list).compareTo(0L) > 0)) {
            isExist = true; 
        } else {
            isExist = false; 
        } 

        return isExist;
    } 


}
