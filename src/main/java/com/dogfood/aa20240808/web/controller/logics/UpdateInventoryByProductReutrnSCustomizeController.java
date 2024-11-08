package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByProductReutrnSCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByProductReutrnSCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByProductReutrnSCustomizeController {

    @Autowired
    private UpdateInventoryByProductReutrnSCustomizeService updateInventoryByProductReutrnSCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "64c6bcc7-d893-44f0-8104-60fa3f5b5277",rules = { }),@ValidationRuleGroup(value = "3fb7c01b1d7841a880bcc29ec06a0ee1",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByProductReutrnS")
    public void updateInventoryByProductReutrnS(@RequestBody UpdateInventoryByProductReutrnSCustomizeControllerDto body) throws Exception {
        updateInventoryByProductReutrnSCustomizeService.updateInventoryByProductReutrnS(body.getProductReturnCode(), body.getAddOrReduce());
    } 

}
