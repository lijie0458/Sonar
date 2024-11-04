package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByTransferSlipCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByTransferSlipCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByTransferSlipCustomizeController {

    @Autowired
    private UpdateInventoryByTransferSlipCustomizeService updateInventoryByTransferSlipCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "423c6a33dc5a4a2599c9154e8ea878df",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByTransferSlip")
    public void updateInventoryByTransferSlip(@RequestBody UpdateInventoryByTransferSlipCustomizeControllerDto body) throws Exception {
        updateInventoryByTransferSlipCustomizeService.updateInventoryByTransferSlip(body.getDocumentNumber());
    } 


}
