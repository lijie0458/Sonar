package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOutsourceReturnStorageDetailsSelect_2CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadOutsourceReturnStorageDetailsSelect_2CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOutsourceReturnStorageDetailsSelect_2CustomizeController {

    @Autowired
    private LoadOutsourceReturnStorageDetailsSelect_2CustomizeService loadOutsourceReturnStorageDetailsSelect_2CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "85bcc3e6-22ca-4ec4-b430-372934264b03",rules = { })})
    @PostMapping("/api/lcplogics/loadOutsourceReturnStorageDetailsSelect_2")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA> loadOutsourceReturnStorageDetailsSelect_2(@RequestBody LoadOutsourceReturnStorageDetailsSelect_2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOutsourceReturnStorageDetailsSelect_2CustomizeService.loadOutsourceReturnStorageDetailsSelect_2(body.getPage(), body.getSize(), body.getIsUpdate()));
    } 


}
