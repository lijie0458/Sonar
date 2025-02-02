package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.PERGetUserRoleMappingByUserIdCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERGetUserRoleMappingByUserIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERGetUserRoleMappingByUserIdCustomizeServiceMapper pERGetUserRoleMappingByUserIdCustomizeServiceMapper;
    public LCAPUserRoleMapping pERGetUserRoleMappingByUserId(String userId) {
        LambdaParamWrapper<String> userIdWrapper = new LambdaParamWrapper<>(userId);
        LCAPUserRoleMapping result = new LCAPUserRoleMapping();
        if ((CommonFunctionUtil.notEquals(userIdWrapper.param, null))) {
            result = CommonFunctionUtil.listHead(CommonFunctionUtil.listTransform(CommonFunctionUtil.createListPage(pERGetUserRoleMappingByUserIdCustomizeServiceMapper.getAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(userIdWrapper.param), pERGetUserRoleMappingByUserIdCustomizeServiceMapper.countAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(userIdWrapper.param).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18.class).list, (item) -> item.lCAPUserRoleMapping)); 
        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数userId为null"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 


}
