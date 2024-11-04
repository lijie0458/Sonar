package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadProductReturnStorageSelect_22DepartmentCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductReturnStorageSelect_22DepartmentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductReturnStorageSelect_22DepartmentCustomizeController {

    @Autowired
    private LoadProductReturnStorageSelect_22DepartmentCustomizeService loadProductReturnStorageSelect_22DepartmentCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5d387780-1643-4f90-919b-e79eb9e1dd12",rules = { })})
    @PostMapping("/api/lcplogics/loadProductReturnStorageSelect_22Department")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258> loadProductReturnStorageSelect_22Department(@RequestBody LoadProductReturnStorageSelect_22DepartmentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductReturnStorageSelect_22DepartmentCustomizeService.loadProductReturnStorageSelect_22Department(body.getPage(), body.getSize()));
    } 


}
