package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.IAMGetUserByUserIdCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMGetUserByUserIdCustomizeControllerDto; 

@RestController
public class IAMGetUserByUserIdCustomizeController {

    @Autowired
    private IAMGetUserByUserIdCustomizeService iAMGetUserByUserIdCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "5480a9d9-d911-4177-8481-ddb16349a292",rules = { })})
    @PostMapping("/api/lcplogics/IAMGetUserByUserId")
    public ApiReturn<LCAPUser> iAMGetUserByUserId(@RequestBody IAMGetUserByUserIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMGetUserByUserIdCustomizeService.iAMGetUserByUserId(body.getUserId()));
    } 

}
