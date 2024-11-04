package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductionDetailByCodeCustomizeControllerDto; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadProductionDetailByCodeCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.domain.structure.ProductionMaterialRequisitionDetailsStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductionDetailByCodeCustomizeController {

    @Autowired
    private LoadProductionDetailByCodeCustomizeService loadProductionDetailByCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "958b766c-09da-42a6-9b90-0d3d756131a4",rules = { }),@ValidationRuleGroup(value = "7245452e0b1849588b0d900d7eb51190",rules = { }),@ValidationRuleGroup(value = "22acd8fc-a0f9-425d-8938-7ddd8b1e7641",rules = { }),@ValidationRuleGroup(value = "100056eea02f401fbc801caeac5b0315",rules = { }),@ValidationRuleGroup(value = "1bd5eb0e3b8d4ed0bb0a88f802bc1888",rules = { }),@ValidationRuleGroup(value = "333262d2-4554-452c-9a7f-00d1a8170237",rules = { })})
    @PostMapping("/api/lcplogics/loadProductionDetailByCode")
    public ApiReturn<List<ProductionMaterialRequisitionDetailsStructure>> loadProductionDetailByCode(@RequestBody LoadProductionDetailByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductionDetailByCodeCustomizeService.loadProductionDetailByCode(body.getInventoryList()));
    } 


}
