package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetProductInStorageDetailsByNumCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetProductInStorageDetailsByNumCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_43C4248D3E0D419ADBA05E27680916BA; 

@RestController
public class GetProductInStorageDetailsByNumCustomizeController {

    @Autowired
    private GetProductInStorageDetailsByNumCustomizeService getProductInStorageDetailsByNumCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "f3dc44eecd8b479e8acb00488fba89bd",rules = { })})
    @PostMapping("/api/lcplogics/getProductInStorageDetailsByNum")
    public ApiReturn<AnonymousStructure_43C4248D3E0D419ADBA05E27680916BA> getProductInStorageDetailsByNum(@RequestBody GetProductInStorageDetailsByNumCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getProductInStorageDetailsByNumCustomizeService.getProductInStorageDetailsByNum(body.getNum()));
    } 

}
