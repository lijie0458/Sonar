package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBathNumberByCodeAnddistinctionCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.service.logics.LoadBathNumberByCodeAnddistinctionCustomizeService; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadBathNumberByCodeAnddistinctionCustomizeController {

    @Autowired
    private LoadBathNumberByCodeAnddistinctionCustomizeService loadBathNumberByCodeAnddistinctionCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "1ea29c64-3694-4844-81ce-6e4747938c75",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "发货仓库不能为空")}),@ValidationRuleGroup(value = "ef0870b9-6bf5-41e5-b6a2-44883813d171",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "仓库不能为空")})})
    @PostMapping("/api/lcplogics/loadBathNumberByCodeAnddistinction")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B> loadBathNumberByCodeAnddistinction(@RequestBody LoadBathNumberByCodeAnddistinctionCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBathNumberByCodeAnddistinctionCustomizeService.loadBathNumberByCodeAnddistinction(body.getCode(), body.getWarehouse(), body.getDistinction()));
    } 


}
