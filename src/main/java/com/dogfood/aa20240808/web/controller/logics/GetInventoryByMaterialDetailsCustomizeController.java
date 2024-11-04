package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetInventoryByMaterialDetailsCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.GetInventoryByMaterialDetailsCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetInventoryByMaterialDetailsCustomizeController {

    @Autowired
    private GetInventoryByMaterialDetailsCustomizeService getInventoryByMaterialDetailsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c688c5d53fba46db807eb9264893534d",rules = { }),@ValidationRuleGroup(value = "cf9da4a5-cdb9-43d8-91e2-deb5dfd483f2",rules = { }),@ValidationRuleGroup(value = "7efc939f-9b60-44ee-88d1-bd6cbf496a39",rules = { })})
    @PostMapping("/api/lcplogics/getInventoryByMaterialDetails")
    public ApiReturn<Long> getInventoryByMaterialDetails(@RequestBody GetInventoryByMaterialDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getInventoryByMaterialDetailsCustomizeService.getInventoryByMaterialDetails(body.getMaterialCode(), body.getWarehouseId(), body.getLocationId()));
    } 


}
