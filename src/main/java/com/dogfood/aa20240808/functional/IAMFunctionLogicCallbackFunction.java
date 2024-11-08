package com.dogfood.aa20240808.functional; 

import com.netease.cloud.nasl.java.definition.function.Function1; 
import org.springframework.stereotype.Component; 
import com.netease.lowcode.template.common.structure.LoginFunctionInput; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.netease.lowcode.template.common.structure.LoginFunctionOutput; 
import com.dogfood.aa20240808.service.logics.IAMFunctionLogicCustomizeService; 

@Component
public class IAMFunctionLogicCallbackFunction implements Function1<LoginFunctionInput, LoginFunctionOutput>,CallbackFunction{

    @Autowired
IAMFunctionLogicCustomizeService iAMFunctionLogicCustomizeService;

    @Override
    public LoginFunctionOutput apply(LoginFunctionInput t) {
        return iAMFunctionLogicCustomizeService.iAMFunctionLogic(t);
    } 

}
