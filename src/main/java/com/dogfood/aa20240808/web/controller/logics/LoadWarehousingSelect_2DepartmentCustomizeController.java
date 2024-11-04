package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehousingSelect_2DepartmentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadWarehousingSelect_2DepartmentCustomizeService; 

@RestController
public class LoadWarehousingSelect_2DepartmentCustomizeController {

    @Autowired
    private LoadWarehousingSelect_2DepartmentCustomizeService loadWarehousingSelect_2DepartmentCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5ee41a9698404272825bcd1180af2c8d",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehousingSelect_2Department")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258> loadWarehousingSelect_2Department(@RequestBody LoadWarehousingSelect_2DepartmentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehousingSelect_2DepartmentCustomizeService.loadWarehousingSelect_2Department(body.getPage(), body.getSize()));
    } 


}
