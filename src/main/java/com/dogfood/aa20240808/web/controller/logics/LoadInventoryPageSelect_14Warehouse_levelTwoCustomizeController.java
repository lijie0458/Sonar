package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadInventoryPageSelect_14Warehouse_levelTwoCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadInventoryPageSelect_14Warehouse_levelTwoCustomizeControllerDto; 

@RestController
public class LoadInventoryPageSelect_14Warehouse_levelTwoCustomizeController {

    @Autowired
    private LoadInventoryPageSelect_14Warehouse_levelTwoCustomizeService loadInventoryPageSelect_14Warehouse_levelTwoCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "859d8b66-93cf-4512-a132-518d3a54152b",rules = { })})
    @PostMapping("/api/lcplogics/loadInventoryPageSelect_14Warehouse_levelTwo")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3> loadInventoryPageSelect_14Warehouse_levelTwo(@RequestBody LoadInventoryPageSelect_14Warehouse_levelTwoCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadInventoryPageSelect_14Warehouse_levelTwoCustomizeService.loadInventoryPageSelect_14Warehouse_levelTwo(body.getPage(), body.getSize()));
    } 


}
