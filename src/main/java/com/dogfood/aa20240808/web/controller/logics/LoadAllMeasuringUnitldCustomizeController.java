package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadAllMeasuringUnitldCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAllMeasuringUnitldCustomizeController {

    @Autowired
    private LoadAllMeasuringUnitldCustomizeService loadAllMeasuringUnitldCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "78f42f526fc64938827bfd602b6d6372",rules = { })})
    @PostMapping("/api/lcplogics/loadAllMeasuringUnitld")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85> loadAllMeasuringUnitld() throws Exception {
        return ApiReturn.of(loadAllMeasuringUnitldCustomizeService.loadAllMeasuringUnitld());
    } 


}
