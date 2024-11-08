package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4; 
import com.dogfood.aa20240808.service.logics.LoadSupplierWithoutCurrentCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSupplierWithoutCurrentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSupplierWithoutCurrentCustomizeController {

    @Autowired
    private LoadSupplierWithoutCurrentCustomizeService loadSupplierWithoutCurrentCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "b7010886228240a1b03a29ea790e11d6",rules = { })})
    @PostMapping("/api/lcplogics/loadSupplierWithoutCurrent")
    public ApiReturn<AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4> loadSupplierWithoutCurrent(@RequestBody LoadSupplierWithoutCurrentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSupplierWithoutCurrentCustomizeService.loadSupplierWithoutCurrent(body.getCurrentSupplierId()));
    } 

}
