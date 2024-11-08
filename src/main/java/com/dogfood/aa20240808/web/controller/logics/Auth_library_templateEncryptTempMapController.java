package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.netease.lowcode.template.logic.AuthTemplateLogic; 
import com.dogfood.aa20240808.web.controller.logics.dto.Auth_library_templateEncryptTempMapControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class Auth_library_templateEncryptTempMapController {

    @Validation(value = { @ValidationRuleGroup(value = "58d44f61-bb70-4e77-8942-e6c96b5362d9",rules = { }),@ValidationRuleGroup(value = "7b8aa845-f34b-4f50-ada2-edb705780f91",rules = { })})
    @PostMapping("/api/auth_library_template/encryptTempMap")
    public ApiReturn<Object> encryptTempMap(@RequestBody Auth_library_templateEncryptTempMapControllerDto body) throws Exception {
        return ApiReturn.of(AuthTemplateLogic.nasl$$enhance$$encryptTempMap(body.getMap()));
    } 

}
