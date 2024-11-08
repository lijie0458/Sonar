package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LogicOrderDataByCodeCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LogicOrderDataByCodeCustomizeControllerDto; 

@RestController
public class LogicOrderDataByCodeCustomizeController {

    @Autowired
    private LogicOrderDataByCodeCustomizeService logicOrderDataByCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "d04f5bde3d564472a4ba95bb54b3af79",rules = { }),@ValidationRuleGroup(value = "ad63c9bc12984d9b9d6dafb3183f266f",rules = { })})
    @PostMapping("/api/lcplogics/logicOrderDataByCode")
    public ApiReturn<Boolean> logicOrderDataByCode(@RequestBody LogicOrderDataByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(logicOrderDataByCodeCustomizeService.logicOrderDataByCode(body.getParam1()));
    } 

}
