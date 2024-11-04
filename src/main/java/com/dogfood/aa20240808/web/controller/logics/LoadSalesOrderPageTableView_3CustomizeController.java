package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.SaleOrderListStructure; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesOrderPageTableView_3CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadSalesOrderPageTableView_3CustomizeService; 

@RestController
public class LoadSalesOrderPageTableView_3CustomizeController {

    @Autowired
    private LoadSalesOrderPageTableView_3CustomizeService loadSalesOrderPageTableView_3CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "0bad54ad-7234-4863-ae80-27aa33f57525",rules = { })})
    @PostMapping("/api/lcplogics/loadSalesOrderPageTableView_3")
    public ApiReturn<List<SaleOrderListStructure>> loadSalesOrderPageTableView_3(@RequestBody LoadSalesOrderPageTableView_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesOrderPageTableView_3CustomizeService.loadSalesOrderPageTableView_3(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getDistinctionEnum(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 


}
