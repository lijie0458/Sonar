package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadWarehousingDetailsSelect_11DepartmentCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehousingDetailsSelect_11DepartmentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadWarehousingDetailsSelect_11DepartmentCustomizeController {

    @Autowired
    private LoadWarehousingDetailsSelect_11DepartmentCustomizeService loadWarehousingDetailsSelect_11DepartmentCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "4f7a688db83a4c60922fe5df4671b371",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehousingDetailsSelect_11Department")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258> loadWarehousingDetailsSelect_11Department(@RequestBody LoadWarehousingDetailsSelect_11DepartmentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehousingDetailsSelect_11DepartmentCustomizeService.loadWarehousingDetailsSelect_11Department(body.getPage(), body.getSize()));
    } 


}
