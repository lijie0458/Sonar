package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.AutoGenerationProductReturnStorageCodeCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class AutoGenerationProductReturnStorageCodeCustomizeController {

    @Autowired
    private AutoGenerationProductReturnStorageCodeCustomizeService autoGenerationProductReturnStorageCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "cdedb8c7c47740598a57fd32c7d7db1a",rules = { })})
    @PostMapping("/api/lcplogics/autoGenerationProductReturnStorageCode")
    public ApiReturn<String> autoGenerationProductReturnStorageCode() throws Exception {
        return ApiReturn.of(autoGenerationProductReturnStorageCodeCustomizeService.autoGenerationProductReturnStorageCode());
    } 
}
