package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadProductReturnStorageDetailsSelect_1CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductReturnStorageDetailsSelect_1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductReturnStorageDetailsSelect_1CustomizeController {

    @Autowired
    private LoadProductReturnStorageDetailsSelect_1CustomizeService loadProductReturnStorageDetailsSelect_1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "b7cfcd2e2e034d9f814867d8900f8510",rules = { })})
    @PostMapping("/api/lcplogics/loadProductReturnStorageDetailsSelect_1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1416F1A429B2FBD7D325ACBFB771EF7> loadProductReturnStorageDetailsSelect_1(@RequestBody LoadProductReturnStorageDetailsSelect_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductReturnStorageDetailsSelect_1CustomizeService.loadProductReturnStorageDetailsSelect_1(body.getPage(), body.getSize(), body.getIsUpdate()));
    } 


}
