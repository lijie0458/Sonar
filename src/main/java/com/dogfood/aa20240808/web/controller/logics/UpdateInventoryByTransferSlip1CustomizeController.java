package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByTransferSlip1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByTransferSlip1CustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByTransferSlip1CustomizeController {

    @Autowired
    private UpdateInventoryByTransferSlip1CustomizeService updateInventoryByTransferSlip1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "cd0a4499edff4f37b1ab7fe7afe7deb1",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByTransferSlip1")
    public void updateInventoryByTransferSlip1(@RequestBody UpdateInventoryByTransferSlip1CustomizeControllerDto body) throws Exception {
        updateInventoryByTransferSlip1CustomizeService.updateInventoryByTransferSlip1(body.getDocumentNumber());
    } 

}
