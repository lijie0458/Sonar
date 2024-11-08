package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductionPageDetailsCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadProductionPageDetailsCustomizeService; 

@RestController
public class LoadProductionPageDetailsCustomizeController {

    @Autowired
    private LoadProductionPageDetailsCustomizeService loadProductionPageDetailsCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "cacd859b-57ec-45f6-8965-731351c3b85b",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "领料部门不能为空")}),@ValidationRuleGroup(value = "0b624870-a303-4c47-9860-68d75ef2d250",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "领料部门不能为空")}),@ValidationRuleGroup(value = "ad6f71be-8753-40b6-89ed-675e619bf18d",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "领料部门不能为空")}),@ValidationRuleGroup(value = "69245281-7ca2-47d7-9994-74684b9eeee9",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "领料部门不能为空")}),@ValidationRuleGroup(value = "6f1e170f-522c-46ea-bda8-8c87dcce8fc8",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "领料部门不能为空")}),@ValidationRuleGroup(value = "f1928fefd3c343c68822b538cee0805a",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "领料部门不能为空")})})
    @PostMapping("/api/lcplogics/loadProductionPageDetails")
    public ApiReturn<AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A> loadProductionPageDetails(@RequestBody LoadProductionPageDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductionPageDetailsCustomizeService.loadProductionPageDetails(body.getId(), body.getDistinctionEnum()));
    } 

}
