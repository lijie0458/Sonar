package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.AutomaticallyGenerateSupplierDetailsCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.AutomaticallyGenerateSupplierDetailsCodeCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class AutomaticallyGenerateSupplierDetailsCodeCustomizeController {

    @Autowired
    private AutomaticallyGenerateSupplierDetailsCodeCustomizeService automaticallyGenerateSupplierDetailsCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "7551159b-aa20-47e9-bfba-debd19f885dc",rules = { })})
    @PostMapping("/api/lcplogics/automaticallyGenerateSupplierDetailsCode")
    public ApiReturn<String> automaticallyGenerateSupplierDetailsCode(@RequestBody AutomaticallyGenerateSupplierDetailsCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(automaticallyGenerateSupplierDetailsCodeCustomizeService.automaticallyGenerateSupplierDetailsCode(body.getCode()));
    } 


}
