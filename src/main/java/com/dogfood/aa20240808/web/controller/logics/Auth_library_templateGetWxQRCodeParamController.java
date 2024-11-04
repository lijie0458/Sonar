package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class Auth_library_templateGetWxQRCodeParamController {

    @Validation(value = { @ValidationRuleGroup(value = "198d3f6c-8f60-4b91-81f8-fee3c39b55fe",rules = { }),@ValidationRuleGroup(value = "257d3d0993374702bf08b6d6b3542cde",rules = { }),@ValidationRuleGroup(value = "db9d28b6410c44e79469e650d6c0929c",rules = { })})
    @PostMapping("/api/auth_library_template/getWxQRCodeParam")
    public ApiReturn<Object> getWxQRCodeParam() throws Exception {
        return ApiReturn.of(com.netease.lowcode.template.wechat.WeChatConfigAuthService.nasl$$enhance$$getWxQRCodeParam());
    } 


}
