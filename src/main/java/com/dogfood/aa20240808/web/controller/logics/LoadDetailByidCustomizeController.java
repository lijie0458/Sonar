package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadDetailByidCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDetailByidCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadDetailByidCustomizeController {

    @Autowired
    private LoadDetailByidCustomizeService loadDetailByidCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "0758f233b9ff4dd5905aa6212dbfd006",rules = { })})
    @PostMapping("/api/lcplogics/loadDetailByid")
    public ApiReturn<AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC> loadDetailByid(@RequestBody LoadDetailByidCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDetailByidCustomizeService.loadDetailByid(body.getId()));
    } 

}
