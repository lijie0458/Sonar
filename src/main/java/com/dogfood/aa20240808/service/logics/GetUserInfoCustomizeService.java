package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.GetUserInfoCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 得到用户信息-首页-ljl
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
public class GetUserInfoCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetUserInfoCustomizeServiceMapper getUserInfoCustomizeServiceMapper;

    public AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D getUserInfo() {
        AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D result = new AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D();
        result = CommonFunctionUtil.listHead(getUserInfoCustomizeServiceMapper.getAnonymousStructure_767B64E0A8935388CB3E9BF139E6586D(GlobalContext.getSessionVariable().currentUser)); 
        return result;
    } 

}
