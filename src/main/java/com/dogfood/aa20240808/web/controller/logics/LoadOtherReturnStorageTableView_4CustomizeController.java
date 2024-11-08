package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadOtherReturnStorageTableView_4CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E3C613168060E6F1BC082A6B8E2A4D59; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadOtherReturnStorageTableView_4CustomizeService; 

@RestController
public class LoadOtherReturnStorageTableView_4CustomizeController {

    @Autowired
    private LoadOtherReturnStorageTableView_4CustomizeService loadOtherReturnStorageTableView_4CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "0fa16aa6-9be1-40db-af2d-b621c86d023c",rules = { })})
    @PostMapping("/api/lcplogics/loadOtherReturnStorageTableView_4")
    public ApiReturn<AnonymousStructure_E3C613168060E6F1BC082A6B8E2A4D59> loadOtherReturnStorageTableView_4(@RequestBody LoadOtherReturnStorageTableView_4CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadOtherReturnStorageTableView_4CustomizeService.loadOtherReturnStorageTableView_4(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getFilter1(), body.getDataViewAuthority(), body.getTimeHorizon()));
    } 

}
