package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadAddPurchaseOrderUpdateSelect1CustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadAddPurchaseOrderUpdateSelect1CustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAddPurchaseOrderUpdateSelect1CustomizeController {

    @Autowired
    private LoadAddPurchaseOrderUpdateSelect1CustomizeService loadAddPurchaseOrderUpdateSelect1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "4408e3a1-ca97-4f39-aa82-2f5d13394dbe",rules = { })})
    @PostMapping("/api/lcplogics/loadAddPurchaseOrderUpdateSelect1")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34>> loadAddPurchaseOrderUpdateSelect1(@RequestBody LoadAddPurchaseOrderUpdateSelect1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadAddPurchaseOrderUpdateSelect1CustomizeService.loadAddPurchaseOrderUpdateSelect1(body.getPage(), body.getSize()));
    } 


}
