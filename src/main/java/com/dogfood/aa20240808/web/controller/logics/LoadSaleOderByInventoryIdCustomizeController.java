package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSaleOderByInventoryIdCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadSaleOderByInventoryIdCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSaleOderByInventoryIdCustomizeController {

    @Autowired
    private LoadSaleOderByInventoryIdCustomizeService loadSaleOderByInventoryIdCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "57a958780c4546fcbbccf37300af20fc",rules = { }),@ValidationRuleGroup(value = "d2735838-8b72-4c46-a190-8a194f3f7213",rules = { }),@ValidationRuleGroup(value = "93b52bb5-17c9-4558-b731-7e8c6b8351dd",rules = { }),@ValidationRuleGroup(value = "bb7de2f333864f8bba7eec7df98491b7",rules = { }),@ValidationRuleGroup(value = "a0cfb790-c5d2-4f2f-82ad-b875415fe2e8",rules = { }),@ValidationRuleGroup(value = "7a70dab0-6752-4781-b949-1d25809f28f2",rules = { }),@ValidationRuleGroup(value = "0fe3beac-b4a5-4382-811e-26c44ad4fedf",rules = { }),@ValidationRuleGroup(value = "e836d1c4-f95f-473a-8790-c437549bae13",rules = { }),@ValidationRuleGroup(value = "422f49a0-3335-458f-8a26-a9b425888733",rules = { }),@ValidationRuleGroup(value = "948c71c2-80f5-4acf-bafa-4ea4662eaab4",rules = { }),@ValidationRuleGroup(value = "109873b8-35a5-4254-b548-db49673fc8b2",rules = { }),@ValidationRuleGroup(value = "eaf9bedb-9593-4754-ab92-5c9975d5d5f0",rules = { })})
    @PostMapping("/api/lcplogics/loadSaleOderByInventoryId")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E4317B835B85F4F0A55543D88FC5FF1>> loadSaleOderByInventoryId(@RequestBody LoadSaleOderByInventoryIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSaleOderByInventoryIdCustomizeService.loadSaleOderByInventoryId(body.getParam1()));
    } 


}
