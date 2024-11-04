package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.UpdatePurchaseDetailsCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdatePurchaseDetailsCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdatePurchaseDetailsCustomizeController {

    @Autowired
    private UpdatePurchaseDetailsCustomizeService updatePurchaseDetailsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "1aa4e6639226402bb76a59ad9291d7c8",rules = { })})
    @PostMapping("/api/lcplogics/updatePurchaseDetails")
    public ApiReturn<Boolean> updatePurchaseDetails(@RequestBody UpdatePurchaseDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(updatePurchaseDetailsCustomizeService.updatePurchaseDetails(body.getPurchaseDetailsIdList()));
    } 


}
