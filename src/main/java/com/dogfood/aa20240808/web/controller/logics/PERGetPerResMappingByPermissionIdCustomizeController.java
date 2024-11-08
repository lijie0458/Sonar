package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERGetPerResMappingByPermissionIdCustomizeControllerDto; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF; 
import com.dogfood.aa20240808.service.logics.PERGetPerResMappingByPermissionIdCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERGetPerResMappingByPermissionIdCustomizeController {

    @Autowired
    private PERGetPerResMappingByPermissionIdCustomizeService pERGetPerResMappingByPermissionIdCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "1745aee8-6e87-44b2-8e3f-d93bbaf7a94b",rules = { })})
    @PostMapping("/api/lcplogics/PERGetPerResMappingByPermissionId")
    public ApiReturn<List<AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF>> pERGetPerResMappingByPermissionId(@RequestBody PERGetPerResMappingByPermissionIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERGetPerResMappingByPermissionIdCustomizeService.pERGetPerResMappingByPermissionId(body.getPermissionId()));
    } 

}
