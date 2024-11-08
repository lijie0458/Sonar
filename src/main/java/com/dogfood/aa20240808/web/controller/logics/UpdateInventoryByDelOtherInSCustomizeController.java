package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByDelOtherInSCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByDelOtherInSCustomizeControllerDto; 

@RestController
public class UpdateInventoryByDelOtherInSCustomizeController {

    @Autowired
    private UpdateInventoryByDelOtherInSCustomizeService updateInventoryByDelOtherInSCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "11c3e951-2749-4e4b-80d3-9e5cb4c61743",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByDelOtherInS")
    public void updateInventoryByDelOtherInS(@RequestBody UpdateInventoryByDelOtherInSCustomizeControllerDto body) throws Exception {
        updateInventoryByDelOtherInSCustomizeService.updateInventoryByDelOtherInS(body.getOtherCode());
    } 

}
