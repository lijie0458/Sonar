package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.LoadSalesReturnDetailsSelect_20CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesReturnDetailsSelect_20CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSalesReturnDetailsSelect_20CustomizeController {

    @Autowired
    private LoadSalesReturnDetailsSelect_20CustomizeService loadSalesReturnDetailsSelect_20CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "7dd5592bb25448eeaafa15cdb223cc20",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "购货单位不能为空")}),@ValidationRuleGroup(value = "6df573f2-5ecd-4021-86a5-19c478f19306",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "购货单位不能为空")})})
    @PostMapping("/api/lcplogics/loadSalesReturnDetailsSelect_20")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F> loadSalesReturnDetailsSelect_20(@RequestBody LoadSalesReturnDetailsSelect_20CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesReturnDetailsSelect_20CustomizeService.loadSalesReturnDetailsSelect_20(body.getId(), body.getIsupdate()));
    } 


}
