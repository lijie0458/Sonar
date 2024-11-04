package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.PurchaseDetailStructureStructure; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseDetailsByRequestNumberCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseDetailsByRequestNumberCustomizeControllerDto; 

@RestController
public class LoadPurchaseDetailsByRequestNumberCustomizeController {

    @Autowired
    private LoadPurchaseDetailsByRequestNumberCustomizeService loadPurchaseDetailsByRequestNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "d736ebf963d84c4c95e2792f814a403c",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseDetailsByRequestNumber")
    public ApiReturn<List<PurchaseDetailStructureStructure>> loadPurchaseDetailsByRequestNumber(@RequestBody LoadPurchaseDetailsByRequestNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseDetailsByRequestNumberCustomizeService.loadPurchaseDetailsByRequestNumber(body.getRequest_number()));
    } 


}
