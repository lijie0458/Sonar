package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseRequestOrderCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseRequestOrderCustomizeControllerDto; 

@RestController
public class LoadPurchaseRequestOrderCustomizeController {

    @Autowired
    private LoadPurchaseRequestOrderCustomizeService loadPurchaseRequestOrderCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "96022dfbb10a43d4b13f778794abd8e8",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseRequestOrder")
    public ApiReturn<AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76> loadPurchaseRequestOrder(@RequestBody LoadPurchaseRequestOrderCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseRequestOrderCustomizeService.loadPurchaseRequestOrder(body.getCode()));
    } 

}
