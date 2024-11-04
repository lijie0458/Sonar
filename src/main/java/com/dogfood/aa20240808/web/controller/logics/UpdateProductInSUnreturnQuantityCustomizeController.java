package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.UpdateProductInSUnreturnQuantityCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateProductInSUnreturnQuantityCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateProductInSUnreturnQuantityCustomizeController {

    @Autowired
    private UpdateProductInSUnreturnQuantityCustomizeService updateProductInSUnreturnQuantityCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5dccdc76-8112-44c5-9787-31c1ebe0c47c",rules = { })})
    @PostMapping("/api/lcplogics/updateProductInSUnreturnQuantity")
    public void updateProductInSUnreturnQuantity(@RequestBody UpdateProductInSUnreturnQuantityCustomizeControllerDto body) throws Exception {
        updateProductInSUnreturnQuantityCustomizeService.updateProductInSUnreturnQuantity(body.getProductReturnCode(), body.getAddOrReduce());
    } 


}
