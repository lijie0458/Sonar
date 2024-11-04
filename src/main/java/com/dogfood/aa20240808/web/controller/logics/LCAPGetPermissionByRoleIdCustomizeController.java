package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LCAPGetPermissionByRoleIdCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetPermissionByRoleIdCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

@RestController
public class LCAPGetPermissionByRoleIdCustomizeController {

    @Autowired
    private LCAPGetPermissionByRoleIdCustomizeService lCAPGetPermissionByRoleIdCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "022bb889b29a436fb1b677d2997625b4",rules = { }),@ValidationRuleGroup(value = "c56618e87d774f40b513f51de20bfc64",rules = { }),@ValidationRuleGroup(value = "69b84106325d4839a497f515e7a7557c",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetPermissionByRoleId")
    public ApiReturn<List<LCAPPermission>> lCAPGetPermissionByRoleId(@RequestBody LCAPGetPermissionByRoleIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetPermissionByRoleIdCustomizeService.lCAPGetPermissionByRoleId(body.getRoleId()));
    } 


}
