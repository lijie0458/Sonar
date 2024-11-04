package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductInStorageDetailsSelect_20CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadProductInStorageDetailsSelect_20CustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductInStorageDetailsSelect_20CustomizeController {

    @Autowired
    private LoadProductInStorageDetailsSelect_20CustomizeService loadProductInStorageDetailsSelect_20CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "ef6f1088-b504-482d-8fc3-1134d52bacd7",rules = { }),@ValidationRuleGroup(value = "55da87aad4e74a949de18f78d6578672",rules = { })})
    @PostMapping("/api/lcplogics/loadProductInStorageDetailsSelect_20")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445> loadProductInStorageDetailsSelect_20(@RequestBody LoadProductInStorageDetailsSelect_20CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductInStorageDetailsSelect_20CustomizeService.loadProductInStorageDetailsSelect_20(body.getPage(), body.getSize()));
    } 


}
