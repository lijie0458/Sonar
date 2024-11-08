package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOutsourceSelect_1LCAPUser1CustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadOutsourceSelect_1LCAPUser1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOutsourceSelect_1LCAPUser1CustomizeController {

    @Autowired
    private LoadOutsourceSelect_1LCAPUser1CustomizeService loadOutsourceSelect_1LCAPUser1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "578e5414-3662-496b-96ee-24f8e7772800",rules = { }),@ValidationRuleGroup(value = "925ade24-62df-4339-9200-6181aaf0a88c",rules = { })})
    @PostMapping("/api/lcplogics/loadOutsourceSelect_1LCAPUser1")
    public ApiReturn<AnonymousStructure_90BB04F104917B26166C550B4A1B0632> loadOutsourceSelect_1LCAPUser1(@RequestBody LoadOutsourceSelect_1LCAPUser1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOutsourceSelect_1LCAPUser1CustomizeService.loadOutsourceSelect_1LCAPUser1(body.getPage(), body.getSize()));
    } 

}
