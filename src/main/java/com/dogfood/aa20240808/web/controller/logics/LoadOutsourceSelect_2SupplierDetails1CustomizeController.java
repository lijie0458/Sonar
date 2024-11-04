package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOutsourceSelect_2SupplierDetails1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadOutsourceSelect_2SupplierDetails1CustomizeService; 

@RestController
public class LoadOutsourceSelect_2SupplierDetails1CustomizeController {

    @Autowired
    private LoadOutsourceSelect_2SupplierDetails1CustomizeService loadOutsourceSelect_2SupplierDetails1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3681b2b0-8ddb-4e2c-881a-326188797e0d",rules = { })})
    @PostMapping("/api/lcplogics/loadOutsourceSelect_2SupplierDetails1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7> loadOutsourceSelect_2SupplierDetails1(@RequestBody LoadOutsourceSelect_2SupplierDetails1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOutsourceSelect_2SupplierDetails1CustomizeService.loadOutsourceSelect_2SupplierDetails1(body.getPage(), body.getSize()));
    } 


}
