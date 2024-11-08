package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.TransferSlipDetailsStructure; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadTransferSlipDetailsByCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadTransferSlipDetailsByCodeCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadTransferSlipDetailsByCodeCustomizeController {

    @Autowired
    private LoadTransferSlipDetailsByCodeCustomizeService loadTransferSlipDetailsByCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "45c3c938-ccc2-49d5-bdf8-56011b6188cc",rules = { })})
    @PostMapping("/api/lcplogics/loadTransferSlipDetailsByCode")
    public ApiReturn<List<TransferSlipDetailsStructure>> loadTransferSlipDetailsByCode(@RequestBody LoadTransferSlipDetailsByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadTransferSlipDetailsByCodeCustomizeService.loadTransferSlipDetailsByCode(body.getInventoryList(), body.getOutWareHouse(), body.getInWareHouse()));
    } 

}
