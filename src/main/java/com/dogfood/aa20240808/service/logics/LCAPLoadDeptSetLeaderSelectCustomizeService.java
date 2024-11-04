package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LCAPLoadDeptSetLeaderSelectCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPLoadDeptSetLeaderSelectCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPLoadDeptSetLeaderSelectCustomizeServiceMapper lCAPLoadDeptSetLeaderSelectCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E lCAPLoadDeptSetLeaderSelect(Long page, Long size, String deptId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E();
        result = CommonFunctionUtil.createListPage(lCAPLoadDeptSetLeaderSelectCustomizeServiceMapper.getAnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA(page, size, deptId), lCAPLoadDeptSetLeaderSelectCustomizeServiceMapper.countAnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA(page, size, deptId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E.class); 
        return result;
    } 


}
