package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehousingSelect_1LCAPUserCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadWarehousingSelect_1LCAPUserCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadWarehousingSelect_1LCAPUserCustomizeController {

    @Autowired
    private LoadWarehousingSelect_1LCAPUserCustomizeService loadWarehousingSelect_1LCAPUserCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "c1d4a314942048d7aa00392976ba3ca3",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehousingSelect_1LCAPUser")
    public ApiReturn<AnonymousStructure_90BB04F104917B26166C550B4A1B0632> loadWarehousingSelect_1LCAPUser(@RequestBody LoadWarehousingSelect_1LCAPUserCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehousingSelect_1LCAPUserCustomizeService.loadWarehousingSelect_1LCAPUser(body.getPage(), body.getSize()));
    } 

}
