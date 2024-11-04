package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.PERGetAllRoleCustomizeService; 

@RestController
public class PERGetAllRoleCustomizeController {

    @Autowired
    private PERGetAllRoleCustomizeService pERGetAllRoleCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "62296c2e-bd4d-4709-8bad-d6faad141d84",rules = { }),@ValidationRuleGroup(value = "e011f545-edd2-4db7-8ad0-86f6821c99b6",rules = { }),@ValidationRuleGroup(value = "e24e1dd2-08a2-4624-a055-347d8f9ed150",rules = { }),@ValidationRuleGroup(value = "bba9c4a5-8897-41f9-9b88-3197ca7a47a3",rules = { })})
    @PostMapping("/api/lcplogics/PERGetAllRole")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70791B893F53C2EFB9E501591763B020>> pERGetAllRole() throws Exception {
        return ApiReturn.of(pERGetAllRoleCustomizeService.pERGetAllRole());
    } 


}
