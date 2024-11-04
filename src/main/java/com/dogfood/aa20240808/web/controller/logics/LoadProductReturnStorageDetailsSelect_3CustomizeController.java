package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadProductReturnStorageDetailsSelect_3CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductReturnStorageDetailsSelect_3CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductReturnStorageDetailsSelect_3CustomizeController {

    @Autowired
    private LoadProductReturnStorageDetailsSelect_3CustomizeService loadProductReturnStorageDetailsSelect_3CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "d8b42dc21c034e408ca1e2e6e2e10a6b",rules = { })})
    @PostMapping("/api/lcplogics/loadProductReturnStorageDetailsSelect_3")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_81C47AE0C4FBFF20DD913EDAD8D8292C> loadProductReturnStorageDetailsSelect_3(@RequestBody LoadProductReturnStorageDetailsSelect_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductReturnStorageDetailsSelect_3CustomizeService.loadProductReturnStorageDetailsSelect_3(body.getPage(), body.getSize(), body.getNum()));
    } 


}
