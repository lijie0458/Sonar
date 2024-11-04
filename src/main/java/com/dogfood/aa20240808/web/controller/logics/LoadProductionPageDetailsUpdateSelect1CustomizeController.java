package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductionPageDetailsUpdateSelect1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadProductionPageDetailsUpdateSelect1CustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductionPageDetailsUpdateSelect1CustomizeController {

    @Autowired
    private LoadProductionPageDetailsUpdateSelect1CustomizeService loadProductionPageDetailsUpdateSelect1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "0b7bb1f556c3424799489392f2308158",rules = { }),@ValidationRuleGroup(value = "6edfff18897f49408404e769665caa0c",rules = { }),@ValidationRuleGroup(value = "8f0f5fe106564332bd3127fc1e39de68",rules = { })})
    @PostMapping("/api/lcplogics/loadProductionPageDetailsUpdateSelect1")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_59171EEBD007C582328CDFD57C58FB34>> loadProductionPageDetailsUpdateSelect1(@RequestBody LoadProductionPageDetailsUpdateSelect1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductionPageDetailsUpdateSelect1CustomizeService.loadProductionPageDetailsUpdateSelect1(body.getPage(), body.getSize(), body.getListMaterialDetailsCode(), body.getOrderNumber()));
    } 


}
