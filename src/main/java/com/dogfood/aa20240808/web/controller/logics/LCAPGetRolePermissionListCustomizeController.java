package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0136396D558BF391361EA94F4EF87419; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetRolePermissionListCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LCAPGetRolePermissionListCustomizeService; 

@RestController
public class LCAPGetRolePermissionListCustomizeController {

    @Autowired
    private LCAPGetRolePermissionListCustomizeService lCAPGetRolePermissionListCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bf227c1bf20f486ba4b2ea292f99e88d",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetRolePermissionList")
    public ApiReturn<AnonymousStructure_0136396D558BF391361EA94F4EF87419> lCAPGetRolePermissionList(@RequestBody LCAPGetRolePermissionListCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetRolePermissionListCustomizeService.lCAPGetRolePermissionList(body.getInputRoleId()));
    } 

}
