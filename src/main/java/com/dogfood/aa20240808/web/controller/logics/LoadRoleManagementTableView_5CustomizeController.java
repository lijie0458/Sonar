package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadRoleManagementTableView_5CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadRoleManagementTableView_5CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadRoleManagementTableView_5CustomizeController {

    @Autowired
    private LoadRoleManagementTableView_5CustomizeService loadRoleManagementTableView_5CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "c665f0ab6d9f4803941b92b92f1f1965",rules = { })})
    @PostMapping("/api/lcplogics/loadRoleManagementTableView_5")
    public ApiReturn<AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73> loadRoleManagementTableView_5(@RequestBody LoadRoleManagementTableView_5CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadRoleManagementTableView_5CustomizeService.loadRoleManagementTableView_5(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getRoleId()));
    } 

}
