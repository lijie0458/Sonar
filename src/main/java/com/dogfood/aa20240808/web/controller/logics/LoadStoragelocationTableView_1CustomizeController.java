package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadStoragelocationTableView_1CustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadStoragelocationTableView_1CustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadStoragelocationTableView_1CustomizeController {

    @Autowired
    private LoadStoragelocationTableView_1CustomizeService loadStoragelocationTableView_1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "c517337310814cbe84972bd369aa7081",rules = { })})
    @PostMapping("/api/lcplogics/loadStoragelocationTableView_1")
    public ApiReturn<AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48> loadStoragelocationTableView_1(@RequestBody LoadStoragelocationTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadStoragelocationTableView_1CustomizeService.loadStoragelocationTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 

}
