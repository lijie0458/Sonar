package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseSelectWarehouse_levelCustomizeService; 

@RestController
public class LoadWarehouseSelectWarehouse_levelCustomizeController {

    @Autowired
    private LoadWarehouseSelectWarehouse_levelCustomizeService loadWarehouseSelectWarehouse_levelCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bffe0150-a391-4935-ab4e-68f35c1eb1aa",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehouseSelectWarehouse_level")
    public ApiReturn<AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB> loadWarehouseSelectWarehouse_level() throws Exception {
        return ApiReturn.of(loadWarehouseSelectWarehouse_levelCustomizeService.loadWarehouseSelectWarehouse_level());
    } 

}
