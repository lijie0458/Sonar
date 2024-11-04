package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetSalesTrendCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetSalesTrendCustomizeController {

    @Autowired
    private GetSalesTrendCustomizeService getSalesTrendCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "f517fa314f6c4617bad1b05ff9071f99",rules = { })})
    @PostMapping("/api/lcplogics/getSalesTrend")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151>> getSalesTrend() throws Exception {
        return ApiReturn.of(getSalesTrendCustomizeService.getSalesTrend());
    } 


}
