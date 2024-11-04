package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.BatchChangeOutsourceInSStateCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.BatchChangeOutsourceInSStateCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class BatchChangeOutsourceInSStateCustomizeController {

    @Autowired
    private BatchChangeOutsourceInSStateCustomizeService batchChangeOutsourceInSStateCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "2a864367adda4cfaad2ccef4221804e9",rules = { }),@ValidationRuleGroup(value = "4c5e6e2c89f44393a8dd2e3731607ce1",rules = { })})
    @PostMapping("/api/lcplogics/batchChangeOutsourceInSState")
    public void batchChangeOutsourceInSState(@RequestBody BatchChangeOutsourceInSStateCustomizeControllerDto body) throws Exception {
        batchChangeOutsourceInSStateCustomizeService.batchChangeOutsourceInSState(body.getCodeList(), body.getOutsourceInSState());
    } 


}
