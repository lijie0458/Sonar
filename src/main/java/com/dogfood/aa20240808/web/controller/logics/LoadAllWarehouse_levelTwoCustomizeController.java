package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadAllWarehouse_levelTwoCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAllWarehouse_levelTwoCustomizeController {

    @Autowired
    private LoadAllWarehouse_levelTwoCustomizeService loadAllWarehouse_levelTwoCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "acced951253749bab9c8254928233c6a",rules = { })})
    @PostMapping("/api/lcplogics/loadAllWarehouse_levelTwo")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3> loadAllWarehouse_levelTwo() throws Exception {
        return ApiReturn.of(loadAllWarehouse_levelTwoCustomizeService.loadAllWarehouse_levelTwo());
    } 


}
