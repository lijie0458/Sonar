package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERJudgeCurModuleHasPageCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.PERJudgeCurModuleHasPageCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERJudgeCurModuleHasPageCustomizeController {

    @Autowired
    private PERJudgeCurModuleHasPageCustomizeService pERJudgeCurModuleHasPageCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "0ecde79f-3528-440f-aa32-878acb5b1255",rules = { })})
    @PostMapping("/api/lcplogics/PERJudgeCurModuleHasPage")
    public ApiReturn<Boolean> pERJudgeCurModuleHasPage(@RequestBody PERJudgeCurModuleHasPageCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERJudgeCurModuleHasPageCustomizeService.pERJudgeCurModuleHasPage(body.getModuleId()));
    } 

}
