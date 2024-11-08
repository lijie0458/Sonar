package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.netease.lowcode.template.logic.AuthTemplateLogic; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class Auth_library_templateClearCookieAllController {

    @Validation(value = { @ValidationRuleGroup(value = "368d46a3-1694-4b81-ad37-2fd224a173a6",rules = { })})
    @PostMapping("/api/auth_library_template/clearCookieAll")
    public ApiReturn<Object> clearCookieAll() throws Exception {
        return ApiReturn.of(AuthTemplateLogic.nasl$$enhance$$clearCookieAll());
    } 

}
