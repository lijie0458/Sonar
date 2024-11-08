package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadMaterialSelectMaterial1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadMaterialSelectMaterial1CustomizeController {

    @Autowired
    private LoadMaterialSelectMaterial1CustomizeService loadMaterialSelectMaterial1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "5047b94ac90e4384add378be08989c82",rules = { })})
    @PostMapping("/api/lcplogics/loadMaterialSelectMaterial1")
    public ApiReturn<AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C> loadMaterialSelectMaterial1() throws Exception {
        return ApiReturn.of(loadMaterialSelectMaterial1CustomizeService.loadMaterialSelectMaterial1());
    } 

}
