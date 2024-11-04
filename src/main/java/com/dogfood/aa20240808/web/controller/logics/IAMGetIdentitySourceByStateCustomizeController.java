package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMGetIdentitySourceByStateCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.IAMGetIdentitySourceByStateCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMGetIdentitySourceByStateCustomizeController {

    @Autowired
    private IAMGetIdentitySourceByStateCustomizeService iAMGetIdentitySourceByStateCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "79d7094f-075c-4931-91f2-b9ca6b1cd29c",rules = { }),@ValidationRuleGroup(value = "97129bc0-7353-4544-a6c3-fdb18178bcac",rules = { }),@ValidationRuleGroup(value = "cfde2900-b7f0-400e-b848-18c8405e1686",rules = { }),@ValidationRuleGroup(value = "d2616e59bd4c4b96b2dc88fe75e697d0",rules = { }),@ValidationRuleGroup(value = "d7671d26-cb28-4512-92a7-8b8213f4bac8",rules = { }),@ValidationRuleGroup(value = "70907fd0-7915-42c9-88c6-e4cc95a9a759",rules = { }),@ValidationRuleGroup(value = "de4cb818-094a-4c5a-bf80-41b9e1772701",rules = { }),@ValidationRuleGroup(value = "f34e7e35-1e5e-4c1e-8b9a-f4cf47692a05",rules = { }),@ValidationRuleGroup(value = "11c25b37-f50b-41c7-8fcc-e62770a181ff",rules = { }),@ValidationRuleGroup(value = "1f595dfb-2cec-479e-ada1-fe3dc1fd7877",rules = { })})
    @PostMapping("/api/lcplogics/IAMGetIdentitySourceByState")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E>> iAMGetIdentitySourceByState(@RequestBody IAMGetIdentitySourceByStateCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMGetIdentitySourceByStateCustomizeService.iAMGetIdentitySourceByState(body.getState()));
    } 


}
