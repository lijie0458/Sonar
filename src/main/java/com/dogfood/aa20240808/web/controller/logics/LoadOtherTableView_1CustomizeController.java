package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadOtherTableView_1CustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22AE7863E3C41560E38F2AE6B1FA08AD; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOtherTableView_1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOtherTableView_1CustomizeController {

    @Autowired
    private LoadOtherTableView_1CustomizeService loadOtherTableView_1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "6cf056fc-45bc-43d3-b012-9bb137f746bd",rules = { })})
    @PostMapping("/api/lcplogics/loadOtherTableView_1")
    public ApiReturn<AnonymousStructure_22AE7863E3C41560E38F2AE6B1FA08AD> loadOtherTableView_1(@RequestBody LoadOtherTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOtherTableView_1CustomizeService.loadOtherTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getDataViewAuthority(), body.getTimeHorizon()));
    } 

}
