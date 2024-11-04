package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseRequestDetailsTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseRequestDetailsTableViewCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadPurchaseRequestDetailsTableViewCustomizeController {

    @Autowired
    private LoadPurchaseRequestDetailsTableViewCustomizeService loadPurchaseRequestDetailsTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "fedf9675-076a-4728-a332-ca33981e6032",rules = { }),@ValidationRuleGroup(value = "5dafdeec-8bcf-4a81-aeba-daab893fba34",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseRequestDetailsTableView")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1F4C609A51E84CB433B7BEC8880AD26> loadPurchaseRequestDetailsTableView(@RequestBody LoadPurchaseRequestDetailsTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseRequestDetailsTableViewCustomizeService.loadPurchaseRequestDetailsTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getDataViewAuthorityUserNameList()));
    } 


}
