package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductionMaterialRequisitionCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadProductionMaterialRequisitionCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductionMaterialRequisitionCustomizeController {

    @Autowired
    private LoadProductionMaterialRequisitionCustomizeService loadProductionMaterialRequisitionCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "cff21853-c58e-400b-bd09-ca01df40fd52",rules = { }),@ValidationRuleGroup(value = "9215689b-348f-45d6-aa20-49d66204180d",rules = { }),@ValidationRuleGroup(value = "fbd40991671940d98f2871ff384c3052",rules = { }),@ValidationRuleGroup(value = "e13335e3b3634b29b37f11213eaddf48",rules = { }),@ValidationRuleGroup(value = "e03aa6c8-43b3-4ae9-8188-808bb136c0b3",rules = { }),@ValidationRuleGroup(value = "db18d01c-2aeb-408e-923f-f39139a90735",rules = { })})
    @PostMapping("/api/lcplogics/loadProductionMaterialRequisition")
    public ApiReturn<String> loadProductionMaterialRequisition(@RequestBody LoadProductionMaterialRequisitionCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductionMaterialRequisitionCustomizeService.loadProductionMaterialRequisition(body.getDistinctionEnum()));
    } 

}
