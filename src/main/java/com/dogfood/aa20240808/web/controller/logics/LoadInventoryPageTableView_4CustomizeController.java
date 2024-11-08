package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadInventoryPageTableView_4CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadInventoryPageTableView_4CustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_503318C7290063AC40A854F703B69D2C; 

@RestController
public class LoadInventoryPageTableView_4CustomizeController {

    @Autowired
    private LoadInventoryPageTableView_4CustomizeService loadInventoryPageTableView_4CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "1efe4f73-dd43-4173-b7ea-0b2ab28dc42c",rules = { })})
    @PostMapping("/api/lcplogics/loadInventoryPageTableView_4")
    public ApiReturn<AnonymousStructure_503318C7290063AC40A854F703B69D2C> loadInventoryPageTableView_4(@RequestBody LoadInventoryPageTableView_4CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadInventoryPageTableView_4CustomizeService.loadInventoryPageTableView_4(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 

}
