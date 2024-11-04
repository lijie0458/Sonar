package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadDepartmentByUsernameCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDepartmentByUsernameCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadDepartmentByUsernameCustomizeController {

    @Autowired
    private LoadDepartmentByUsernameCustomizeService loadDepartmentByUsernameCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "6c53066590f749e38efc59754574754e",rules = { })})
    @PostMapping("/api/lcplogics/loadDepartmentByUsername")
    public ApiReturn<DepartmentEntity> loadDepartmentByUsername(@RequestBody LoadDepartmentByUsernameCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDepartmentByUsernameCustomizeService.loadDepartmentByUsername(body.getUserName()));
    } 


}
