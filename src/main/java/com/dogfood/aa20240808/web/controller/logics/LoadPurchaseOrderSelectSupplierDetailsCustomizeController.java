package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadPurchaseOrderSelectSupplierDetailsCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadPurchaseOrderSelectSupplierDetailsCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadPurchaseOrderSelectSupplierDetailsCustomizeController {

    @Autowired
    private LoadPurchaseOrderSelectSupplierDetailsCustomizeService loadPurchaseOrderSelectSupplierDetailsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "359679f5-0632-4dfc-8722-dd2c9c282bb3",rules = { })})
    @PostMapping("/api/lcplogics/loadPurchaseOrderSelectSupplierDetails")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34>> loadPurchaseOrderSelectSupplierDetails(@RequestBody LoadPurchaseOrderSelectSupplierDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadPurchaseOrderSelectSupplierDetailsCustomizeService.loadPurchaseOrderSelectSupplierDetails(body.getPage(), body.getSize()));
    } 


}
