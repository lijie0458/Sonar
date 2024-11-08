package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseInfoCustomizeService; 

@RestController
public class LoadWarehouseInfoCustomizeController {

    @Autowired
    private LoadWarehouseInfoCustomizeService loadWarehouseInfoCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "8ab65776544a4798a8df62a2b9e58b93",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehouseInfo")
    public ApiReturn<AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3> loadWarehouseInfo() throws Exception {
        return ApiReturn.of(loadWarehouseInfoCustomizeService.loadWarehouseInfo());
    } 

}
