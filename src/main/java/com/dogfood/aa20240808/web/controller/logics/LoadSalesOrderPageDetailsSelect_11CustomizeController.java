package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A11AF91CE5BDC8E059810F0AAE38812B; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesOrderPageDetailsSelect_11CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadSalesOrderPageDetailsSelect_11CustomizeService; 

@RestController
public class LoadSalesOrderPageDetailsSelect_11CustomizeController {

    @Autowired
    private LoadSalesOrderPageDetailsSelect_11CustomizeService loadSalesOrderPageDetailsSelect_11CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "3def3159-b20a-4898-9525-abae52ec1f99",rules = { })})
    @PostMapping("/api/lcplogics/loadSalesOrderPageDetailsSelect_11")
    public ApiReturn<List<AnonymousStructure_A11AF91CE5BDC8E059810F0AAE38812B>> loadSalesOrderPageDetailsSelect_11(@RequestBody LoadSalesOrderPageDetailsSelect_11CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesOrderPageDetailsSelect_11CustomizeService.loadSalesOrderPageDetailsSelect_11(body.getList(), body.getParam1()));
    } 

}
