package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadTotalQuantity2CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadTotalQuantity2CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadTotalQuantity2CustomizeController {

    @Autowired
    private LoadTotalQuantity2CustomizeService loadTotalQuantity2CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "82ad844913e44402b7b1cdeea924ae38",rules = { })})
    @PostMapping("/api/lcplogics/loadTotalQuantity2")
    public ApiReturn<Long> loadTotalQuantity2(@RequestBody LoadTotalQuantity2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadTotalQuantity2CustomizeService.loadTotalQuantity2(body.getId(), body.getCode(), body.getBatchNumber()));
    } 

}
