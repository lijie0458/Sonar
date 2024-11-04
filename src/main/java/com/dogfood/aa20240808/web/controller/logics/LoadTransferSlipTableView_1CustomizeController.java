package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadTransferSlipTableView_1CustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadTransferSlipTableView_1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadTransferSlipTableView_1CustomizeController {

    @Autowired
    private LoadTransferSlipTableView_1CustomizeService loadTransferSlipTableView_1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5f26a4ac-80f9-4f9f-8919-916195ec5492",rules = { })})
    @PostMapping("/api/lcplogics/loadTransferSlipTableView_1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A617B684B2576BF205A0A005CC8AF429> loadTransferSlipTableView_1(@RequestBody LoadTransferSlipTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadTransferSlipTableView_1CustomizeService.loadTransferSlipTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 


}
