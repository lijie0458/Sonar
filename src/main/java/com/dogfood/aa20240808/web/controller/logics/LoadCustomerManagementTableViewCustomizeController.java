package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadCustomerManagementTableViewCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadCustomerManagementTableViewCustomizeControllerDto; 

@RestController
public class LoadCustomerManagementTableViewCustomizeController {

    @Autowired
    private LoadCustomerManagementTableViewCustomizeService loadCustomerManagementTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "604f34db-2ac1-4712-adba-611147d719be",rules = { })})
    @PostMapping("/api/lcplogics/loadCustomerManagementTableView")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7> loadCustomerManagementTableView(@RequestBody LoadCustomerManagementTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadCustomerManagementTableViewCustomizeService.loadCustomerManagementTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
