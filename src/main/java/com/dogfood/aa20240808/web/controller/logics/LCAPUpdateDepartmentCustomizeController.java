package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LCAPUpdateDepartmentCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPUpdateDepartmentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPUpdateDepartmentCustomizeController {

    @Autowired
    private LCAPUpdateDepartmentCustomizeService lCAPUpdateDepartmentCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "d79b590d66584889a4b8384b68c88f45",rules = { @ValidationRule(value = "filled",targetName = "body.department.name",argvs = "",errorMsg = "部门名称不得为空")})})
    @PostMapping("/api/lcplogics/LCAPUpdateDepartment")
    public void lCAPUpdateDepartment(@RequestBody LCAPUpdateDepartmentCustomizeControllerDto body) throws Exception {
        lCAPUpdateDepartmentCustomizeService.lCAPUpdateDepartment(body.getDepartment());
    } 


}
