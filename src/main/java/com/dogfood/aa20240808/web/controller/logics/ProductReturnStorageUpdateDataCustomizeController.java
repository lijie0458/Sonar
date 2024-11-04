package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.ProductReturnStorageUpdateDataCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.ProductReturnStorageUpdateDataCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class ProductReturnStorageUpdateDataCustomizeController {

    @Autowired
    private ProductReturnStorageUpdateDataCustomizeService productReturnStorageUpdateDataCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "6e2afe9f3e7d4ff2b68a2df337d67657",rules = { })})
    @PostMapping("/api/lcplogics/productReturnStorageUpdateData")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C6669C4944106C618500528DC95920ED> productReturnStorageUpdateData(@RequestBody ProductReturnStorageUpdateDataCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(productReturnStorageUpdateDataCustomizeService.productReturnStorageUpdateData(body.getProductReturnCode()));
    } 


}
