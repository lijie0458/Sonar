package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LCAPGetAllUsersCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPGetAllUsersCustomizeController {

    @Autowired
    private LCAPGetAllUsersCustomizeService lCAPGetAllUsersCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "8ec30fa8-e553-45a3-a149-0e7feb015f74",rules = { }),@ValidationRuleGroup(value = "4cf74e40cae3410db8d2bcc2b95d19f1",rules = { }),@ValidationRuleGroup(value = "ba7283f8-8d21-4136-a62b-3dc3678d0c0c",rules = { }),@ValidationRuleGroup(value = "36ea8f560eb24517a50069e0c21ffe17",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetAllUsers")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632> lCAPGetAllUsers() throws Exception {
        return ApiReturn.of(lCAPGetAllUsersCustomizeService.lCAPGetAllUsers());
    } 


}
