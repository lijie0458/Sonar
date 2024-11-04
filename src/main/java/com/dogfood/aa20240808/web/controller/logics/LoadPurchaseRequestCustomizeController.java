package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseRequestCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseRequestCustomizeControllerDto; 

@RestController
public class LoadPurchaseRequestCustomizeController {

    @Autowired
    private LoadPurchaseRequestCustomizeService loadPurchaseRequestCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "f0579104-ed67-4402-b5e6-e6dc0a6bf7b6",rules = { }),@ValidationRuleGroup(value = "fb84f5d1-0ab6-4857-9990-039c375a6faf",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseRequest")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76> loadPurchaseRequest(@RequestBody LoadPurchaseRequestCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseRequestCustomizeService.loadPurchaseRequest(body.getCode()));
    } 


}
