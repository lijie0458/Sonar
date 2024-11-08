package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.GetDataEditAuthorityCustomizeService; 

@RestController
public class GetDataEditAuthorityCustomizeController {

    @Autowired
    private GetDataEditAuthorityCustomizeService getDataEditAuthorityCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "70ef0414887243f9be0d8bdec2bc47cf",rules = { })})
    @PostMapping("/api/lcplogics/getDataEditAuthority")
    public ApiReturn<List<String>> getDataEditAuthority() throws Exception {
        return ApiReturn.of(getDataEditAuthorityCustomizeService.getDataEditAuthority());
    } 

}
