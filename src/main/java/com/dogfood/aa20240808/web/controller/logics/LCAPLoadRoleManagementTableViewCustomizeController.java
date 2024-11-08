package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPLoadRoleManagementTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LCAPLoadRoleManagementTableViewCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6; 

@RestController
public class LCAPLoadRoleManagementTableViewCustomizeController {

    @Autowired
    private LCAPLoadRoleManagementTableViewCustomizeService lCAPLoadRoleManagementTableViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "43c894bde23345d48f4cecb81b3a8b97",rules = { })})
    @PostMapping("/api/lcplogics/LCAPLoadRoleManagementTableView")
    public ApiReturn<AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6> lCAPLoadRoleManagementTableView(@RequestBody LCAPLoadRoleManagementTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPLoadRoleManagementTableViewCustomizeService.lCAPLoadRoleManagementTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 

}
