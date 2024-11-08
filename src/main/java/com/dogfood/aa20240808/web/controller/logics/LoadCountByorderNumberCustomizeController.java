package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadCountByorderNumberCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadCountByorderNumberCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountByorderNumberCustomizeController {

    @Autowired
    private LoadCountByorderNumberCustomizeService loadCountByorderNumberCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "39ecb72e-039d-40fe-90e8-23b49230ae76",rules = { })})
    @PostMapping("/api/lcplogics/loadCountByorderNumber")
    public ApiReturn<Long> loadCountByorderNumber(@RequestBody LoadCountByorderNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadCountByorderNumberCustomizeService.loadCountByorderNumber(body.getOrderNumber()));
    } 

}
