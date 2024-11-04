package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.AutoGenerteOutsourceInSCodeCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class AutoGenerteOutsourceInSCodeCustomizeController {

    @Autowired
    private AutoGenerteOutsourceInSCodeCustomizeService autoGenerteOutsourceInSCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "ade3bb20-28ca-45a0-b1d8-9b472a279eb0",rules = { })})
    @PostMapping("/api/lcplogics/autoGenerteOutsourceInSCode")
    public ApiReturn<String> autoGenerteOutsourceInSCode() throws Exception {
        return ApiReturn.of(autoGenerteOutsourceInSCodeCustomizeService.autoGenerteOutsourceInSCode());
    } 


}
