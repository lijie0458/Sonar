package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadPermissionGroupManagementTableView_3CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPermissionGroupManagementTableView_3CustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadPermissionGroupManagementTableView_3CustomizeController {

    @Autowired
    private LoadPermissionGroupManagementTableView_3CustomizeService loadPermissionGroupManagementTableView_3CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "6c7492768fc743a398f5c3c02dd15b2d",rules = { })})
    @PostMapping("/api/lcplogics/loadPermissionGroupManagementTableView_3")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA> loadPermissionGroupManagementTableView_3(@RequestBody LoadPermissionGroupManagementTableView_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPermissionGroupManagementTableView_3CustomizeService.loadPermissionGroupManagementTableView_3(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getPerGrouptId()));
    } 


}
