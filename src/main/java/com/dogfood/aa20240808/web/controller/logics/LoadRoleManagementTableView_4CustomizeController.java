package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0E757B1AAF447AED4AA6B80418B28944; 
import com.dogfood.aa20240808.service.logics.LoadRoleManagementTableView_4CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadRoleManagementTableView_4CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadRoleManagementTableView_4CustomizeController {

    @Autowired
    private LoadRoleManagementTableView_4CustomizeService loadRoleManagementTableView_4CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "87efe9e1fcb24b1f8e3f3fad041f8584",rules = { })})
    @PostMapping("/api/lcplogics/loadRoleManagementTableView_4")
    public ApiReturn<AnonymousStructure_0E757B1AAF447AED4AA6B80418B28944> loadRoleManagementTableView_4(@RequestBody LoadRoleManagementTableView_4CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadRoleManagementTableView_4CustomizeService.loadRoleManagementTableView_4(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getRoleId()));
    } 

}
