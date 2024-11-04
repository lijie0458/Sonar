package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.Auth_library_templateDecryptWithBase64AndDesControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class Auth_library_templateDecryptWithBase64AndDesController {

    @Validation(value = { @ValidationRuleGroup(value = "aecb5ebb-4341-4bb1-b171-ebf6ef634b7e",rules = { }),@ValidationRuleGroup(value = "525ebdfe-744b-4a52-879d-21fe44909001",rules = { }),@ValidationRuleGroup(value = "a3e21552-494c-4631-90bb-224e2a7dd204",rules = { }),@ValidationRuleGroup(value = "1ec24d40-df8b-484a-84dc-2e6519479f14",rules = { }),@ValidationRuleGroup(value = "683848d2-bb16-4b7f-b1bb-09a0df3e088e",rules = { })})
    @PostMapping("/api/auth_library_template/decryptWithBase64AndDes")
    public ApiReturn<Object> decryptWithBase64AndDes(@RequestBody Auth_library_templateDecryptWithBase64AndDesControllerDto body) throws Exception {
        return ApiReturn.of(com.netease.lowcode.template.logic.AuthTemplateLogic.nasl$$enhance$$decryptWithBase64AndDes(body.getEncryptedString()));
    } 


}
