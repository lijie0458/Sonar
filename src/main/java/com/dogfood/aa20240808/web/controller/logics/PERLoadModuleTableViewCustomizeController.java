package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.PERLoadModuleTableViewCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERLoadModuleTableViewCustomizeController {

    @Autowired
    private PERLoadModuleTableViewCustomizeService pERLoadModuleTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "fced7c87-0979-4cf8-a96c-0eca369bdead",rules = { }),@ValidationRuleGroup(value = "054d0a66-d5a0-4aa8-adc2-1e0bb5dd4a32",rules = { })})
    @PostMapping("/api/lcplogics/PERLoadModuleTableView")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D>> pERLoadModuleTableView() throws Exception {
        return ApiReturn.of(pERLoadModuleTableViewCustomizeService.pERLoadModuleTableView());
    } 


}
