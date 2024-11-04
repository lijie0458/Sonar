package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.PERGetRoleRelatedPerIdsCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERGetRoleRelatedPerIdsCustomizeControllerDto; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERGetRoleRelatedPerIdsCustomizeController {

    @Autowired
    private PERGetRoleRelatedPerIdsCustomizeService pERGetRoleRelatedPerIdsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "925a7393-f6e1-45f2-aec7-e7dc92d2248d",rules = { }),@ValidationRuleGroup(value = "169248be-7eb3-4d8c-97bd-c4da409011dd",rules = { })})
    @PostMapping("/api/lcplogics/PERGetRoleRelatedPerIds")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD>> pERGetRoleRelatedPerIds(@RequestBody PERGetRoleRelatedPerIdsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERGetRoleRelatedPerIdsCustomizeService.pERGetRoleRelatedPerIds(body.getRoleId()));
    } 


}
