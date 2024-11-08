package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LCAPCreateDepartmentCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPCreateDepartmentCustomizeControllerDto; 

@RestController
public class LCAPCreateDepartmentCustomizeController {

    @Autowired
    private LCAPCreateDepartmentCustomizeService lCAPCreateDepartmentCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "2236bed3f519402ab283454a16cd9c48",rules = { @ValidationRule(value = "filled",targetName = "body.department.name",argvs = "",errorMsg = "部门名称不得为空")})})
    @PostMapping("/api/lcplogics/LCAPCreateDepartment")
    public void lCAPCreateDepartment(@RequestBody LCAPCreateDepartmentCustomizeControllerDto body) throws Exception {
        lCAPCreateDepartmentCustomizeService.lCAPCreateDepartment(body.getDepartment());
    } 

}
