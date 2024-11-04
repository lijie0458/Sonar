package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.IAMJudgeOpenedIdentityCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMJudgeOpenedIdentityCustomizeController {

    @Autowired
    private IAMJudgeOpenedIdentityCustomizeService iAMJudgeOpenedIdentityCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "057a3506-3197-4f1d-8b11-50d95e8a644c",rules = { }),@ValidationRuleGroup(value = "17e482a4-49c7-4639-b99f-447de19ba498",rules = { }),@ValidationRuleGroup(value = "cd78a1dd-b33e-41f5-8680-829e9f7e6ede",rules = { }),@ValidationRuleGroup(value = "1f1077f8-4507-47c0-b085-0b18d87243e2",rules = { }),@ValidationRuleGroup(value = "416c7717-df29-4e8d-8a9a-8e1268762b3c",rules = { }),@ValidationRuleGroup(value = "3e5cc9ea-400d-4e37-8e58-0489314227f6",rules = { })})
    @PostMapping("/api/lcplogics/IAMJudgeOpenedIdentity")
    public ApiReturn<Boolean> iAMJudgeOpenedIdentity() throws Exception {
        return ApiReturn.of(iAMJudgeOpenedIdentityCustomizeService.iAMJudgeOpenedIdentity());
    } 


}
