package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseTableView1CustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehouseTableView1CustomizeControllerDto; 

@RestController
public class LoadWarehouseTableView1CustomizeController {

    @Autowired
    private LoadWarehouseTableView1CustomizeService loadWarehouseTableView1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "7c4c21bf-05fd-4981-921e-57317aa69e90",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehouseTableView1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7EAF13B320E1A0EF4BB5A07F9CC98D84> loadWarehouseTableView1(@RequestBody LoadWarehouseTableView1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehouseTableView1CustomizeService.loadWarehouseTableView1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
