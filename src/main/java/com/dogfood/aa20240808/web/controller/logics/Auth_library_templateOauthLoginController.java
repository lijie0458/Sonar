package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.netease.cloud.nasl.java.definition.function.Function1; 
import com.dogfood.aa20240808.web.controller.logics.dto.Auth_library_templateOauthLoginControllerDto; 
import com.netease.lowcode.template.oauth.OAuthConfigAuthService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.functional.FunctionContainer; 

@RestController
public class Auth_library_templateOauthLoginController {

    @Validation(value = { @ValidationRuleGroup(value = "712eb50c-0b5a-4a77-9b62-ae08e221b08b",rules = { }),@ValidationRuleGroup(value = "23eaa18fddc34acda6aa1b2fcc7c53f6",rules = { }),@ValidationRuleGroup(value = "802cc3b8d4d341eb9ba156a0af2260c9",rules = { })})
    @PostMapping("/api/auth_library_template/oauthLogin")
    public ApiReturn<Object> oauthLogin(@RequestBody Auth_library_templateOauthLoginControllerDto body) throws Exception {
        return ApiReturn.of(OAuthConfigAuthService.nasl$$enhance$$oauthLogin(body.getCode(), FunctionContainer.getBean(body.getOauthFunction(), Function1.class)));
    } 

}
