package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadRoleManagementTableView_2CustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadRoleManagementTableView_2CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6; 

@RestController
public class LoadRoleManagementTableView_2CustomizeController {

    @Autowired
    private LoadRoleManagementTableView_2CustomizeService loadRoleManagementTableView_2CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "e4a4d7af15fc47f48f8fa9994832d83f",rules = { }),@ValidationRuleGroup(value = "1de23dda2827405dbd4b1bb9df828a92",rules = { })})
    @PostMapping("/api/lcplogics/loadRoleManagementTableView_2")
    public ApiReturn<AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6> loadRoleManagementTableView_2(@RequestBody LoadRoleManagementTableView_2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadRoleManagementTableView_2CustomizeService.loadRoleManagementTableView_2(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 

}
