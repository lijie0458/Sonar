package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.PERGetAllUserNameCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERGetAllUserNameCustomizeController {

    @Autowired
    private PERGetAllUserNameCustomizeService pERGetAllUserNameCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "2b645700-8b91-4f9a-9c22-9e7218ffbb67",rules = { }),@ValidationRuleGroup(value = "b4344a04-9823-495c-b98d-10240830b2e5",rules = { })})
    @PostMapping("/api/lcplogics/PERGetAllUserName")
    public ApiReturn<List<String>> pERGetAllUserName() throws Exception {
        return ApiReturn.of(pERGetAllUserNameCustomizeService.pERGetAllUserName());
    } 

}
