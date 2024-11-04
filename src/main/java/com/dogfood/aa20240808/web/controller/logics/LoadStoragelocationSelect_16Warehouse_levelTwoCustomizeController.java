package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadStoragelocationSelect_16Warehouse_levelTwoCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadStoragelocationSelect_16Warehouse_levelTwoCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadStoragelocationSelect_16Warehouse_levelTwoCustomizeController {

    @Autowired
    private LoadStoragelocationSelect_16Warehouse_levelTwoCustomizeService loadStoragelocationSelect_16Warehouse_levelTwoCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c56e822823d84961a3a96ce46577b477",rules = { }),@ValidationRuleGroup(value = "509a26a3178843e38c6edca46941d1d1",rules = { })})
    @PostMapping("/api/lcplogics/loadStoragelocationSelect_16Warehouse_levelTwo")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3> loadStoragelocationSelect_16Warehouse_levelTwo(@RequestBody LoadStoragelocationSelect_16Warehouse_levelTwoCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadStoragelocationSelect_16Warehouse_levelTwoCustomizeService.loadStoragelocationSelect_16Warehouse_levelTwo(body.getPage(), body.getSize()));
    } 


}
