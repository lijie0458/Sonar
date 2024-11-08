package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.AutoGenerationOtherReturnSCodeCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class AutoGenerationOtherReturnSCodeCustomizeController {

    @Autowired
    private AutoGenerationOtherReturnSCodeCustomizeService autoGenerationOtherReturnSCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "d775cf56-e34b-4c8e-9274-5cdd48f8b845",rules = { })})
    @PostMapping("/api/lcplogics/autoGenerationOtherReturnSCode")
    public ApiReturn<String> autoGenerationOtherReturnSCode() throws Exception {
        return ApiReturn.of(autoGenerationOtherReturnSCodeCustomizeService.autoGenerationOtherReturnSCode());
    } 

}
