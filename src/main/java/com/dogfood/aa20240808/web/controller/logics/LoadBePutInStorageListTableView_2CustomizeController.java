package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadBePutInStorageListTableView_2CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBePutInStorageListTableView_2CustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C48E1CEBD9C524EDEF01D3202263DF78; 

@RestController
public class LoadBePutInStorageListTableView_2CustomizeController {

    @Autowired
    private LoadBePutInStorageListTableView_2CustomizeService loadBePutInStorageListTableView_2CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "22ae2107-011b-46e8-af05-05279f4fb7fb",rules = { })})
    @PostMapping("/api/lcplogics/loadBePutInStorageListTableView_2")
    public ApiReturn<AnonymousStructure_C48E1CEBD9C524EDEF01D3202263DF78> loadBePutInStorageListTableView_2(@RequestBody LoadBePutInStorageListTableView_2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBePutInStorageListTableView_2CustomizeService.loadBePutInStorageListTableView_2(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 

}
