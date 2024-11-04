package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByProductReutrnS2CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByProductReutrnS2CustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByProductReutrnS2CustomizeController {

    @Autowired
    private UpdateInventoryByProductReutrnS2CustomizeService updateInventoryByProductReutrnS2CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "e71b56adfcd245539e0c3401c894c9f9",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByProductReutrnS2")
    public void updateInventoryByProductReutrnS2(@RequestBody UpdateInventoryByProductReutrnS2CustomizeControllerDto body) throws Exception {
        updateInventoryByProductReutrnS2CustomizeService.updateInventoryByProductReutrnS2(body.getOtherReturnCode(), body.getAddOrReduce());
    } 


}
