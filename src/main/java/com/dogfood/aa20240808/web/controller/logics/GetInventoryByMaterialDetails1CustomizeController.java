package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetInventoryByMaterialDetails1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetInventoryByMaterialDetails1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import java.math.BigDecimal; 

@RestController
public class GetInventoryByMaterialDetails1CustomizeController {

    @Autowired
    private GetInventoryByMaterialDetails1CustomizeService getInventoryByMaterialDetails1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "1007dda7e2d7485d8fc6b385ac87ef7b",rules = { }),@ValidationRuleGroup(value = "439dcc05f46c458f904f881457bfff03",rules = { }),@ValidationRuleGroup(value = "7e263f93b2a140edbfa8154dd3571fa2",rules = { }),@ValidationRuleGroup(value = "01b165a7b5ee4e4c8d4e0ec780368e09",rules = { }),@ValidationRuleGroup(value = "5fe70daebb8e4163a7ba52433aefb248",rules = { }),@ValidationRuleGroup(value = "b71cc3a36c18489ca68f110d9851e06b",rules = { })})
    @PostMapping("/api/lcplogics/getInventoryByMaterialDetails1")
    public ApiReturn<BigDecimal> getInventoryByMaterialDetails1(@RequestBody GetInventoryByMaterialDetails1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getInventoryByMaterialDetails1CustomizeService.getInventoryByMaterialDetails1(body.getMaterialCode(), body.getWarehouseId(), body.getLocationId()));
    } 

}
