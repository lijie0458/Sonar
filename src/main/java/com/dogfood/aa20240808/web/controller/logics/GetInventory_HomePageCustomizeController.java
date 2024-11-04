package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.GetInventory_HomePageCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetInventory_HomePageCustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetInventory_HomePageCustomizeController {

    @Autowired
    private GetInventory_HomePageCustomizeService getInventory_HomePageCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "76a11308043348939d72c6b10f4ffe54",rules = { })})
    @PostMapping("/api/lcplogics/getInventory_HomePage")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_32D78049484F37C372CC54990DCBE061> getInventory_HomePage(@RequestBody GetInventory_HomePageCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getInventory_HomePageCustomizeService.getInventory_HomePage(body.getSort(), body.getOrder()));
    } 


}
