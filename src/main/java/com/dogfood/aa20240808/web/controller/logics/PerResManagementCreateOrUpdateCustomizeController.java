package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.PerResManagementCreateOrUpdateCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.PerResManagementCreateOrUpdateCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PerResManagementCreateOrUpdateCustomizeController {

    @Autowired
    private PerResManagementCreateOrUpdateCustomizeService perResManagementCreateOrUpdateCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "7a921b8921c34b82941e2e42c3adc130",rules = { @ValidationRule(value = "required",targetName = "body.input.name",argvs = "",errorMsg = "权限名称不得为空")}),@ValidationRuleGroup(value = "580b8ecfe19d47b18a6eafda228c6b1a",rules = { @ValidationRule(value = "required",targetName = "body.input.name",argvs = "",errorMsg = "权限名称不得为空")})})
    @PostMapping("/api/lcplogics/perResManagementCreateOrUpdate")
    public void perResManagementCreateOrUpdate(@RequestBody PerResManagementCreateOrUpdateCustomizeControllerDto body) throws Exception {
        perResManagementCreateOrUpdateCustomizeService.perResManagementCreateOrUpdate(body.getInput(), body.getIsUpdate(), body.getSelectedResData());
    } 


}
