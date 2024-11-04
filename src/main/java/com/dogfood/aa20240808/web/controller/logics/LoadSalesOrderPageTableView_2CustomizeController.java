package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadSalesOrderPageTableView_2CustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesOrderPageTableView_2CustomizeControllerDto; 
import com.dogfood.aa20240808.domain.structure.SaleOrderListStructure; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSalesOrderPageTableView_2CustomizeController {

    @Autowired
    private LoadSalesOrderPageTableView_2CustomizeService loadSalesOrderPageTableView_2CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "28ba14b8-c946-4218-83c6-dc45fb3c1451",rules = { }),@ValidationRuleGroup(value = "4fd3a239-71bb-4eeb-bc7f-090ff1c40989",rules = { }),@ValidationRuleGroup(value = "95c74118-e5fe-419c-b2c1-85694b56623c",rules = { })})
    @PostMapping("/api/lcplogics/loadSalesOrderPageTableView_2")
    public ApiReturn<List<SaleOrderListStructure>> loadSalesOrderPageTableView_2(@RequestBody LoadSalesOrderPageTableView_2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesOrderPageTableView_2CustomizeService.loadSalesOrderPageTableView_2(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getDistinctionEnum(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 


}
