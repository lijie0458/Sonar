package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.service.logics.GetPurchaseTrendCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetPurchaseTrendCustomizeController {

    @Autowired
    private GetPurchaseTrendCustomizeService getPurchaseTrendCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3717cce88cb14d629b2c817f3c0c36d0",rules = { })})
    @PostMapping("/api/lcplogics/getPurchaseTrend")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151>> getPurchaseTrend() throws Exception {
        return ApiReturn.of(getPurchaseTrendCustomizeService.getPurchaseTrend());
    } 


}
