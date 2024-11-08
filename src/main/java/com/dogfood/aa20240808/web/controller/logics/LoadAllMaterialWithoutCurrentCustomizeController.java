package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadAllMaterialWithoutCurrentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadAllMaterialWithoutCurrentCustomizeService; 

@RestController
public class LoadAllMaterialWithoutCurrentCustomizeController {

    @Autowired
    private LoadAllMaterialWithoutCurrentCustomizeService loadAllMaterialWithoutCurrentCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "5508cb3567884309babb27ad6e0ba533",rules = { })})
    @PostMapping("/api/lcplogics/loadAllMaterialWithoutCurrent")
    public ApiReturn<AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C> loadAllMaterialWithoutCurrent(@RequestBody LoadAllMaterialWithoutCurrentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadAllMaterialWithoutCurrentCustomizeService.loadAllMaterialWithoutCurrent(body.getCurrentMaterialId()));
    } 

}
