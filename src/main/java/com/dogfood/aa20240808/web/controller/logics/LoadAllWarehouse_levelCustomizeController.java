package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadAllWarehouse_levelCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAllWarehouse_levelCustomizeController {

    @Autowired
    private LoadAllWarehouse_levelCustomizeService loadAllWarehouse_levelCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c64496c5629f4b79b3465b666051dc82",rules = { })})
    @PostMapping("/api/lcplogics/loadAllWarehouse_level")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB> loadAllWarehouse_level() throws Exception {
        return ApiReturn.of(loadAllWarehouse_levelCustomizeService.loadAllWarehouse_level());
    } 


}
