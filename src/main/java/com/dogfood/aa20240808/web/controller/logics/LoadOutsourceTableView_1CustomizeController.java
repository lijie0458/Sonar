package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E420ABE805861FC61B5498A37C236D6; 
import com.dogfood.aa20240808.service.logics.LoadOutsourceTableView_1CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOutsourceTableView_1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOutsourceTableView_1CustomizeController {

    @Autowired
    private LoadOutsourceTableView_1CustomizeService loadOutsourceTableView_1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "156e047d-e7bc-43aa-b71f-5c51b38c471d",rules = { })})
    @PostMapping("/api/lcplogics/loadOutsourceTableView_1")
    public ApiReturn<AnonymousStructure_9E420ABE805861FC61B5498A37C236D6> loadOutsourceTableView_1(@RequestBody LoadOutsourceTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOutsourceTableView_1CustomizeService.loadOutsourceTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getDataViewAuthority(), body.getTimeHorizon()));
    } 

}
