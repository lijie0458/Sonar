package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadOutsourceReturnStorageTableView_3CustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOutsourceReturnStorageTableView_3CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadOutsourceReturnStorageTableView_3CustomizeController {

    @Autowired
    private LoadOutsourceReturnStorageTableView_3CustomizeService loadOutsourceReturnStorageTableView_3CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "b9dd719e-86ed-4ff9-a0e0-ee9715f14d3a",rules = { })})
    @PostMapping("/api/lcplogics/loadOutsourceReturnStorageTableView_3")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DD4127D4DB76AEA03402A960EB860F04> loadOutsourceReturnStorageTableView_3(@RequestBody LoadOutsourceReturnStorageTableView_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOutsourceReturnStorageTableView_3CustomizeService.loadOutsourceReturnStorageTableView_3(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getFilter1(), body.getDataViewAuthority(), body.getTimeHorizon()));
    } 


}
