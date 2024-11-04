package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadPermissionGroupManagementTableView_2CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPermissionGroupManagementTableView_2CustomizeControllerDto; 

@RestController
public class LoadPermissionGroupManagementTableView_2CustomizeController {

    @Autowired
    private LoadPermissionGroupManagementTableView_2CustomizeService loadPermissionGroupManagementTableView_2CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3b3c7495d98c43d79bdc476f845b66f2",rules = { })})
    @PostMapping("/api/lcplogics/loadPermissionGroupManagementTableView_2")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_63A62260FC029F5392CCD931B361AF92> loadPermissionGroupManagementTableView_2(@RequestBody LoadPermissionGroupManagementTableView_2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPermissionGroupManagementTableView_2CustomizeService.loadPermissionGroupManagementTableView_2(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getPerGroupId()));
    } 


}
