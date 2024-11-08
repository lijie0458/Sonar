package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPSearchDeptUsersCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LCAPSearchDeptUsersCustomizeService; 

@RestController
public class LCAPSearchDeptUsersCustomizeController {

    @Autowired
    private LCAPSearchDeptUsersCustomizeService lCAPSearchDeptUsersCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "b12d7f82e25a41eeb8deb7870745d69a",rules = { })})
    @PostMapping("/api/lcplogics/LCAPSearchDeptUsers")
    public ApiReturn<AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E> lCAPSearchDeptUsers(@RequestBody LCAPSearchDeptUsersCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPSearchDeptUsersCustomizeService.lCAPSearchDeptUsers(body.getName()));
    } 

}
