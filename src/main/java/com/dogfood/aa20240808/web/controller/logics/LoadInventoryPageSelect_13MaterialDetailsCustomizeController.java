package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadInventoryPageSelect_13MaterialDetailsCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadInventoryPageSelect_13MaterialDetailsCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadInventoryPageSelect_13MaterialDetailsCustomizeController {

    @Autowired
    private LoadInventoryPageSelect_13MaterialDetailsCustomizeService loadInventoryPageSelect_13MaterialDetailsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "418c421d-8e92-4363-ae84-62aee321a04c",rules = { })})
    @PostMapping("/api/lcplogics/loadInventoryPageSelect_13MaterialDetails")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445> loadInventoryPageSelect_13MaterialDetails(@RequestBody LoadInventoryPageSelect_13MaterialDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadInventoryPageSelect_13MaterialDetailsCustomizeService.loadInventoryPageSelect_13MaterialDetails(body.getPage(), body.getSize()));
    } 


}
