package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetUserTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LCAPGetUserTableViewCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPGetUserTableViewCustomizeController {

    @Autowired
    private LCAPGetUserTableViewCustomizeService lCAPGetUserTableViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "ec256e2321d043a68b520559ee0e73bd",rules = { }),@ValidationRuleGroup(value = "cce43dc0-9032-4ff2-acae-d8742b650e22",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetUserTableView")
    public ApiReturn<AnonymousStructure_90BB04F104917B26166C550B4A1B0632> lCAPGetUserTableView(@RequestBody LCAPGetUserTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetUserTableViewCustomizeService.lCAPGetUserTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 

}
