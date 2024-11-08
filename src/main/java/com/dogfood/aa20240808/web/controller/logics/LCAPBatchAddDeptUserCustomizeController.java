package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPBatchAddDeptUserCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LCAPBatchAddDeptUserCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPBatchAddDeptUserCustomizeController {

    @Autowired
    private LCAPBatchAddDeptUserCustomizeService lCAPBatchAddDeptUserCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "f4b74d8142314883b71670ba8b657775",rules = { })})
    @PostMapping("/api/lcplogics/LCAPBatchAddDeptUser")
    public void lCAPBatchAddDeptUser(@RequestBody LCAPBatchAddDeptUserCustomizeControllerDto body) throws Exception {
        lCAPBatchAddDeptUserCustomizeService.lCAPBatchAddDeptUser(body.getUserIds(), body.getDeptId());
    } 

}
