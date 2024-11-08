package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DFA4155F3C7CA9FA5C9E3897E0169A73; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.PERGetAllOrganizationCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERGetAllOrganizationCustomizeController {

    @Autowired
    private PERGetAllOrganizationCustomizeService pERGetAllOrganizationCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "25e187d5-0144-45ce-ba6f-d991cc74d0c5",rules = { }),@ValidationRuleGroup(value = "df9d644a-6f38-43bc-8087-c7065efe336e",rules = { })})
    @PostMapping("/api/lcplogics/PERGetAllOrganization")
    public ApiReturn<AnonymousStructure_DFA4155F3C7CA9FA5C9E3897E0169A73> pERGetAllOrganization() throws Exception {
        return ApiReturn.of(pERGetAllOrganizationCustomizeService.pERGetAllOrganization());
    } 

}
