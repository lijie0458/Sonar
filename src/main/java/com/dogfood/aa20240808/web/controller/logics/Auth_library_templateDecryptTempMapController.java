package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.Auth_library_templateDecryptTempMapControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class Auth_library_templateDecryptTempMapController {

    @Validation(value = { @ValidationRuleGroup(value = "9e4ce7c5-193d-4f0e-81ab-8140e138a850",rules = { }),@ValidationRuleGroup(value = "2ed3abbd-1605-42d6-a9c0-b99c36dc2772",rules = { })})
    @PostMapping("/api/auth_library_template/decryptTempMap")
    public ApiReturn<Object> decryptTempMap(@RequestBody Auth_library_templateDecryptTempMapControllerDto body) throws Exception {
        return ApiReturn.of(com.netease.lowcode.template.logic.AuthTemplateLogic.nasl$$enhance$$decryptTempMap(body.getMap()));
    } 


}
