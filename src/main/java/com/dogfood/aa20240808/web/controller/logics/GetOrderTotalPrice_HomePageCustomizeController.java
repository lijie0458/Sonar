package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.GetOrderTotalPrice_HomePageCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import java.math.BigDecimal; 

@RestController
public class GetOrderTotalPrice_HomePageCustomizeController {

    @Autowired
    private GetOrderTotalPrice_HomePageCustomizeService getOrderTotalPrice_HomePageCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5bad826fdbc94036bc64f76e818d09c7",rules = { })})
    @PostMapping("/api/lcplogics/getOrderTotalPrice_HomePage")
    public ApiReturn<BigDecimal> getOrderTotalPrice_HomePage() throws Exception {
        return ApiReturn.of(getOrderTotalPrice_HomePageCustomizeService.getOrderTotalPrice_HomePage());
    } 


}
