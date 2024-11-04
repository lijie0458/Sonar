package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.AutoGenertewarehousingNumCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class AutoGenertewarehousingNumCustomizeController {

    @Autowired
    private AutoGenertewarehousingNumCustomizeService autoGenertewarehousingNumCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "a87a020374b94530b74e83e19a75f051",rules = { })})
    @PostMapping("/api/lcplogics/autoGenertewarehousingNum")
    public ApiReturn<String> autoGenertewarehousingNum() throws Exception {
        return ApiReturn.of(autoGenertewarehousingNumCustomizeService.autoGenertewarehousingNum());
    } 


}
