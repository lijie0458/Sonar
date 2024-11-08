package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseRequestcountCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseRequestcountCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6DA269AB370A5461E2D5B972914D4E4; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadPurchaseRequestcountCustomizeController {

    @Autowired
    private LoadPurchaseRequestcountCustomizeService loadPurchaseRequestcountCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "5c840040592b49d691a2d45a604d59ed",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseRequestcount")
    public ApiReturn<AnonymousStructure_E6DA269AB370A5461E2D5B972914D4E4> loadPurchaseRequestcount(@RequestBody LoadPurchaseRequestcountCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseRequestcountCustomizeService.loadPurchaseRequestcount(body.getCode()));
    } 

}
