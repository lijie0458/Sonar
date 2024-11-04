package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehouseTableViewCustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseTableViewCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadWarehouseTableViewCustomizeController {

    @Autowired
    private LoadWarehouseTableViewCustomizeService loadWarehouseTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "f88515f2-6bf6-446b-8ed5-9ac67b3c815e",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehouseTableView")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4E11050E3F5E4102B0FBA92E2D111E13> loadWarehouseTableView(@RequestBody LoadWarehouseTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehouseTableViewCustomizeService.loadWarehouseTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
