package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadSalesOrderPageDetailsSelect_12CustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesOrderPageDetailsSelect_12CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSalesOrderPageDetailsSelect_12CustomizeController {

    @Autowired
    private LoadSalesOrderPageDetailsSelect_12CustomizeService loadSalesOrderPageDetailsSelect_12CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "f1759d03-b4a0-49d8-8a60-aa7ad9ca5114",rules = { }),@ValidationRuleGroup(value = "10448ba3-7fd9-4598-8794-0a789fad5edf",rules = { }),@ValidationRuleGroup(value = "bb65f648-8b55-4ab7-b149-fe5786d519a8",rules = { }),@ValidationRuleGroup(value = "c94d3981-e658-46ee-8129-d5c4c4742ad7",rules = { })})
    @PostMapping("/api/lcplogics/loadSalesOrderPageDetailsSelect_12")
    public ApiReturn<List<AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1>> loadSalesOrderPageDetailsSelect_12(@RequestBody LoadSalesOrderPageDetailsSelect_12CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesOrderPageDetailsSelect_12CustomizeService.loadSalesOrderPageDetailsSelect_12(body.getPage(), body.getSize()));
    } 

}
