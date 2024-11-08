package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetDataViewAuthorityCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetDataViewAuthorityCustomizeController {

    @Autowired
    private GetDataViewAuthorityCustomizeService getDataViewAuthorityCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "f93a3398a4cb4dbdaaab5bdb05265535",rules = { })})
    @PostMapping("/api/lcplogics/getDataViewAuthority")
    public ApiReturn<List<String>> getDataViewAuthority() throws Exception {
        return ApiReturn.of(getDataViewAuthorityCustomizeService.getDataViewAuthority());
    } 

}
