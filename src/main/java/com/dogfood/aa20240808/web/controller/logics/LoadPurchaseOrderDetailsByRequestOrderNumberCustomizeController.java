package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.domain.structure.PurchaseOrderDetailStructureStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseOrderDetailsByRequestOrderNumberCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseOrderDetailsByRequestOrderNumberCustomizeControllerDto; 

@RestController
public class LoadPurchaseOrderDetailsByRequestOrderNumberCustomizeController {

    @Autowired
    private LoadPurchaseOrderDetailsByRequestOrderNumberCustomizeService loadPurchaseOrderDetailsByRequestOrderNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "8b6d2ac1bb2d4e72aaa1f24128c8e9e8",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseOrderDetailsByRequestOrderNumber")
    public ApiReturn<List<PurchaseOrderDetailStructureStructure>> loadPurchaseOrderDetailsByRequestOrderNumber(@RequestBody LoadPurchaseOrderDetailsByRequestOrderNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseOrderDetailsByRequestOrderNumberCustomizeService.loadPurchaseOrderDetailsByRequestOrderNumber(body.getRequest_number()));
    } 


}
