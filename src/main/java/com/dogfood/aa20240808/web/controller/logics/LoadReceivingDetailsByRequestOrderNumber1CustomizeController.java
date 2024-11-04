package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.ReceivingDetailsStructureStructure; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadReceivingDetailsByRequestOrderNumber1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadReceivingDetailsByRequestOrderNumber1CustomizeService; 

@RestController
public class LoadReceivingDetailsByRequestOrderNumber1CustomizeController {

    @Autowired
    private LoadReceivingDetailsByRequestOrderNumber1CustomizeService loadReceivingDetailsByRequestOrderNumber1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5a2ebbdfcdae4f8aa0491200e8eaae82",rules = { })})
    @PostMapping("/api/lcplogics/loadReceivingDetailsByRequestOrderNumber1")
    public ApiReturn<List<ReceivingDetailsStructureStructure>> loadReceivingDetailsByRequestOrderNumber1(@RequestBody LoadReceivingDetailsByRequestOrderNumber1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadReceivingDetailsByRequestOrderNumber1CustomizeService.loadReceivingDetailsByRequestOrderNumber1(body.getOrder_number()));
    } 


}
