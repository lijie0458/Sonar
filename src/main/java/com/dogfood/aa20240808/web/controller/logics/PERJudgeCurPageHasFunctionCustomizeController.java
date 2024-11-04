package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERJudgeCurPageHasFunctionCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.PERJudgeCurPageHasFunctionCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERJudgeCurPageHasFunctionCustomizeController {

    @Autowired
    private PERJudgeCurPageHasFunctionCustomizeService pERJudgeCurPageHasFunctionCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "6f91c935-7c02-40ac-85c2-fdf0b9db71b3",rules = { })})
    @PostMapping("/api/lcplogics/PERJudgeCurPageHasFunction")
    public ApiReturn<Boolean> pERJudgeCurPageHasFunction(@RequestBody PERJudgeCurPageHasFunctionCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERJudgeCurPageHasFunctionCustomizeService.pERJudgeCurPageHasFunction(body.getPageId()));
    } 


}
