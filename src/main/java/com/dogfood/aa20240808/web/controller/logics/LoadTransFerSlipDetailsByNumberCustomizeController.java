package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.TransferSlipDetailsStructure; 
import com.dogfood.aa20240808.service.logics.LoadTransFerSlipDetailsByNumberCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadTransFerSlipDetailsByNumberCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadTransFerSlipDetailsByNumberCustomizeController {

    @Autowired
    private LoadTransFerSlipDetailsByNumberCustomizeService loadTransFerSlipDetailsByNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "4bce26b6e68747409c5c1f07a7d21358",rules = { })})
    @PostMapping("/api/lcplogics/loadTransFerSlipDetailsByNumber")
    public ApiReturn<List<TransferSlipDetailsStructure>> loadTransFerSlipDetailsByNumber(@RequestBody LoadTransFerSlipDetailsByNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadTransFerSlipDetailsByNumberCustomizeService.loadTransFerSlipDetailsByNumber(body.getDocumentNumber()));
    } 


}
