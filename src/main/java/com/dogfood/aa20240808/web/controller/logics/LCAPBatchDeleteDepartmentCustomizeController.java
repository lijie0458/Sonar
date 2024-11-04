package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPBatchDeleteDepartmentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LCAPBatchDeleteDepartmentCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPBatchDeleteDepartmentCustomizeController {

    @Autowired
    private LCAPBatchDeleteDepartmentCustomizeService lCAPBatchDeleteDepartmentCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "350a610f74164765a7b7028b38ebd637",rules = { })})
    @PostMapping("/api/lcplogics/LCAPBatchDeleteDepartment")
    public ApiReturn<String> lCAPBatchDeleteDepartment(@RequestBody LCAPBatchDeleteDepartmentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPBatchDeleteDepartmentCustomizeService.lCAPBatchDeleteDepartment(body.getIds()));
    } 


}
