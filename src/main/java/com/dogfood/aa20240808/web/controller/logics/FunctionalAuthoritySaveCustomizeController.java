package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.FunctionalAuthoritySaveCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.FunctionalAuthoritySaveCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class FunctionalAuthoritySaveCustomizeController {

    @Autowired
    private FunctionalAuthoritySaveCustomizeService functionalAuthoritySaveCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "d22d72dca5a64f638edf33e5d239c869",rules = { })})
    @PostMapping("/api/lcplogics/FunctionalAuthoritySave")
    public void functionalAuthoritySave(@RequestBody FunctionalAuthoritySaveCustomizeControllerDto body) throws Exception {
        functionalAuthoritySaveCustomizeService.functionalAuthoritySave(body.getSelectedList(), body.getRoleId());
    } 


}
