package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBathNumberByCodeAnddistinctionDistinctCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.LoadBathNumberByCodeAnddistinctionDistinctCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadBathNumberByCodeAnddistinctionDistinctCustomizeController {

    @Autowired
    private LoadBathNumberByCodeAnddistinctionDistinctCustomizeService loadBathNumberByCodeAnddistinctionDistinctCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "0580afae-dc90-444a-9afa-92d8bb564550",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "仓库不能为空")})})
    @PostMapping("/api/lcplogics/loadBathNumberByCodeAnddistinctionDistinct")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B> loadBathNumberByCodeAnddistinctionDistinct(@RequestBody LoadBathNumberByCodeAnddistinctionDistinctCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBathNumberByCodeAnddistinctionDistinctCustomizeService.loadBathNumberByCodeAnddistinctionDistinct(body.getCode(), body.getWarehouse(), body.getDistinction(), body.getListBatchNumber()));
    } 


}
