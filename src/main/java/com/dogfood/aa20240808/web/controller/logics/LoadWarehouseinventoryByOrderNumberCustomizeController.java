package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseinventoryByOrderNumberCustomizeService; 
import com.dogfood.aa20240808.domain.structure.WarehouseinventoryStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehouseinventoryByOrderNumberCustomizeControllerDto; 

@RestController
public class LoadWarehouseinventoryByOrderNumberCustomizeController {

    @Autowired
    private LoadWarehouseinventoryByOrderNumberCustomizeService loadWarehouseinventoryByOrderNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "d9593418-aa34-41e9-93ac-2f05cf19e891",rules = { }),@ValidationRuleGroup(value = "525753dd-474d-433a-8352-e62491f32e61",rules = { }),@ValidationRuleGroup(value = "8c48fb47-6d38-46c0-a041-db565ab1a354",rules = { }),@ValidationRuleGroup(value = "8715d335-66cf-47e4-a281-d71db0b32d12",rules = { }),@ValidationRuleGroup(value = "d1535cda-e36d-47fc-a955-1dc37342aa57",rules = { }),@ValidationRuleGroup(value = "4176d6b4-5f1b-43ab-bf4b-08a2d9d7d356",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehouseinventoryByOrderNumber")
    public ApiReturn<List<WarehouseinventoryStructure>> loadWarehouseinventoryByOrderNumber(@RequestBody LoadWarehouseinventoryByOrderNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehouseinventoryByOrderNumberCustomizeService.loadWarehouseinventoryByOrderNumber(body.getOrderNumber(), body.getDistinctionEnum()));
    } 


}
