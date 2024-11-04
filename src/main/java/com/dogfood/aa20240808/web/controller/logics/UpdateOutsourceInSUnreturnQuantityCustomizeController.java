package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateOutsourceInSUnreturnQuantityCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.UpdateOutsourceInSUnreturnQuantityCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateOutsourceInSUnreturnQuantityCustomizeController {

    @Autowired
    private UpdateOutsourceInSUnreturnQuantityCustomizeService updateOutsourceInSUnreturnQuantityCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "cf7bfa06-fa09-44b0-93a3-002cdee4455f",rules = { }),@ValidationRuleGroup(value = "86f88b8804294a8689319fe43bb87d31",rules = { })})
    @PostMapping("/api/lcplogics/updateOutsourceInSUnreturnQuantity")
    public void updateOutsourceInSUnreturnQuantity(@RequestBody UpdateOutsourceInSUnreturnQuantityCustomizeControllerDto body) throws Exception {
        updateOutsourceInSUnreturnQuantityCustomizeService.updateOutsourceInSUnreturnQuantity(body.getOutsourceReturnCode(), body.getAddOrReduce());
    } 


}
