package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseOrderTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseOrderTableViewCustomizeService; 

@RestController
public class LoadPurchaseOrderTableViewCustomizeController {

    @Autowired
    private LoadPurchaseOrderTableViewCustomizeService loadPurchaseOrderTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "a503a1ab-6392-4670-89c2-8fab4b150c9d",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseOrderTableView")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9BDEEC62EBFE6F3A9DF1F8D2F7DB0077> loadPurchaseOrderTableView(@RequestBody LoadPurchaseOrderTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseOrderTableViewCustomizeService.loadPurchaseOrderTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 


}
