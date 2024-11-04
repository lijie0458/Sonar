package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesOrderPageSelect_11CustomerManagementCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.LoadSalesOrderPageSelect_11CustomerManagementCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSalesOrderPageSelect_11CustomerManagementCustomizeController {

    @Autowired
    private LoadSalesOrderPageSelect_11CustomerManagementCustomizeService loadSalesOrderPageSelect_11CustomerManagementCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "e10bf240-a471-499e-b062-d2de390749e8",rules = { }),@ValidationRuleGroup(value = "bb3ef0c8-aa47-41c9-91aa-b5197132831c",rules = { }),@ValidationRuleGroup(value = "922d2952-812c-4e05-93f2-0af2bb0a2da4",rules = { }),@ValidationRuleGroup(value = "a534a92a-2c31-418a-bccd-aa7e325e47d9",rules = { }),@ValidationRuleGroup(value = "8caa2289-8c9c-447f-8a5b-cb7197b90887",rules = { })})
    @PostMapping("/api/lcplogics/loadSalesOrderPageSelect_11CustomerManagement")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1>> loadSalesOrderPageSelect_11CustomerManagement(@RequestBody LoadSalesOrderPageSelect_11CustomerManagementCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesOrderPageSelect_11CustomerManagementCustomizeService.loadSalesOrderPageSelect_11CustomerManagement(body.getPage(), body.getSize()));
    } 


}
