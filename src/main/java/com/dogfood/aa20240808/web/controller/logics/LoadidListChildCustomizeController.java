package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadidListChildCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadidListChildCustomizeService; 

@RestController
public class LoadidListChildCustomizeController {

    @Autowired
    private LoadidListChildCustomizeService loadidListChildCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3774f29bde544eaa87fb12fbad9b6ae3",rules = { })})
    @PostMapping("/api/lcplogics/loadidListChild")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445> loadidListChild(@RequestBody LoadidListChildCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadidListChildCustomizeService.loadidListChild(body.getParam1()));
    } 


}
