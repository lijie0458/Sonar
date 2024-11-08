package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.BatchChangeOtherInSStateCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.BatchChangeOtherInSStateCustomizeService; 

@RestController
public class BatchChangeOtherInSStateCustomizeController {

    @Autowired
    private BatchChangeOtherInSStateCustomizeService batchChangeOtherInSStateCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "914449a9-dfd4-45d9-bbf6-912a49f7562a",rules = { }),@ValidationRuleGroup(value = "4453cabd8b3543b99dc96485648a08e0",rules = { })})
    @PostMapping("/api/lcplogics/batchChangeOtherInSState")
    public void batchChangeOtherInSState(@RequestBody BatchChangeOtherInSStateCustomizeControllerDto body) throws Exception {
        batchChangeOtherInSStateCustomizeService.batchChangeOtherInSState(body.getCodeList(), body.getOtherInSState());
    } 

}
