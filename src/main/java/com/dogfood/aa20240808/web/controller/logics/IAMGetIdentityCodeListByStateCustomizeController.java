package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.IAMGetIdentityCodeListByStateCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMGetIdentityCodeListByStateCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMGetIdentityCodeListByStateCustomizeController {

    @Autowired
    private IAMGetIdentityCodeListByStateCustomizeService iAMGetIdentityCodeListByStateCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "17ac7c5e-38f8-4526-b2fd-58c5eebec7d8",rules = { }),@ValidationRuleGroup(value = "147c2b80-a45f-4c29-a1e9-1398a064ca19",rules = { }),@ValidationRuleGroup(value = "ca158622-78b7-400c-b108-c0c64b09d32f",rules = { }),@ValidationRuleGroup(value = "0ee853b9-eb89-44f2-82f7-d5e0f2137dce",rules = { }),@ValidationRuleGroup(value = "19b914aa-e2fd-4ffd-8000-a10e20d15f08",rules = { })})
    @PostMapping("/api/lcplogics/IAMGetIdentityCodeListByState")
    public ApiReturn<List<String>> iAMGetIdentityCodeListByState(@RequestBody IAMGetIdentityCodeListByStateCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMGetIdentityCodeListByStateCustomizeService.iAMGetIdentityCodeListByState(body.getState()));
    } 


}
