package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadOutsourceReturnStorageSelect_26CustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOutsourceReturnStorageSelect_26CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOutsourceReturnStorageSelect_26CustomizeController {

    @Autowired
    private LoadOutsourceReturnStorageSelect_26CustomizeService loadOutsourceReturnStorageSelect_26CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "56e5ffe7-8811-49ae-ac06-bb358ac1a205",rules = { })})
    @PostMapping("/api/lcplogics/loadOutsourceReturnStorageSelect_26")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7> loadOutsourceReturnStorageSelect_26(@RequestBody LoadOutsourceReturnStorageSelect_26CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOutsourceReturnStorageSelect_26CustomizeService.loadOutsourceReturnStorageSelect_26(body.getPage(), body.getSize()));
    } 


}
