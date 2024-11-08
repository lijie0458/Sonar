package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateOtherInSUnreturnQuantityCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.UpdateOtherInSUnreturnQuantityCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateOtherInSUnreturnQuantityCustomizeController {

    @Autowired
    private UpdateOtherInSUnreturnQuantityCustomizeService updateOtherInSUnreturnQuantityCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "71dd00a7-14ca-486e-87ef-7ee910373279",rules = { }),@ValidationRuleGroup(value = "aefcaeb22f4842f4885c390d67e3716a",rules = { }),@ValidationRuleGroup(value = "48b639b513e9493b8c2f164ed8dedda5",rules = { })})
    @PostMapping("/api/lcplogics/updateOtherInSUnreturnQuantity")
    public void updateOtherInSUnreturnQuantity(@RequestBody UpdateOtherInSUnreturnQuantityCustomizeControllerDto body) throws Exception {
        updateOtherInSUnreturnQuantityCustomizeService.updateOtherInSUnreturnQuantity(body.getOtherReturnCode(), body.getAddOrReduce());
    } 

}
