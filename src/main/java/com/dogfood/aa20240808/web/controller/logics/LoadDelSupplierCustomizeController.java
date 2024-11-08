package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadDelSupplierCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDelSupplierCustomizeControllerDto; 

@RestController
public class LoadDelSupplierCustomizeController {

    @Autowired
    private LoadDelSupplierCustomizeService loadDelSupplierCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "2ab0b3f02101489291ebeaffb9f6797f",rules = { })})
    @PostMapping("/api/lcplogics/loadDelSupplier")
    public ApiReturn<Boolean> loadDelSupplier(@RequestBody LoadDelSupplierCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDelSupplierCustomizeService.loadDelSupplier(body.getParam1()));
    } 

}
