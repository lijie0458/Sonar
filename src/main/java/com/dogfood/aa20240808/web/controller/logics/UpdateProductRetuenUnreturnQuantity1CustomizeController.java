package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.UpdateProductRetuenUnreturnQuantity1CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateProductRetuenUnreturnQuantity1CustomizeControllerDto; 

@RestController
public class UpdateProductRetuenUnreturnQuantity1CustomizeController {

    @Autowired
    private UpdateProductRetuenUnreturnQuantity1CustomizeService updateProductRetuenUnreturnQuantity1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "4fea1fde560d4c8e9fd93d6a972b6165",rules = { })})
    @PostMapping("/api/lcplogics/updateProductRetuenUnreturnQuantity1")
    public void updateProductRetuenUnreturnQuantity1(@RequestBody UpdateProductRetuenUnreturnQuantity1CustomizeControllerDto body) throws Exception {
        updateProductRetuenUnreturnQuantity1CustomizeService.updateProductRetuenUnreturnQuantity1(body.getOutsourceReturnCode(), body.getAddOrReduce());
    } 


}
