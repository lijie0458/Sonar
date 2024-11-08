package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSupplierSelectSupplierCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4; 
import com.dogfood.aa20240808.service.logics.LoadSupplierSelectSupplierCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSupplierSelectSupplierCustomizeController {

    @Autowired
    private LoadSupplierSelectSupplierCustomizeService loadSupplierSelectSupplierCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "7be85d29-6bf5-416f-b77d-023759f4aaf9",rules = { })})
    @PostMapping("/api/lcplogics/loadSupplierSelectSupplier")
    public ApiReturn<AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4> loadSupplierSelectSupplier(@RequestBody LoadSupplierSelectSupplierCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSupplierSelectSupplierCustomizeService.loadSupplierSelectSupplier(body.getPage(), body.getSize()));
    } 

}
