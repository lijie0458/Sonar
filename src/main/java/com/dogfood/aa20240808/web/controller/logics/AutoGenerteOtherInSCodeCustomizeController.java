package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.AutoGenerteOtherInSCodeCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class AutoGenerteOtherInSCodeCustomizeController {

    @Autowired
    private AutoGenerteOtherInSCodeCustomizeService autoGenerteOtherInSCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "0ccd9aec-4ec6-47f7-beca-8ea64d5a204b",rules = { })})
    @PostMapping("/api/lcplogics/autoGenerteOtherInSCode")
    public ApiReturn<String> autoGenerteOtherInSCode() throws Exception {
        return ApiReturn.of(autoGenerteOtherInSCodeCustomizeService.autoGenerteOtherInSCode());
    } 


}
