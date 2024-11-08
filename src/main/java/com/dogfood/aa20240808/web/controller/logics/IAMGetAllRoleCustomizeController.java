package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.IAMGetAllRoleCustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1F7B77FE76090915A8B00D40711CE1D; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMGetAllRoleCustomizeController {

    @Autowired
    private IAMGetAllRoleCustomizeService iAMGetAllRoleCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bca1b2db-a53f-4248-828a-4b4d7b5d524c",rules = { })})
    @PostMapping("/api/lcplogics/IAMGetAllRole")
    public ApiReturn<AnonymousStructure_D1F7B77FE76090915A8B00D40711CE1D> iAMGetAllRole() throws Exception {
        return ApiReturn.of(iAMGetAllRoleCustomizeService.iAMGetAllRole());
    } 

}
