package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadProductReturnStorageSelect_21LCAPUserCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductReturnStorageSelect_21LCAPUserCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductReturnStorageSelect_21LCAPUserCustomizeController {

    @Autowired
    private LoadProductReturnStorageSelect_21LCAPUserCustomizeService loadProductReturnStorageSelect_21LCAPUserCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "d57e5b4f-74a9-4dce-8cf4-9442ae277d1a",rules = { }),@ValidationRuleGroup(value = "1b1fb7b5-dfd7-4043-be84-7087fb42120c",rules = { }),@ValidationRuleGroup(value = "b65a8b55-ac37-418a-9906-ba7c1bfe5ac8",rules = { })})
    @PostMapping("/api/lcplogics/loadProductReturnStorageSelect_21LCAPUser")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632> loadProductReturnStorageSelect_21LCAPUser(@RequestBody LoadProductReturnStorageSelect_21LCAPUserCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductReturnStorageSelect_21LCAPUserCustomizeService.loadProductReturnStorageSelect_21LCAPUser(body.getPage(), body.getSize()));
    } 


}
