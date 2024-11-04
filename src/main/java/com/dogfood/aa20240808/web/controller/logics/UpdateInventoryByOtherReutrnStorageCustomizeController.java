package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByOtherReutrnStorageCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByOtherReutrnStorageCustomizeService; 

@RestController
public class UpdateInventoryByOtherReutrnStorageCustomizeController {

    @Autowired
    private UpdateInventoryByOtherReutrnStorageCustomizeService updateInventoryByOtherReutrnStorageCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "042b530d-f1cd-487c-881e-55947e43d178",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByOtherReutrnStorage")
    public void updateInventoryByOtherReutrnStorage(@RequestBody UpdateInventoryByOtherReutrnStorageCustomizeControllerDto body) throws Exception {
        updateInventoryByOtherReutrnStorageCustomizeService.updateInventoryByOtherReutrnStorage(body.getOtherReturnCode(), body.getAddOrReduce());
    } 


}
