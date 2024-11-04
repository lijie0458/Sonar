package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadTransferSlipCustomizeService; 

@RestController
public class LoadTransferSlipCustomizeController {

    @Autowired
    private LoadTransferSlipCustomizeService loadTransferSlipCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "2e08a8da-6c14-4828-8069-e70d92ead6e5",rules = { })})
    @PostMapping("/api/lcplogics/loadTransferSlip")
    public ApiReturn<String> loadTransferSlip() throws Exception {
        return ApiReturn.of(loadTransferSlipCustomizeService.loadTransferSlip());
    } 


}
