package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper; 

@Service
public class LCAPGetMappingIdByRoleIdAndUserIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper;
    public Long lCAPGetMappingIdByRoleIdAndUserId(Long roleId, String userId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18();
        Long result = 0L;
        result = 0L; 
        variable1 = CommonFunctionUtil.createListPage(lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper.getAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(), lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper.countAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18.class); 
        for (Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5 item = variable1.list.get(i.intValue());
            if (((CommonFunctionUtil.equals(item.lCAPUserRoleMapping.roleId, roleId)) && (CommonFunctionUtil.equals(item.lCAPUserRoleMapping.userId, userId)))) {
                result = item.lCAPUserRoleMapping.id; 
            } else {
            } 

        } 

        return result;
    } 


}
