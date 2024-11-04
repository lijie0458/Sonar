package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadoutsourceReturnSDetailsSelect_4CustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadoutsourceReturnSDetailsSelect_4CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadoutsourceReturnSDetailsSelect_4CustomizeController {

    @Autowired
    private LoadoutsourceReturnSDetailsSelect_4CustomizeService loadoutsourceReturnSDetailsSelect_4CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c2b471a1-0587-464d-a1e9-a2b6bf32ba2c",rules = { })})
    @PostMapping("/api/lcplogics/loadoutsourceReturnSDetailsSelect_4")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_109E7C4B3A86BF64D3BABF15FFFFE2F3> loadoutsourceReturnSDetailsSelect_4(@RequestBody LoadoutsourceReturnSDetailsSelect_4CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadoutsourceReturnSDetailsSelect_4CustomizeService.loadoutsourceReturnSDetailsSelect_4(body.getPage(), body.getSize(), body.getCode()));
    } 


}
