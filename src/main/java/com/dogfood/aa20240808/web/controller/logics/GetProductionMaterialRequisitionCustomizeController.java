package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetProductionMaterialRequisitionCustomizeControllerDto; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetProductionMaterialRequisitionCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetProductionMaterialRequisitionCustomizeController {

    @Autowired
    private GetProductionMaterialRequisitionCustomizeService getProductionMaterialRequisitionCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "76e9f31eda814e1cb65d71752dc8b561",rules = { })})
    @PostMapping("/api/lcplogics/getProductionMaterialRequisition")
    public ApiReturn<AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396> getProductionMaterialRequisition(@RequestBody GetProductionMaterialRequisitionCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getProductionMaterialRequisitionCustomizeService.getProductionMaterialRequisition(body.getParam1()));
    } 

}
