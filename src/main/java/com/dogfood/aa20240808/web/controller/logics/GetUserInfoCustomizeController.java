package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.GetUserInfoCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetUserInfoCustomizeController {

    @Autowired
    private GetUserInfoCustomizeService getUserInfoCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "02b60ac77e8d4a64a716b2db8865dc6a",rules = { })})
    @PostMapping("/api/lcplogics/getUserInfo")
    public ApiReturn<AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D> getUserInfo() throws Exception {
        return ApiReturn.of(getUserInfoCustomizeService.getUserInfo());
    } 

}
