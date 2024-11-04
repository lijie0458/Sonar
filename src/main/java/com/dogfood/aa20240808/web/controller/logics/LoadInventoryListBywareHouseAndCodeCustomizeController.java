package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadInventoryListBywareHouseAndCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadInventoryListBywareHouseAndCodeCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadInventoryListBywareHouseAndCodeCustomizeController {

    @Autowired
    private LoadInventoryListBywareHouseAndCodeCustomizeService loadInventoryListBywareHouseAndCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "2c95fe14-67ef-49a1-be49-f87c5f0aa576",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "发货仓库不能为空")}),@ValidationRuleGroup(value = "5637daf9-5d56-4933-85b4-65a35c61c553",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "调出仓库不能为空")}),@ValidationRuleGroup(value = "22f5e9b4-651b-4627-b714-1f046d1ed066",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "调入仓库不得为空")}),@ValidationRuleGroup(value = "8af058d6-6577-4a33-a936-abb6d6b32998",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "发货仓库不能为空")}),@ValidationRuleGroup(value = "6d8964a8-3049-4d0f-bfd7-ad9561dc97d6",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "发货仓库不能为空")})})
    @PostMapping("/api/lcplogics/loadInventoryListBywareHouseAndCode")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE> loadInventoryListBywareHouseAndCode(@RequestBody LoadInventoryListBywareHouseAndCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadInventoryListBywareHouseAndCodeCustomizeService.loadInventoryListBywareHouseAndCode(body.getWarehouse(), body.getCode()));
    } 


}
