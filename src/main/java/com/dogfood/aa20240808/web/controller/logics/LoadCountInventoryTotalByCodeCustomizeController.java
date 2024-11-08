package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadCountInventoryTotalByCodeCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadCountInventoryTotalByCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import java.math.BigDecimal; 

@RestController
public class LoadCountInventoryTotalByCodeCustomizeController {

    @Autowired
    private LoadCountInventoryTotalByCodeCustomizeService loadCountInventoryTotalByCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "f9c13affe6a8434e8c68c2626d64dc1c",rules = { })})
    @PostMapping("/api/lcplogics/loadCountInventoryTotalByCode")
    public ApiReturn<BigDecimal> loadCountInventoryTotalByCode(@RequestBody LoadCountInventoryTotalByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadCountInventoryTotalByCodeCustomizeService.loadCountInventoryTotalByCode(body.getParam1()));
    } 

}
