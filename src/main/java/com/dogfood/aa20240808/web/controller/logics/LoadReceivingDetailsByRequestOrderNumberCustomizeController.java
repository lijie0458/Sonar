package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.ReceivingDetailsStructureStructure; 
import com.dogfood.aa20240808.service.logics.LoadReceivingDetailsByRequestOrderNumberCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadReceivingDetailsByRequestOrderNumberCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadReceivingDetailsByRequestOrderNumberCustomizeController {

    @Autowired
    private LoadReceivingDetailsByRequestOrderNumberCustomizeService loadReceivingDetailsByRequestOrderNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5e4d2764c3064f7bafb28d76304a8289",rules = { })})
    @PostMapping("/api/lcplogics/loadReceivingDetailsByRequestOrderNumber")
    public ApiReturn<List<ReceivingDetailsStructureStructure>> loadReceivingDetailsByRequestOrderNumber(@RequestBody LoadReceivingDetailsByRequestOrderNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadReceivingDetailsByRequestOrderNumberCustomizeService.loadReceivingDetailsByRequestOrderNumber(body.getOrder_number()));
    } 


}
