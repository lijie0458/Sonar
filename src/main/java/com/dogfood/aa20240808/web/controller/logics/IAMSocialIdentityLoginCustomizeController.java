package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMSocialIdentityLoginCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.IAMSocialIdentityLoginCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMSocialIdentityLoginCustomizeController {

    @Autowired
    private IAMSocialIdentityLoginCustomizeService iAMSocialIdentityLoginCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "397e1877-9c8c-4b62-94c4-4779364f40f5",rules = { })})
    @PostMapping("/api/lcplogics/IAMSocialIdentityLogin")
    public ApiReturn<String> iAMSocialIdentityLogin(@RequestBody IAMSocialIdentityLoginCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMSocialIdentityLoginCustomizeService.iAMSocialIdentityLogin(body.getCode(), body.getSource()));
    } 

}
