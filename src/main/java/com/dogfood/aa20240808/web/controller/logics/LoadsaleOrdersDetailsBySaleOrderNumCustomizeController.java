package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.SaleOrderDetailStrutureStructure; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadsaleOrdersDetailsBySaleOrderNumCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadsaleOrdersDetailsBySaleOrderNumCustomizeService; 

@RestController
public class LoadsaleOrdersDetailsBySaleOrderNumCustomizeController {

    @Autowired
    private LoadsaleOrdersDetailsBySaleOrderNumCustomizeService loadsaleOrdersDetailsBySaleOrderNumCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "a5d86158-63c2-4c49-a8b2-2d9f29d43ee1",rules = { }),@ValidationRuleGroup(value = "b599cc79a7604b29b5e219b2e4ae974d",rules = { }),@ValidationRuleGroup(value = "00e7c74d24d346978e615c9f1be426e7",rules = { }),@ValidationRuleGroup(value = "ef5b4e3e-b1dc-435c-a065-7948af4cf2d8",rules = { }),@ValidationRuleGroup(value = "e72edf28f7cb499c91df36749d538190",rules = { }),@ValidationRuleGroup(value = "9db87b2d-bcd6-484e-8a63-6ff6ce075100",rules = { }),@ValidationRuleGroup(value = "9d3f524ac19c473a85f92dffd3538e4b",rules = { }),@ValidationRuleGroup(value = "2c26d93714fa4d77b4a4685fb70644bb",rules = { })})
    @PostMapping("/api/lcplogics/loadsaleOrdersDetailsBySaleOrderNum")
    public ApiReturn<List<SaleOrderDetailStrutureStructure>> loadsaleOrdersDetailsBySaleOrderNum(@RequestBody LoadsaleOrdersDetailsBySaleOrderNumCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadsaleOrdersDetailsBySaleOrderNumCustomizeService.loadsaleOrdersDetailsBySaleOrderNum(body.getRequest_number(), body.getIsUpdate()));
    } 


}
