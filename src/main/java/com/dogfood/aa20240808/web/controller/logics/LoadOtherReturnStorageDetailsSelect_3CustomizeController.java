package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadOtherReturnStorageDetailsSelect_3CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOtherReturnStorageDetailsSelect_3CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOtherReturnStorageDetailsSelect_3CustomizeController {

    @Autowired
    private LoadOtherReturnStorageDetailsSelect_3CustomizeService loadOtherReturnStorageDetailsSelect_3CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "da32c0f7-82a4-4dec-857d-f89f936a8d48",rules = { })})
    @PostMapping("/api/lcplogics/loadOtherReturnStorageDetailsSelect_3")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA> loadOtherReturnStorageDetailsSelect_3(@RequestBody LoadOtherReturnStorageDetailsSelect_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOtherReturnStorageDetailsSelect_3CustomizeService.loadOtherReturnStorageDetailsSelect_3(body.getPage(), body.getSize(), body.getIsUpdate()));
    } 


}
