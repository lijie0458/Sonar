package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByProductReutrnS3CustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByProductReutrnS3CustomizeService; 

@RestController
public class UpdateInventoryByProductReutrnS3CustomizeController {

    @Autowired
    private UpdateInventoryByProductReutrnS3CustomizeService updateInventoryByProductReutrnS3CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "18ec0c4444a647b48a23352afd17befa",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByProductReutrnS3")
    public void updateInventoryByProductReutrnS3(@RequestBody UpdateInventoryByProductReutrnS3CustomizeControllerDto body) throws Exception {
        updateInventoryByProductReutrnS3CustomizeService.updateInventoryByProductReutrnS3(body.getGoodsReturnCode(), body.getAddOrReduce());
    } 

}
