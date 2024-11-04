package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.PERLoadRolePerTableViewCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERLoadRolePerTableViewCustomizeController {

    @Autowired
    private PERLoadRolePerTableViewCustomizeService pERLoadRolePerTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "f5b7c1d3-6438-4b78-b1a5-d16e3fff213c",rules = { })})
    @PostMapping("/api/lcplogics/PERLoadRolePerTableView")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_816CAAB437568B2007971AECDC69D188>> pERLoadRolePerTableView() throws Exception {
        return ApiReturn.of(pERLoadRolePerTableViewCustomizeService.pERLoadRolePerTableView());
    } 


}
