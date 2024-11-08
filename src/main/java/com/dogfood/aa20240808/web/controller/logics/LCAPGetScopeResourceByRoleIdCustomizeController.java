package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetScopeResourceByRoleIdCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B676D945A9DD0D6FB27D68FFAC48D5EE; 
import com.dogfood.aa20240808.service.logics.LCAPGetScopeResourceByRoleIdCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPGetScopeResourceByRoleIdCustomizeController {

    @Autowired
    private LCAPGetScopeResourceByRoleIdCustomizeService lCAPGetScopeResourceByRoleIdCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "c65908077fab44ba8480ecb96443b7a3",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetScopeResourceByRoleId")
    public ApiReturn<AnonymousStructure_B676D945A9DD0D6FB27D68FFAC48D5EE> lCAPGetScopeResourceByRoleId(@RequestBody LCAPGetScopeResourceByRoleIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetScopeResourceByRoleIdCustomizeService.lCAPGetScopeResourceByRoleId(body.getRoleId()));
    } 

}
