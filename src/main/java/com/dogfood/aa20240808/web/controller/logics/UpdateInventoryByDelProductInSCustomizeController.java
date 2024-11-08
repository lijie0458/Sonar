package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByDelProductInSCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByDelProductInSCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByDelProductInSCustomizeController {

    @Autowired
    private UpdateInventoryByDelProductInSCustomizeService updateInventoryByDelProductInSCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "ff64a4f0f2754ec78f39a95f9417cb54",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByDelProductInS")
    public void updateInventoryByDelProductInS(@RequestBody UpdateInventoryByDelProductInSCustomizeControllerDto body) throws Exception {
        updateInventoryByDelProductInSCustomizeService.updateInventoryByDelProductInS(body.getProductInSNum());
    } 

}
