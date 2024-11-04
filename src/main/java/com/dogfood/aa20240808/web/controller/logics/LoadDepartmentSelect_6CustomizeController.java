package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDepartmentSelect_6CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadDepartmentSelect_6CustomizeService; 

@RestController
public class LoadDepartmentSelect_6CustomizeController {

    @Autowired
    private LoadDepartmentSelect_6CustomizeService loadDepartmentSelect_6CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "bd5abf2ee39141f4b30ba0935821ed40",rules = { })})
    @PostMapping("/api/lcplogics/loadDepartmentSelect_6")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632> loadDepartmentSelect_6(@RequestBody LoadDepartmentSelect_6CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDepartmentSelect_6CustomizeService.loadDepartmentSelect_6(body.getPage(), body.getSize()));
    } 


}
