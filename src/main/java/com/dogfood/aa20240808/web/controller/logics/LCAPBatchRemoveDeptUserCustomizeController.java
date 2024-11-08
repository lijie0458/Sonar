package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPBatchRemoveDeptUserCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LCAPBatchRemoveDeptUserCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPBatchRemoveDeptUserCustomizeController {

    @Autowired
    private LCAPBatchRemoveDeptUserCustomizeService lCAPBatchRemoveDeptUserCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "9b23eaff87b24970b2565fad940e2c14",rules = { }),@ValidationRuleGroup(value = "206f9f19700848e1828f2f81477adb26",rules = { })})
    @PostMapping("/api/lcplogics/LCAPBatchRemoveDeptUser")
    public void lCAPBatchRemoveDeptUser(@RequestBody LCAPBatchRemoveDeptUserCustomizeControllerDto body) throws Exception {
        lCAPBatchRemoveDeptUserCustomizeService.lCAPBatchRemoveDeptUser(body.getUserIds(), body.getDeptId());
    } 

}
