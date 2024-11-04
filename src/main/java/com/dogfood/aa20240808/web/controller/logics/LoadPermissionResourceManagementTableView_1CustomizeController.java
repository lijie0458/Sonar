package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadPermissionResourceManagementTableView_1CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPermissionResourceManagementTableView_1CustomizeControllerDto; 

@RestController
public class LoadPermissionResourceManagementTableView_1CustomizeController {

    @Autowired
    private LoadPermissionResourceManagementTableView_1CustomizeService loadPermissionResourceManagementTableView_1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "782f18ae87394c78abe54a3a58e9e43c",rules = { })})
    @PostMapping("/api/lcplogics/loadPermissionResourceManagementTableView_1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D5C9C5DD94C4E7386BEED9E75D0F06FA> loadPermissionResourceManagementTableView_1(@RequestBody LoadPermissionResourceManagementTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPermissionResourceManagementTableView_1CustomizeService.loadPermissionResourceManagementTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
