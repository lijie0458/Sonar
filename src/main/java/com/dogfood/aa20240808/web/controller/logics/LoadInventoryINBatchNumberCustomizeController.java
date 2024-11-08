package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadInventoryINBatchNumberCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadInventoryINBatchNumberCustomizeService; 

@RestController
public class LoadInventoryINBatchNumberCustomizeController {

    @Autowired
    private LoadInventoryINBatchNumberCustomizeService loadInventoryINBatchNumberCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "55f3ab77-e634-46c2-b792-70203164e736",rules = { }),@ValidationRuleGroup(value = "f10449f4934949b69e800150188e7548",rules = { }),@ValidationRuleGroup(value = "9a1c7eec-78de-4bd1-852e-6b2dfbe2e8ad",rules = { })})
    @PostMapping("/api/lcplogics/loadInventoryINBatchNumber")
    public ApiReturn<AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B> loadInventoryINBatchNumber(@RequestBody LoadInventoryINBatchNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadInventoryINBatchNumberCustomizeService.loadInventoryINBatchNumber(body.getBatchNumber()));
    } 

}
