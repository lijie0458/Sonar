package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadCountPurchaseRequestCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountPurchaseRequestCustomizeController {

    @Autowired
    private LoadCountPurchaseRequestCustomizeService loadCountPurchaseRequestCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bf9c36dd-3ddc-4a1a-8584-23c30474c491",rules = { })})
    @PostMapping("/api/lcplogics/loadCountPurchaseRequest")
    public ApiReturn<String> loadCountPurchaseRequest() throws Exception {
        return ApiReturn.of(loadCountPurchaseRequestCustomizeService.loadCountPurchaseRequest());
    } 

}
