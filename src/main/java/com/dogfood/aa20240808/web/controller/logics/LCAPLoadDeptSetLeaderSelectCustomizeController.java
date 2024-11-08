package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPLoadDeptSetLeaderSelectCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LCAPLoadDeptSetLeaderSelectCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPLoadDeptSetLeaderSelectCustomizeController {

    @Autowired
    private LCAPLoadDeptSetLeaderSelectCustomizeService lCAPLoadDeptSetLeaderSelectCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "b4bcf6752f594ebd9cc29864ec3ab508",rules = { })})
    @PostMapping("/api/lcplogics/LCAPLoadDeptSetLeaderSelect")
    public ApiReturn<AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E> lCAPLoadDeptSetLeaderSelect(@RequestBody LCAPLoadDeptSetLeaderSelectCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPLoadDeptSetLeaderSelectCustomizeService.lCAPLoadDeptSetLeaderSelect(body.getPage(), body.getSize(), body.getDeptId()));
    } 

}
