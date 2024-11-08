package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.GetMaterialCodeCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetMaterialCodeCustomizeControllerDto; 

@RestController
public class GetMaterialCodeCustomizeController {

    @Autowired
    private GetMaterialCodeCustomizeService getMaterialCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "f78ec9c016dc4752b1abfd44b01939c8",rules = { })})
    @PostMapping("/api/lcplogics/getMaterialCode")
    public ApiReturn<Boolean> getMaterialCode(@RequestBody GetMaterialCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getMaterialCodeCustomizeService.getMaterialCode(body.getMaterialCode()));
    } 

}
