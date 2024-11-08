package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadAllCustomerManagementCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAllCustomerManagementCustomizeController {

    @Autowired
    private LoadAllCustomerManagementCustomizeService loadAllCustomerManagementCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bd4d54787e1346dd95c0509563a8ac01",rules = { }),@ValidationRuleGroup(value = "0913ab1d89e64fd38d1922b0f9cb61b2",rules = { })})
    @PostMapping("/api/lcplogics/loadAllCustomerManagement")
    public ApiReturn<AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7> loadAllCustomerManagement() throws Exception {
        return ApiReturn.of(loadAllCustomerManagementCustomizeService.loadAllCustomerManagement());
    } 

}
