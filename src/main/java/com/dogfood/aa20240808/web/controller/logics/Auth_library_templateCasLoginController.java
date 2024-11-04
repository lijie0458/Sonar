package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.netease.cloud.nasl.java.definition.function.Function1; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.Auth_library_templateCasLoginControllerDto; 
import com.dogfood.aa20240808.functional.FunctionContainer; 

@RestController
public class Auth_library_templateCasLoginController {

    @Validation(value = { @ValidationRuleGroup(value = "7bcf7d700bfd4ed6b3bb4a1b40ce97c0",rules = { }),@ValidationRuleGroup(value = "234917d8ae95434abec3d7ad404c6888",rules = { }),@ValidationRuleGroup(value = "7a98599f-ff9f-43a5-8b75-ae5e619499eb",rules = { })})
    @PostMapping("/api/auth_library_template/casLogin")
    public ApiReturn<Object> casLogin(@RequestBody Auth_library_templateCasLoginControllerDto body) throws Exception {
        return ApiReturn.of(com.netease.lowcode.template.cas.CasConfigAuthService.nasl$$enhance$$casLogin(FunctionContainer.getBean(body.getCasFunction(), Function1.class)));
    } 


}
