package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.PERLoadResourceConfigTableViewCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERLoadResourceConfigTableViewCustomizeController {

    @Autowired
    private PERLoadResourceConfigTableViewCustomizeService pERLoadResourceConfigTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "902668cd-27b1-4eb2-b59a-3191e93668b0",rules = { })})
    @PostMapping("/api/lcplogics/PERLoadResourceConfigTableView")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_816CAAB437568B2007971AECDC69D188>> pERLoadResourceConfigTableView() throws Exception {
        return ApiReturn.of(pERLoadResourceConfigTableViewCustomizeService.pERLoadResourceConfigTableView());
    } 


}
