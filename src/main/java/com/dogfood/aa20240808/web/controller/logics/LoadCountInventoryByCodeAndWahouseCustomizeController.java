package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.LoadCountInventoryByCodeAndWahouseCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadCountInventoryByCodeAndWahouseCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountInventoryByCodeAndWahouseCustomizeController {

    @Autowired
    private LoadCountInventoryByCodeAndWahouseCustomizeService loadCountInventoryByCodeAndWahouseCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "bb02b8bf-3382-493a-b832-ef921511b7cf",rules = { @ValidationRule(value = "required",targetName = "body.Warehouse",argvs = "",errorMsg = "仓库不能为空")}),@ValidationRuleGroup(value = "27eb5b74-dc17-494a-9aaf-ec50e14e26ef",rules = { @ValidationRule(value = "required",targetName = "body.Warehouse",argvs = "",errorMsg = "发货仓库不能为空")}),@ValidationRuleGroup(value = "25028b84-5f51-4a73-96b4-60811801ed9b",rules = { @ValidationRule(value = "required",targetName = "body.Warehouse",argvs = "",errorMsg = "发货仓库不能为空")}),@ValidationRuleGroup(value = "3915ca511b214aef971191ebfad77dac",rules = { @ValidationRule(value = "required",targetName = "body.Warehouse",argvs = "",errorMsg = "调出仓库不能为空")}),@ValidationRuleGroup(value = "34af0201-d50e-4b6d-89e2-09c86e9205dd",rules = { @ValidationRule(value = "required",targetName = "body.Warehouse",argvs = "",errorMsg = "发货仓库不能为空")})})
    @PostMapping("/api/lcplogics/loadCountInventoryByCodeAndWahouse")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B8C913856E170F98C3B9D88CC8F9784> loadCountInventoryByCodeAndWahouse(@RequestBody LoadCountInventoryByCodeAndWahouseCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadCountInventoryByCodeAndWahouseCustomizeService.loadCountInventoryByCodeAndWahouse(body.getWarehouse(), body.getCode()));
    } 


}
