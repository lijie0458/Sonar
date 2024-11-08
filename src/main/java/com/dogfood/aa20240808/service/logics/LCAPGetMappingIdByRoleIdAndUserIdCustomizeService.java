package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper; 

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
public class LCAPGetMappingIdByRoleIdAndUserIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper;

    public Long lCAPGetMappingIdByRoleIdAndUserId(Long roleId, String userId) {
        AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18 variable1 = new AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18();
        Long result = 0L;
        result = 0L; 
        variable1 = CommonFunctionUtil.createListPage(lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper.getAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(), lCAPGetMappingIdByRoleIdAndUserIdCustomizeServiceMapper.countAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5().intValue(), AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18.class); 
        for (Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++) {
            AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5 item = variable1.list.get(i.intValue());
            if (((CommonFunctionUtil.equals(item.lCAPUserRoleMapping.roleId, roleId)) && (CommonFunctionUtil.equals(item.lCAPUserRoleMapping.userId, userId)))) {
                result = item.lCAPUserRoleMapping.id; 
            } else {
            } 

        } 

        return result;
    } 

}
