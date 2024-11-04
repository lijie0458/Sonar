package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERJudgeOrgHasUserCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.PERJudgeOrgHasUserCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERJudgeOrgHasUserCustomizeController {

    @Autowired
    private PERJudgeOrgHasUserCustomizeService pERJudgeOrgHasUserCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "99c758bf-77ce-4f1a-9787-e3999f86cfaa",rules = { })})
    @PostMapping("/api/lcplogics/PERJudgeOrgHasUser")
    public ApiReturn<Boolean> pERJudgeOrgHasUser(@RequestBody PERJudgeOrgHasUserCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERJudgeOrgHasUserCustomizeService.pERJudgeOrgHasUser(body.getOrgId()));
    } 


}
