package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByOutsourceReutrnStorageCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByOutsourceReutrnStorageCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByOutsourceReutrnStorageCustomizeController {

    @Autowired
    private UpdateInventoryByOutsourceReutrnStorageCustomizeService updateInventoryByOutsourceReutrnStorageCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5795f38b-39e2-414b-aefd-7bcf771475bc",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByOutsourceReutrnStorage")
    public void updateInventoryByOutsourceReutrnStorage(@RequestBody UpdateInventoryByOutsourceReutrnStorageCustomizeControllerDto body) throws Exception {
        updateInventoryByOutsourceReutrnStorageCustomizeService.updateInventoryByOutsourceReutrnStorage(body.getCode(), body.getAddOrReduce());
    } 


}
