package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetWarehouseInfoCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetWarehouseInfoCustomizeController {

    @Autowired
    private GetWarehouseInfoCustomizeService getWarehouseInfoCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "df55df1d31be4a329a53fa930c488097",rules = { }),@ValidationRuleGroup(value = "c5e7b62a-61b0-4016-980c-4400f4dc5b68",rules = { }),@ValidationRuleGroup(value = "a83ba76572cd4a3b815d2292380ee41b",rules = { }),@ValidationRuleGroup(value = "dc2c6008-9e5b-4779-8516-8b84f9a805d3",rules = { }),@ValidationRuleGroup(value = "6613b5a7-979f-4ed6-9177-38ce33ba0a3a",rules = { }),@ValidationRuleGroup(value = "882df813b1e346d690f4149297b62c58",rules = { }),@ValidationRuleGroup(value = "629eb9e0-c4a6-4793-909e-737e092ca9fc",rules = { }),@ValidationRuleGroup(value = "ce34f9cd-0a82-4848-9dfc-aeca57f23c3c",rules = { }),@ValidationRuleGroup(value = "e684947d-643e-4727-92e1-d4cbb645aa15",rules = { }),@ValidationRuleGroup(value = "2904441bd25a4938a2398621a080c0fa",rules = { }),@ValidationRuleGroup(value = "1fd2bfd9b10940c8a6e7e386a8f4c984",rules = { })})
    @PostMapping("/api/lcplogics/getWarehouseInfo")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3> getWarehouseInfo() throws Exception {
        return ApiReturn.of(getWarehouseInfoCustomizeService.getWarehouseInfo());
    } 


}
