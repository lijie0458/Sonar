package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehouseInventoryCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseInventoryCustomizeService; 

@RestController
public class LoadWarehouseInventoryCustomizeController {

    @Autowired
    private LoadWarehouseInventoryCustomizeService loadWarehouseInventoryCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "4776e80e-dce9-4cd2-80e3-3fc903f4ed82",rules = { }),@ValidationRuleGroup(value = "873ec641-b013-47a8-9d26-a6e56ace7a07",rules = { }),@ValidationRuleGroup(value = "1daa18c0-8636-4d70-bffd-64f9b128d054",rules = { }),@ValidationRuleGroup(value = "50d06ab9-e310-414d-ac70-2e57610ce92f",rules = { }),@ValidationRuleGroup(value = "430ac4e8-327c-4e3f-906a-c2dc458af4f5",rules = { }),@ValidationRuleGroup(value = "08ff90b2-b2a1-48e8-9e25-59c225d2bb1d",rules = { })})
    @PostMapping("/api/lcplogics/LoadWarehouseInventory")
    public ApiReturn<List<InventoryEntity>> loadWarehouseInventory(@RequestBody LoadWarehouseInventoryCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehouseInventoryCustomizeService.loadWarehouseInventory(body.getWarehouseinventory(), body.getDistinctionEnum()));
    } 


}
