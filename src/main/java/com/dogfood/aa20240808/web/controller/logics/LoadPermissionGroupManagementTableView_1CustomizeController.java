package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPermissionGroupManagementTableView_1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadPermissionGroupManagementTableView_1CustomizeService; 

@RestController
public class LoadPermissionGroupManagementTableView_1CustomizeController {

    @Autowired
    private LoadPermissionGroupManagementTableView_1CustomizeService loadPermissionGroupManagementTableView_1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "9a5120d2c4af471b85bb341a19c01da3",rules = { }),@ValidationRuleGroup(value = "7dbf4fe64ead4193ae824ff72cf00c95",rules = { })})
    @PostMapping("/api/lcplogics/loadPermissionGroupManagementTableView_1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7AA66D6E2A21E3101B9C2B73B7971B38> loadPermissionGroupManagementTableView_1(@RequestBody LoadPermissionGroupManagementTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPermissionGroupManagementTableView_1CustomizeService.loadPermissionGroupManagementTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
