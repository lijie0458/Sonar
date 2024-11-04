package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LCAPGetUserByUserIdCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetUserByUserIdCustomizeControllerDto; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPGetUserByUserIdCustomizeController {

    @Autowired
    private LCAPGetUserByUserIdCustomizeService lCAPGetUserByUserIdCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "38d3629ca7d64149bbf9e788d364b108",rules = { }),@ValidationRuleGroup(value = "ef1c5534-6c7f-4be6-b44d-417272a83adc",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetUserByUserId")
    public ApiReturn<LCAPUser> lCAPGetUserByUserId(@RequestBody LCAPGetUserByUserIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetUserByUserIdCustomizeService.lCAPGetUserByUserId(body.getUserId()));
    } 


}
