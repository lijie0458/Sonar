package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetPermissionIdListByRoleIdCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetPermissionIdListByRoleIdCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetPermissionIdListByRoleIdCustomizeController {

    @Autowired
    private GetPermissionIdListByRoleIdCustomizeService getPermissionIdListByRoleIdCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "35ae8fc78af34e209d4aff7154586677",rules = { }),@ValidationRuleGroup(value = "caf8d483ccae4425ab3e9e7bbd5c7f77",rules = { })})
    @PostMapping("/api/lcplogics/getPermissionIdListByRoleId")
    public ApiReturn<List<Long>> getPermissionIdListByRoleId(@RequestBody GetPermissionIdListByRoleIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getPermissionIdListByRoleIdCustomizeService.getPermissionIdListByRoleId(body.getRoleId()));
    } 

}
