package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetMaterialDetailsByCodeListCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.GetMaterialDetailsByCodeListCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetMaterialDetailsByCodeListCustomizeController {

    @Autowired
    private GetMaterialDetailsByCodeListCustomizeService getMaterialDetailsByCodeListCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "c0bb8a0699d44e3a86b897dffdc3af40",rules = { }),@ValidationRuleGroup(value = "24b79f0cc92a43bf856167073467feb7",rules = { }),@ValidationRuleGroup(value = "5b08ccef4c154cb3944238a8076236b2",rules = { }),@ValidationRuleGroup(value = "3e62de7eecbd47688cfc73917ea54327",rules = { })})
    @PostMapping("/api/lcplogics/getMaterialDetailsByCodeList")
    public ApiReturn<AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055> getMaterialDetailsByCodeList(@RequestBody GetMaterialDetailsByCodeListCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getMaterialDetailsByCodeListCustomizeService.getMaterialDetailsByCodeList(body.getMaterialCodeList()));
    } 

}
