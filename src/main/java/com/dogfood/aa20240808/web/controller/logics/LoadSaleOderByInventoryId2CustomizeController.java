package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSaleOderByInventoryId2CustomizeControllerDto; 
import com.dogfood.aa20240808.domain.structure.ProductionMaterialRequisitionDetailsStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadSaleOderByInventoryId2CustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSaleOderByInventoryId2CustomizeController {

    @Autowired
    private LoadSaleOderByInventoryId2CustomizeService loadSaleOderByInventoryId2CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3db7a0c9-2455-4c53-85ef-0bb12e9363f5",rules = { }),@ValidationRuleGroup(value = "60cdb363cd234703a8b25af8b5918320",rules = { }),@ValidationRuleGroup(value = "cf389801-2319-4c59-9d09-a6e3ac1e1dcb",rules = { }),@ValidationRuleGroup(value = "8150d40f32464571ad0a48c84ed12624",rules = { }),@ValidationRuleGroup(value = "5a158ea7173349a5a6737e8f61bee895",rules = { }),@ValidationRuleGroup(value = "82206014-2751-46bf-891b-a1618e4fda6d",rules = { })})
    @PostMapping("/api/lcplogics/loadSaleOderByInventoryId2")
    public ApiReturn<List<ProductionMaterialRequisitionDetailsStructure>> loadSaleOderByInventoryId2(@RequestBody LoadSaleOderByInventoryId2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSaleOderByInventoryId2CustomizeService.loadSaleOderByInventoryId2(body.getParam1()));
    } 


}
