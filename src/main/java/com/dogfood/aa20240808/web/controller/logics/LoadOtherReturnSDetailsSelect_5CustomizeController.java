package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOtherReturnSDetailsSelect_5CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadOtherReturnSDetailsSelect_5CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOtherReturnSDetailsSelect_5CustomizeController {

    @Autowired
    private LoadOtherReturnSDetailsSelect_5CustomizeService loadOtherReturnSDetailsSelect_5CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "38fa1d2d-8188-4571-a740-1d435554dca9",rules = { })})
    @PostMapping("/api/lcplogics/loadOtherReturnSDetailsSelect_5")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AB0A5EBF6FE0E340A646C7A5F0D62D97> loadOtherReturnSDetailsSelect_5(@RequestBody LoadOtherReturnSDetailsSelect_5CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOtherReturnSDetailsSelect_5CustomizeService.loadOtherReturnSDetailsSelect_5(body.getPage(), body.getSize(), body.getOtherInSCode()));
    } 


}
