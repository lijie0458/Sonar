package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERJudgeOrgHasChildrenCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.PERJudgeOrgHasChildrenCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERJudgeOrgHasChildrenCustomizeController {

    @Autowired
    private PERJudgeOrgHasChildrenCustomizeService pERJudgeOrgHasChildrenCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "6c429bee-e7bf-430d-864a-4f4596afd290",rules = { })})
    @PostMapping("/api/lcplogics/PERJudgeOrgHasChildren")
    public ApiReturn<Boolean> pERJudgeOrgHasChildren(@RequestBody PERJudgeOrgHasChildrenCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERJudgeOrgHasChildrenCustomizeService.pERJudgeOrgHasChildren(body.getId()));
    } 

}
