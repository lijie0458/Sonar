package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadProductionPageTableView_1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductionPageTableView_1CustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductionPageTableView_1CustomizeController {

    @Autowired
    private LoadProductionPageTableView_1CustomizeService loadProductionPageTableView_1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "26def5d8-e8ab-4cfa-bb2e-895fc01750ea",rules = { }),@ValidationRuleGroup(value = "8e217e9a-f439-446b-911d-fd948402cba0",rules = { }),@ValidationRuleGroup(value = "07fcb281-5a84-46fd-88b7-b1c64f353009",rules = { }),@ValidationRuleGroup(value = "da7ad6f6-66fe-4548-b8bb-6e2fa715ec5b",rules = { }),@ValidationRuleGroup(value = "66e2e6eb-9234-44cb-be2a-b25155b76362",rules = { }),@ValidationRuleGroup(value = "2e73be89-c6ca-4443-a0ef-039f0a53b1b0",rules = { })})
    @PostMapping("/api/lcplogics/loadProductionPageTableView_1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70E8AA8AF66CC8BFB9F26E5BE1360EC7> loadProductionPageTableView_1(@RequestBody LoadProductionPageTableView_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductionPageTableView_1CustomizeService.loadProductionPageTableView_1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getDistinctionEnum(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 


}
