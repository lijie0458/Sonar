package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadEditToDetailsBydepartmentNumberCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadEditToDetailsBydepartmentNumberCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.domain.structure.ProductionMaterialRequisitionDetailsStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadEditToDetailsBydepartmentNumberCustomizeController {

    @Autowired
    private LoadEditToDetailsBydepartmentNumberCustomizeService loadEditToDetailsBydepartmentNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "37d1460d44a14cae951485160b11c3c3",rules = { }),@ValidationRuleGroup(value = "cc5e1765-26e4-47a9-9afc-eba97fba8f2c",rules = { }),@ValidationRuleGroup(value = "ccf74808-c5b9-4069-8084-335331c490b0",rules = { }),@ValidationRuleGroup(value = "bf3dae18b7c14ac29253bc31976acc9e",rules = { }),@ValidationRuleGroup(value = "794eef42-2835-41bc-8b98-5806e96f2610",rules = { }),@ValidationRuleGroup(value = "4572af2d-d210-4b0e-9f06-109e6c9ee177",rules = { })})
    @PostMapping("/api/lcplogics/loadEditToDetailsBydepartmentNumber")
    public ApiReturn<List<ProductionMaterialRequisitionDetailsStructure>> loadEditToDetailsBydepartmentNumber(@RequestBody LoadEditToDetailsBydepartmentNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadEditToDetailsBydepartmentNumberCustomizeService.loadEditToDetailsBydepartmentNumber(body.getDepartment_Number()));
    } 


}
