package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadDepartmentTableView_1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDepartmentTableView_1CustomizeControllerDto; 

@RestController
public class LoadDepartmentTableView_1CustomizeController {

    @Autowired
    private LoadDepartmentTableView_1CustomizeService loadDepartmentTableView_1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bd677e7a-42a3-4368-8d6e-9a930e9a2c71",rules = { })})
    @PostMapping("/api/lcplogics/loadDepartmentTableView_1")
    public ApiReturn<AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73> loadDepartmentTableView_1(@RequestBody LoadDepartmentTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDepartmentTableView_1CustomizeService.loadDepartmentTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getDepartmentId()));
    } 

}
