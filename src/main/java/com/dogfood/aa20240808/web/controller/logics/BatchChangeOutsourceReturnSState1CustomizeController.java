package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.BatchChangeOutsourceReturnSState1CustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.BatchChangeOutsourceReturnSState1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class BatchChangeOutsourceReturnSState1CustomizeController {

    @Autowired
    private BatchChangeOutsourceReturnSState1CustomizeService batchChangeOutsourceReturnSState1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "fb6d2324-a4ff-4a97-a7ac-4c48fca4f912",rules = { }),@ValidationRuleGroup(value = "08d705c9-db6a-42e2-b6db-cb26c435eaa2",rules = { })})
    @PostMapping("/api/lcplogics/batchChangeOutsourceReturnSState1")
    public void batchChangeOutsourceReturnSState1(@RequestBody BatchChangeOutsourceReturnSState1CustomizeControllerDto body) throws Exception {
        batchChangeOutsourceReturnSState1CustomizeService.batchChangeOutsourceReturnSState1(body.getCodeList(), body.getOutsourceReturnSState());
    } 

}
