package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.AutoGenerationOutsourceReturnSCodeCustomizeService; 

@RestController
public class AutoGenerationOutsourceReturnSCodeCustomizeController {

    @Autowired
    private AutoGenerationOutsourceReturnSCodeCustomizeService autoGenerationOutsourceReturnSCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "59bf2de7-bdb0-4052-bd92-1d7bfabf8a3d",rules = { })})
    @PostMapping("/api/lcplogics/autoGenerationOutsourceReturnSCode")
    public ApiReturn<String> autoGenerationOutsourceReturnSCode() throws Exception {
        return ApiReturn.of(autoGenerationOutsourceReturnSCodeCustomizeService.autoGenerationOutsourceReturnSCode());
    } 

}
