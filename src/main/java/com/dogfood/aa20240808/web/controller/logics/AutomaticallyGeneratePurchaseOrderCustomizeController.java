package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.AutomaticallyGeneratePurchaseOrderCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class AutomaticallyGeneratePurchaseOrderCustomizeController {

    @Autowired
    private AutomaticallyGeneratePurchaseOrderCustomizeService automaticallyGeneratePurchaseOrderCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "aef4a0736c9d47dfb4fd992c447534ea",rules = { })})
    @PostMapping("/api/lcplogics/automaticallyGeneratePurchaseOrder")
    public ApiReturn<String> automaticallyGeneratePurchaseOrder() throws Exception {
        return ApiReturn.of(automaticallyGeneratePurchaseOrderCustomizeService.automaticallyGeneratePurchaseOrder());
    } 

}
