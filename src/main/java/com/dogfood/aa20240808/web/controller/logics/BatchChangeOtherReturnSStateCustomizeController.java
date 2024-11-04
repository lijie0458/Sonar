package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.BatchChangeOtherReturnSStateCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.BatchChangeOtherReturnSStateCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class BatchChangeOtherReturnSStateCustomizeController {

    @Autowired
    private BatchChangeOtherReturnSStateCustomizeService batchChangeOtherReturnSStateCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "26e5c388-0f6f-4dc0-b611-2a941c0ce826",rules = { }),@ValidationRuleGroup(value = "6294df68-30a2-4776-ba3e-021a8f1b49ed",rules = { })})
    @PostMapping("/api/lcplogics/batchChangeOtherReturnSState")
    public void batchChangeOtherReturnSState(@RequestBody BatchChangeOtherReturnSStateCustomizeControllerDto body) throws Exception {
        batchChangeOtherReturnSStateCustomizeService.batchChangeOtherReturnSState(body.getCodeList(), body.getOtherReturnSState());
    } 


}
