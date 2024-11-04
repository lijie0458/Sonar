package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPIsRoleNameRepeatedCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LCAPIsRoleNameRepeatedCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPIsRoleNameRepeatedCustomizeController {

    @Autowired
    private LCAPIsRoleNameRepeatedCustomizeService lCAPIsRoleNameRepeatedCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c32baaca823943f68d51aa3d5c325bce",rules = { })})
    @PostMapping("/api/lcplogics/LCAPIsRoleNameRepeated")
    public ApiReturn<Boolean> lCAPIsRoleNameRepeated(@RequestBody LCAPIsRoleNameRepeatedCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPIsRoleNameRepeatedCustomizeService.lCAPIsRoleNameRepeated(body.getRoleName()));
    } 


}
