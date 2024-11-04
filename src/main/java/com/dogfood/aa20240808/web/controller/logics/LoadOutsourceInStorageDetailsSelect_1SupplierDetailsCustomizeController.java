package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOutsourceInStorageDetailsSelect_1SupplierDetailsCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadOutsourceInStorageDetailsSelect_1SupplierDetailsCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOutsourceInStorageDetailsSelect_1SupplierDetailsCustomizeController {

    @Autowired
    private LoadOutsourceInStorageDetailsSelect_1SupplierDetailsCustomizeService loadOutsourceInStorageDetailsSelect_1SupplierDetailsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "24384644-023e-40ed-9d0b-087d3a3063fb",rules = { })})
    @PostMapping("/api/lcplogics/loadOutsourceInStorageDetailsSelect_1SupplierDetails")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7> loadOutsourceInStorageDetailsSelect_1SupplierDetails(@RequestBody LoadOutsourceInStorageDetailsSelect_1SupplierDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOutsourceInStorageDetailsSelect_1SupplierDetailsCustomizeService.loadOutsourceInStorageDetailsSelect_1SupplierDetails(body.getPage(), body.getSize()));
    } 


}
