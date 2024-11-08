package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C; 
import com.dogfood.aa20240808.service.logics.LoadAllMaterialCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAllMaterialCustomizeController {

    @Autowired
    private LoadAllMaterialCustomizeService loadAllMaterialCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bc8dee5f143b407f8af9e53917c3c5cd",rules = { }),@ValidationRuleGroup(value = "a2e60303c15c45589c60ca50044c2078",rules = { })})
    @PostMapping("/api/lcplogics/loadAllMaterial")
    public ApiReturn<AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C> loadAllMaterial() throws Exception {
        return ApiReturn.of(loadAllMaterialCustomizeService.loadAllMaterial());
    } 

}
