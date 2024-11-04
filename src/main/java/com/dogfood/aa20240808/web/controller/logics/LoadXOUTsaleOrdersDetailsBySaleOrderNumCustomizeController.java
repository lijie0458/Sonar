package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.SaleOrderDetailStrutureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeService; 

@RestController
public class LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeController {

    @Autowired
    private LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeService loadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c352cb9c04e44fe59e5f71497eb26326",rules = { }),@ValidationRuleGroup(value = "5e8296641448453489ae53274a4a4a13",rules = { }),@ValidationRuleGroup(value = "6af9ac22302942ddb221a3b93a7e447e",rules = { }),@ValidationRuleGroup(value = "7605284e803f4b7c93e7b752bf47df12",rules = { })})
    @PostMapping("/api/lcplogics/loadXOUTsaleOrdersDetailsBySaleOrderNum")
    public ApiReturn<List<SaleOrderDetailStrutureStructure>> loadXOUTsaleOrdersDetailsBySaleOrderNum(@RequestBody LoadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadXOUTsaleOrdersDetailsBySaleOrderNumCustomizeService.loadXOUTsaleOrdersDetailsBySaleOrderNum(body.getRequest_number(), body.getIsUpdate()));
    } 


}
