package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadSaleOderByInventoryId1CustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.SaleOrderDetailStrutureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSaleOderByInventoryId1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSaleOderByInventoryId1CustomizeController {

    @Autowired
    private LoadSaleOderByInventoryId1CustomizeService loadSaleOderByInventoryId1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "328f5c21-7808-4ecb-bb36-2ff10594cc51",rules = { })})
    @PostMapping("/api/lcplogics/loadSaleOderByInventoryId1")
    public ApiReturn<List<SaleOrderDetailStrutureStructure>> loadSaleOderByInventoryId1(@RequestBody LoadSaleOderByInventoryId1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSaleOderByInventoryId1CustomizeService.loadSaleOderByInventoryId1(body.getParam1()));
    } 


}
