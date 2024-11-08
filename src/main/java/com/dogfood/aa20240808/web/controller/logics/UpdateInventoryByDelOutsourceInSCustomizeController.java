package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.UpdateInventoryByDelOutsourceInSCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.UpdateInventoryByDelOutsourceInSCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class UpdateInventoryByDelOutsourceInSCustomizeController {

    @Autowired
    private UpdateInventoryByDelOutsourceInSCustomizeService updateInventoryByDelOutsourceInSCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "3e2e724a-0f4e-4ded-9481-fbffeb1df97b",rules = { })})
    @PostMapping("/api/lcplogics/updateInventoryByDelOutsourceInS")
    public void updateInventoryByDelOutsourceInS(@RequestBody UpdateInventoryByDelOutsourceInSCustomizeControllerDto body) throws Exception {
        updateInventoryByDelOutsourceInSCustomizeService.updateInventoryByDelOutsourceInS(body.getOutsourceInSCode());
    } 

}
