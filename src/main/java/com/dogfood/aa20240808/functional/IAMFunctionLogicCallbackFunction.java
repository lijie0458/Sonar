package com.dogfood.aa20240808.functional; 

import com.netease.cloud.nasl.java.definition.function.Function1; 
import org.springframework.stereotype.Component; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.service.logics.IAMFunctionLogicCustomizeService; 

@Component
public class IAMFunctionLogicCallbackFunction implements Function1<com.netease.lowcode.template.common.structure.LoginFunctionInput, com.netease.lowcode.template.common.structure.LoginFunctionOutput>,CallbackFunction{

    @Autowired
IAMFunctionLogicCustomizeService iAMFunctionLogicCustomizeService;
    @Override
    public com.netease.lowcode.template.common.structure.LoginFunctionOutput apply(com.netease.lowcode.template.common.structure.LoginFunctionInput t) {
        return iAMFunctionLogicCustomizeService.iAMFunctionLogic(t);
    } 


}
