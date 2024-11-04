package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadBePutInStorageListSelect_2SupplierDetailsCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBePutInStorageListSelect_2SupplierDetailsCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadBePutInStorageListSelect_2SupplierDetailsCustomizeController {

    @Autowired
    private LoadBePutInStorageListSelect_2SupplierDetailsCustomizeService loadBePutInStorageListSelect_2SupplierDetailsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "e39b9d60-228a-462a-b822-5924ded55e5b",rules = { })})
    @PostMapping("/api/lcplogics/loadBePutInStorageListSelect_2SupplierDetails")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34>> loadBePutInStorageListSelect_2SupplierDetails(@RequestBody LoadBePutInStorageListSelect_2SupplierDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBePutInStorageListSelect_2SupplierDetailsCustomizeService.loadBePutInStorageListSelect_2SupplierDetails(body.getPage(), body.getSize()));
    } 


}
