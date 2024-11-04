package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.LCAPGetRoleBindUserListCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPGetRoleBindUserListCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPGetRoleBindUserListCustomizeServiceMapper lCAPGetRoleBindUserListCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5> lCAPGetRoleBindUserList(Long inputRoleId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(lCAPGetRoleBindUserListCustomizeServiceMapper.getAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(inputRoleId), lCAPGetRoleBindUserListCustomizeServiceMapper.countAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(inputRoleId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18.class); 
        result = variable1.list; 
        return result;
    } 


}
