package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.Auth_library_templateEncryptWithDesAndBase64ControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class Auth_library_templateEncryptWithDesAndBase64Controller {

    @Validation(value = { @ValidationRuleGroup(value = "c5ad56f9-52fe-4796-98ff-db3d79fc6a67",rules = { }),@ValidationRuleGroup(value = "56cacfa4-08d2-4918-9366-c6fb02c5b4bd",rules = { }),@ValidationRuleGroup(value = "f1d36382-fa28-4992-88fa-e0863d79f24a",rules = { }),@ValidationRuleGroup(value = "bd146621-099a-4026-93b9-ad66be42aaa1",rules = { }),@ValidationRuleGroup(value = "52e6a84c-a6be-4c39-932f-6afa975fe96f",rules = { }),@ValidationRuleGroup(value = "0d319cf7-7361-4f9f-a5f7-60dc14b2488f",rules = { }),@ValidationRuleGroup(value = "7f694117-4846-4da6-947a-fc901279c5f3",rules = { })})
    @PostMapping("/api/auth_library_template/encryptWithDesAndBase64")
    public ApiReturn<Object> encryptWithDesAndBase64(@RequestBody Auth_library_templateEncryptWithDesAndBase64ControllerDto body) throws Exception {
        return ApiReturn.of(com.netease.lowcode.template.logic.AuthTemplateLogic.nasl$$enhance$$encryptWithDesAndBase64(body.getSourceString()));
    } 


}
