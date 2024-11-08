package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseByCodeCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehouseByCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadWarehouseByCodeCustomizeController {

    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "db2da633b0a140d0ba64c76bd2b983ba",rules = { }),@ValidationRuleGroup(value = "f4fd97e4-ffe0-4678-b0a3-45073f5178de",rules = { }),@ValidationRuleGroup(value = "6b1ff1ef-7ec1-4b0c-ba65-6dc06d3ff1e2",rules = { }),@ValidationRuleGroup(value = "74834944bd9a4f269f5cd1c270eb537a",rules = { }),@ValidationRuleGroup(value = "3787791948b5409182538e597766ce74",rules = { }),@ValidationRuleGroup(value = "eee356d3-511b-4a5d-b6af-d6f0671beb53",rules = { }),@ValidationRuleGroup(value = "aa1e0b22-3115-4bf4-ac1e-7fe3f5e68903",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehouseByCode")
    public ApiReturn<List<Warehouse_levelTwoEntity>> loadWarehouseByCode(@RequestBody LoadWarehouseByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehouseByCodeCustomizeService.loadWarehouseByCode(body.getParam1()));
    } 

}
