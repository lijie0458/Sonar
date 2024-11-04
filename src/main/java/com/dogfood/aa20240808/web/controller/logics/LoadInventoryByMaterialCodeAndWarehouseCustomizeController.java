package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadInventoryByMaterialCodeAndWarehouseCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadInventoryByMaterialCodeAndWarehouseCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadInventoryByMaterialCodeAndWarehouseCustomizeController {

    @Autowired
    private LoadInventoryByMaterialCodeAndWarehouseCustomizeService loadInventoryByMaterialCodeAndWarehouseCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "0c57e154-4974-4897-93df-eaa5f833fdb2",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "",errorMsg = "")})})
    @PostMapping("/api/lcplogics/loadInventoryByMaterialCodeAndWarehouse")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C>> loadInventoryByMaterialCodeAndWarehouse(@RequestBody LoadInventoryByMaterialCodeAndWarehouseCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadInventoryByMaterialCodeAndWarehouseCustomizeService.loadInventoryByMaterialCodeAndWarehouse(body.getMaterialCode(), body.getWarehouse(), body.getLotNumber(), body.getLocation()));
    } 


}
