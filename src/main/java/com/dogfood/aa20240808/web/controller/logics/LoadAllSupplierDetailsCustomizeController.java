package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadAllSupplierDetailsCustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAllSupplierDetailsCustomizeController {

    @Autowired
    private LoadAllSupplierDetailsCustomizeService loadAllSupplierDetailsCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "9b5592648e4d49e4a584c35881612c71",rules = { })})
    @PostMapping("/api/lcplogics/loadAllSupplierDetails")
    public ApiReturn<AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7> loadAllSupplierDetails() throws Exception {
        return ApiReturn.of(loadAllSupplierDetailsCustomizeService.loadAllSupplierDetails());
    } 

}
