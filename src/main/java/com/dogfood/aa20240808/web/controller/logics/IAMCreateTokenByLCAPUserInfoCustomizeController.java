package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.IAMCreateTokenByLCAPUserInfoCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.netease.lowcode.auth.domain.LCAPUser; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMCreateTokenByLCAPUserInfoCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMCreateTokenByLCAPUserInfoCustomizeController {

    @Autowired
    private IAMCreateTokenByLCAPUserInfoCustomizeService iAMCreateTokenByLCAPUserInfoCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "d715504b-f923-4bc8-9f4c-36ee93e122c7",rules = { }),@ValidationRuleGroup(value = "8637bd4f-ea31-41ad-a443-3ddbef2fac6c",rules = { })})
    @PostMapping("/api/lcplogics/IAMCreateTokenByLCAPUserInfo")
    public ApiReturn<LCAPUser> iAMCreateTokenByLCAPUserInfo(@RequestBody IAMCreateTokenByLCAPUserInfoCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(body.getOpenid(), body.getSource(), body.getIdentityId(), body.getName(), body.getIsAccountBindCreate()));
    } 

}
