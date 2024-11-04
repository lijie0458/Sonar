package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadProductReturnStorageTableView_3CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductReturnStorageTableView_3CustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductReturnStorageTableView_3CustomizeController {

    @Autowired
    private LoadProductReturnStorageTableView_3CustomizeService loadProductReturnStorageTableView_3CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "f593b0bc-41b8-437c-80e3-d5cc38a7c11d",rules = { })})
    @PostMapping("/api/lcplogics/loadProductReturnStorageTableView_3")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_67EFB6835A3600D46279CAD6399BC435> loadProductReturnStorageTableView_3(@RequestBody LoadProductReturnStorageTableView_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductReturnStorageTableView_3CustomizeService.loadProductReturnStorageTableView_3(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getFilter1(), body.getDataViewAuthority(), body.getTimeHorizon()));
    } 


}
