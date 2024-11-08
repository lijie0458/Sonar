package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadWarehousingTableView_1CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehousingTableView_1CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_45571C3EF8A82D2F17998324EAA71AAD; 

@RestController
public class LoadWarehousingTableView_1CustomizeController {

    @Autowired
    private LoadWarehousingTableView_1CustomizeService loadWarehousingTableView_1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "89eae57b9d3f4f8599890449ac7c7c6e",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehousingTableView_1")
    public ApiReturn<AnonymousStructure_45571C3EF8A82D2F17998324EAA71AAD> loadWarehousingTableView_1(@RequestBody LoadWarehousingTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehousingTableView_1CustomizeService.loadWarehousingTableView_1(body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getPage(), body.getDataViewAuthority(), body.getTimeHorizon()));
    } 

}
