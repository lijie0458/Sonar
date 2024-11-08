package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPJudgeDeptIdRepeatedCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LCAPJudgeDeptIdRepeatedCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPJudgeDeptIdRepeatedCustomizeController {

    @Autowired
    private LCAPJudgeDeptIdRepeatedCustomizeService lCAPJudgeDeptIdRepeatedCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "e54c6080901641ebbf33e508293ecdd3",rules = { })})
    @PostMapping("/api/lcplogics/LCAPJudgeDeptIdRepeated")
    public ApiReturn<Boolean> lCAPJudgeDeptIdRepeated(@RequestBody LCAPJudgeDeptIdRepeatedCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPJudgeDeptIdRepeatedCustomizeService.lCAPJudgeDeptIdRepeated(body.getDeptId()));
    } 

}
