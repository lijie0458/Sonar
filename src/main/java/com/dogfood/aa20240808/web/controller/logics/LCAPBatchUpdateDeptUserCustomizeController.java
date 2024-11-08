package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.LCAPBatchUpdateDeptUserCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPBatchUpdateDeptUserCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPBatchUpdateDeptUserCustomizeController {

    @Autowired
    private LCAPBatchUpdateDeptUserCustomizeService lCAPBatchUpdateDeptUserCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "ca1bb9bc727548dcb114f4dc40153897",rules = { @ValidationRule(value = "filled",targetName = "body.deptId",argvs = "",errorMsg = "所属部门不得为空")}),@ValidationRuleGroup(value = "1e0f97405b1047a2b2a3e16ef5e6bd72",rules = { @ValidationRule(value = "filled",targetName = "body.deptId",argvs = "",errorMsg = "所属部门不得为空")}),@ValidationRuleGroup(value = "fed1e78315df4b218268d3a9eddc612a",rules = { @ValidationRule(value = "filled",targetName = "body.deptId",argvs = "",errorMsg = "所属部门不得为空")})})
    @PostMapping("/api/lcplogics/LCAPBatchUpdateDeptUser")
    public void lCAPBatchUpdateDeptUser(@RequestBody LCAPBatchUpdateDeptUserCustomizeControllerDto body) throws Exception {
        lCAPBatchUpdateDeptUserCustomizeService.lCAPBatchUpdateDeptUser(body.getUserIds(), body.getDeptId(), body.getOldDeptId());
    } 

}
