package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadALLdepartmentCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadALLdepartmentCustomizeController {

    @Autowired
    private LoadALLdepartmentCustomizeService loadALLdepartmentCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "51649b601c8b4f989038233b627b5784",rules = { })})
    @PostMapping("/api/lcplogics/loadALLdepartment")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258> loadALLdepartment() throws Exception {
        return ApiReturn.of(loadALLdepartmentCustomizeService.loadALLdepartment());
    } 


}
