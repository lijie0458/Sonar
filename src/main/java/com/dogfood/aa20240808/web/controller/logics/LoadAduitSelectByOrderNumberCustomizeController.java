package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadAduitSelectByOrderNumberCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadAduitSelectByOrderNumberCustomizeControllerDto; 

@RestController
public class LoadAduitSelectByOrderNumberCustomizeController {

    @Autowired
    private LoadAduitSelectByOrderNumberCustomizeService loadAduitSelectByOrderNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "a89e7d94-eaba-4444-a1dc-d0a0ad706d96",rules = { }),@ValidationRuleGroup(value = "1a8839c9-c010-4714-9774-99141f7ae87f",rules = { })})
    @PostMapping("/api/lcplogics/loadAduitSelectByOrderNumber")
    public void loadAduitSelectByOrderNumber(@RequestBody LoadAduitSelectByOrderNumberCustomizeControllerDto body) throws Exception {
        loadAduitSelectByOrderNumberCustomizeService.loadAduitSelectByOrderNumber(body.getOrderNumber());
    } 


}
