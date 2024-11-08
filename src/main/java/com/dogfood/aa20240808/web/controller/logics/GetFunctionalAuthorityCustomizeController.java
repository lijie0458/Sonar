package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetFunctionalAuthorityCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.PerGroupStructureStructure; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetFunctionalAuthorityCustomizeController {

    @Autowired
    private GetFunctionalAuthorityCustomizeService getFunctionalAuthorityCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "a5ac8f04ff3b4d45b1873e43f53f54a9",rules = { }),@ValidationRuleGroup(value = "8dfd90255e824c3993a51f18237d9572",rules = { })})
    @PostMapping("/api/lcplogics/getFunctionalAuthority")
    public ApiReturn<List<PerGroupStructureStructure>> getFunctionalAuthority() throws Exception {
        return ApiReturn.of(getFunctionalAuthorityCustomizeService.getFunctionalAuthority());
    } 

}
