package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadCountGoodsReturnedNoteCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountGoodsReturnedNoteCustomizeController {

    @Autowired
    private LoadCountGoodsReturnedNoteCustomizeService loadCountGoodsReturnedNoteCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "6a9136ef7ba54d09ac3e87825dda4bcc",rules = { })})
    @PostMapping("/api/lcplogics/loadCountGoodsReturnedNote")
    public ApiReturn<String> loadCountGoodsReturnedNote() throws Exception {
        return ApiReturn.of(loadCountGoodsReturnedNoteCustomizeService.loadCountGoodsReturnedNote());
    } 

}
