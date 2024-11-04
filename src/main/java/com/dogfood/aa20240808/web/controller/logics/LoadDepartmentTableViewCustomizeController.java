package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDepartmentTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadDepartmentTableViewCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadDepartmentTableViewCustomizeController {

    @Autowired
    private LoadDepartmentTableViewCustomizeService loadDepartmentTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "83f3a8a7-d4aa-400c-ba74-21a34ce7d93c",rules = { }),@ValidationRuleGroup(value = "5b441fb8-e685-400c-8909-0645c9044c54",rules = { })})
    @PostMapping("/api/lcplogics/loadDepartmentTableView")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258> loadDepartmentTableView(@RequestBody LoadDepartmentTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDepartmentTableViewCustomizeService.loadDepartmentTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
