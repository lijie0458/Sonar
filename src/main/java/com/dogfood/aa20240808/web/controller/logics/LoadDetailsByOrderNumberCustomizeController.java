package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadDetailsByOrderNumberCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDetailsByOrderNumberCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C; 

@RestController
public class LoadDetailsByOrderNumberCustomizeController {

    @Autowired
    private LoadDetailsByOrderNumberCustomizeService loadDetailsByOrderNumberCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "0fdb5309-a32f-4164-a0f2-811f4cb13465",rules = { }),@ValidationRuleGroup(value = "297fd62718304e0ca3c451989564dd39",rules = { }),@ValidationRuleGroup(value = "eb50ec0c-cff3-432a-9cab-7663041daacd",rules = { })})
    @PostMapping("/api/lcplogics/loadDetailsByOrderNumber")
    public ApiReturn<AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C> loadDetailsByOrderNumber(@RequestBody LoadDetailsByOrderNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDetailsByOrderNumberCustomizeService.loadDetailsByOrderNumber(body.getOrderNumber()));
    } 

}
