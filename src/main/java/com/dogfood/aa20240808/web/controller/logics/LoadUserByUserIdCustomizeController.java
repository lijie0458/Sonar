package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadUserByUserIdCustomizeService; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadUserByUserIdCustomizeControllerDto; 

@RestController
public class LoadUserByUserIdCustomizeController {

    @Autowired
    private LoadUserByUserIdCustomizeService loadUserByUserIdCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "b86121b4136940f89fb48610739dd326",rules = { }),@ValidationRuleGroup(value = "f149c8381f704e22b36a9b207a0f86a5",rules = { }),@ValidationRuleGroup(value = "1bb178346bfb42458404e415013072a9",rules = { }),@ValidationRuleGroup(value = "5068b421158e4b67a3f2715140b904f5",rules = { }),@ValidationRuleGroup(value = "a548eccd-4e64-4c06-a079-b1ec401daa2e",rules = { }),@ValidationRuleGroup(value = "d610a6a6-6b9f-4910-abd2-346d008c2316",rules = { })})
    @PostMapping("/api/lcplogics/loadUserByUserId")
    public ApiReturn<LCAPUser> loadUserByUserId(@RequestBody LoadUserByUserIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadUserByUserIdCustomizeService.loadUserByUserId(body.getParam1()));
    } 

}
