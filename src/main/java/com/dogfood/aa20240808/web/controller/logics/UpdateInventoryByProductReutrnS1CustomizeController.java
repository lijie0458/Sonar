package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByProductReutrnS1CustomizeService; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByProductReutrnS1CustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByProductReutrnS1CustomizeController {

    @Autowired
    private UpdateInventoryByProductReutrnS1CustomizeService updateInventoryByProductReutrnS1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "67deae16c59f434291753ce8f81d0c5f",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByProductReutrnS1")
    public void updateInventoryByProductReutrnS1(@RequestBody UpdateInventoryByProductReutrnS1CustomizeControllerDto body) throws Exception {
        updateInventoryByProductReutrnS1CustomizeService.updateInventoryByProductReutrnS1(body.getOutsourceReturnCode(), body.getAddOrReduce());
    } 


}
