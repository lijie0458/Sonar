package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseRequestTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31C60B9760F5486756893EC06AC7FCAA; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseRequestTableViewCustomizeService; 

@RestController
public class LoadPurchaseRequestTableViewCustomizeController {

    @Autowired
    private LoadPurchaseRequestTableViewCustomizeService loadPurchaseRequestTableViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "5b13c3db-5c7a-4193-8abd-64f5dea817b9",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseRequestTableView")
    public ApiReturn<AnonymousStructure_31C60B9760F5486756893EC06AC7FCAA> loadPurchaseRequestTableView(@RequestBody LoadPurchaseRequestTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseRequestTableViewCustomizeService.loadPurchaseRequestTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 

}
