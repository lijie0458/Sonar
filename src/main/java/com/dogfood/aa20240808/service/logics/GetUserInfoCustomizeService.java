package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.GetUserInfoCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetUserInfoCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetUserInfoCustomizeServiceMapper getUserInfoCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D getUserInfo() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D();
        result = CommonFunctionUtil.listHead(getUserInfoCustomizeServiceMapper.getAnonymousStructure_767B64E0A8935388CB3E9BF139E6586D(GlobalContext.getSessionVariable().currentUser)); 
        return result;
    } 


}
