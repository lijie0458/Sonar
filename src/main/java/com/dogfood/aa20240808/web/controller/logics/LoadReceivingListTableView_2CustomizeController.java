package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.ReceivingDetailsStructureStructure; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadReceivingListTableView_2CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadReceivingListTableView_2CustomizeService; 

@RestController
public class LoadReceivingListTableView_2CustomizeController {

    @Autowired
    private LoadReceivingListTableView_2CustomizeService loadReceivingListTableView_2CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "9969cc7fd38c449bb5e2826391b32a7e",rules = { })})
    @PostMapping("/api/lcplogics/loadReceivingListTableView_2")
    public ApiReturn<List<ReceivingDetailsStructureStructure>> loadReceivingListTableView_2(@RequestBody LoadReceivingListTableView_2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadReceivingListTableView_2CustomizeService.loadReceivingListTableView_2(body.getFilter(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 


}
