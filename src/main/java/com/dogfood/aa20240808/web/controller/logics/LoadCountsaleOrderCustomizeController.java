package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadCountsaleOrderCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadCountsaleOrderCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountsaleOrderCustomizeController {

    @Autowired
    private LoadCountsaleOrderCustomizeService loadCountsaleOrderCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "2764d0a9ccfb4bbba235688177f02f07",rules = { }),@ValidationRuleGroup(value = "b090c23d39f9438480ff438d87bcfb08",rules = { }),@ValidationRuleGroup(value = "535e3d68-03de-467d-aa56-6b86b47fb2f3",rules = { }),@ValidationRuleGroup(value = "28271192-24f5-4fd8-b94b-cd44fd0115cc",rules = { }),@ValidationRuleGroup(value = "c687fbf9cf6449b794c347b70e5fa42e",rules = { }),@ValidationRuleGroup(value = "07f8a483daca49c9b9fff549ce2314c4",rules = { })})
    @PostMapping("/api/lcplogics/loadCountsaleOrder")
    public ApiReturn<String> loadCountsaleOrder(@RequestBody LoadCountsaleOrderCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadCountsaleOrderCustomizeService.loadCountsaleOrder(body.getDistinctionEnum()));
    } 

}
