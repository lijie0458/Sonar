package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSupplierTableView1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadSupplierTableView1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSupplierTableView1CustomizeController {

    @Autowired
    private LoadSupplierTableView1CustomizeService loadSupplierTableView1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "48b4da5e-2035-4ef0-9b9a-b746af244965",rules = { })})
    @PostMapping("/api/lcplogics/loadSupplierTableView1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_408B350FFFE2F80F289FABE4F7451137> loadSupplierTableView1(@RequestBody LoadSupplierTableView1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSupplierTableView1CustomizeService.loadSupplierTableView1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getSupplierId()));
    } 


}
