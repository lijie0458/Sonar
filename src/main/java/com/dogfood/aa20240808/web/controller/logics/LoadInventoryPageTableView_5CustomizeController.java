package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadInventoryPageTableView_5CustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadInventoryPageTableView_5CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadInventoryPageTableView_5CustomizeController {

    @Autowired
    private LoadInventoryPageTableView_5CustomizeService loadInventoryPageTableView_5CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "9461e7af3853498c852b13204b6f069e",rules = { })})
    @PostMapping("/api/lcplogics/loadInventoryPageTableView_5")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0DA40FB2FE2E7045207FC997F338F109> loadInventoryPageTableView_5(@RequestBody LoadInventoryPageTableView_5CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadInventoryPageTableView_5CustomizeService.loadInventoryPageTableView_5(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
