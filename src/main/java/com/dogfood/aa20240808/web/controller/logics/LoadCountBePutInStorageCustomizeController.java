package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadCountBePutInStorageCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountBePutInStorageCustomizeController {

    @Autowired
    private LoadCountBePutInStorageCustomizeService loadCountBePutInStorageCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "2b2b71a9-c643-4a93-8962-b4624d983681",rules = { })})
    @PostMapping("/api/lcplogics/loadCountBePutInStorage")
    public ApiReturn<String> loadCountBePutInStorage() throws Exception {
        return ApiReturn.of(loadCountBePutInStorageCustomizeService.loadCountBePutInStorage());
    } 

}
