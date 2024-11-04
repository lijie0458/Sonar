package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.BaseResultStructure; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMGetConfigCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.IAMGetConfigCustomizeService; 

@RestController
public class IAMGetConfigCustomizeController {

    @Autowired
    private IAMGetConfigCustomizeService iAMGetConfigCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "8995e14f-12ad-47d0-aba5-c0efd17e38f8",rules = { }),@ValidationRuleGroup(value = "002349fe-ce2c-4115-b709-f9eac2ff05b0",rules = { }),@ValidationRuleGroup(value = "9ece2f9a6f8e4537a53cfe5b500e78de",rules = { }),@ValidationRuleGroup(value = "fa392219-3559-4add-927e-3c9c6144089c",rules = { }),@ValidationRuleGroup(value = "31297201-e9a9-4be9-9a4d-dddf9caeb3c2",rules = { }),@ValidationRuleGroup(value = "a3c03760-4ed8-447d-be3d-db3e5cc635b1",rules = { }),@ValidationRuleGroup(value = "60c9873d-a66c-4ed1-bb16-906c76842552",rules = { }),@ValidationRuleGroup(value = "6661abad105848b59b39dcbec0236565",rules = { })})
    @PostMapping("/api/lcplogics/IAMGetConfig")
    public ApiReturn<BaseResultStructure> iAMGetConfig(@RequestBody IAMGetConfigCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMGetConfigCustomizeService.iAMGetConfig(body.getType(), body.getState()));
    } 


}
