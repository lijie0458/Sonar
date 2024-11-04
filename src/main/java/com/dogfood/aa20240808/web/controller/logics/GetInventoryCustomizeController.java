package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetInventoryCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetInventoryCustomizeControllerDto; 

@RestController
public class GetInventoryCustomizeController {

    @Autowired
    private GetInventoryCustomizeService getInventoryCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "ca6a4e6bf7d34657b075ec6b5a528be8",rules = { }),@ValidationRuleGroup(value = "a941aedae9cf420b9e5bc5f7d5626414",rules = { }),@ValidationRuleGroup(value = "bd24f7e68a704ddc91ae20f35eda7a05",rules = { }),@ValidationRuleGroup(value = "51300d37-6920-4daf-acd1-943e4bda7f91",rules = { }),@ValidationRuleGroup(value = "6c46e541f542456eb89d0076b0e8a7da",rules = { }),@ValidationRuleGroup(value = "0b50745f-acbf-4370-820d-7d1b2da5b17b",rules = { }),@ValidationRuleGroup(value = "b32b3f1e872f4244a189bb6085b851b9",rules = { }),@ValidationRuleGroup(value = "7d601cd4fce34ebc886cbeecd86b402b",rules = { }),@ValidationRuleGroup(value = "39d9c4cf990c485b83c01d149ff4563c",rules = { })})
    @PostMapping("/api/lcplogics/getInventory")
    public ApiReturn<InventoryEntity> getInventory(@RequestBody GetInventoryCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getInventoryCustomizeService.getInventory(body.getMaterialCode(), body.getLotNumber(), body.getWarehouse(), body.getStorageLocationId()));
    } 


}
