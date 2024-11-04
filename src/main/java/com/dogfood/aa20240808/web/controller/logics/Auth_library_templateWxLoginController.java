package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.Auth_library_templateWxLoginControllerDto; 

@RestController
public class Auth_library_templateWxLoginController {

    @Validation(value = { @ValidationRuleGroup(value = "2c5dcee6-06f0-4a23-9fea-e14f0991a93f",rules = { }),@ValidationRuleGroup(value = "5a9d9b2d54df417084747e84510b965d",rules = { }),@ValidationRuleGroup(value = "8701402a53094c3d8f81b11c7a9c6563",rules = { })})
    @PostMapping("/api/auth_library_template/wxLogin")
    public ApiReturn<Object> wxLogin(@RequestBody Auth_library_templateWxLoginControllerDto body) throws Exception {
        return ApiReturn.of(com.netease.lowcode.template.wechat.WeChatConfigAuthService.nasl$$enhance$$wxLogin(body.getUuid()));
    } 


}
