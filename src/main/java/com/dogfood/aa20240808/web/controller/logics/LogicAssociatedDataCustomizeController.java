package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LogicAssociatedDataCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LogicAssociatedDataCustomizeControllerDto; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LogicAssociatedDataCustomizeController {

    @Autowired
    private LogicAssociatedDataCustomizeService logicAssociatedDataCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "5cb0a34f1fb7450e816cc96cfa495240",rules = { }),@ValidationRuleGroup(value = "4f50eb4a7ec54d8d9de5a3c625b8dfd5",rules = { })})
    @PostMapping("/api/lcplogics/logicAssociatedData")
    public ApiReturn<AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B> logicAssociatedData(@RequestBody LogicAssociatedDataCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(logicAssociatedDataCustomizeService.logicAssociatedData(body.getParam1()));
    } 

}
