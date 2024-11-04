package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadSalesOrderPageSelect_12LCAPUserCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesOrderPageSelect_12LCAPUserCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSalesOrderPageSelect_12LCAPUserCustomizeController {

    @Autowired
    private LoadSalesOrderPageSelect_12LCAPUserCustomizeService loadSalesOrderPageSelect_12LCAPUserCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c914af73-a2b2-4f74-8b3f-3afe0543429c",rules = { }),@ValidationRuleGroup(value = "3e909a31-c761-4dce-9b95-e8e02c0bbc7b",rules = { }),@ValidationRuleGroup(value = "e9f76b1a-7a95-402d-b58e-5431bcbc9ae4",rules = { }),@ValidationRuleGroup(value = "6d6f0b15-b649-4170-b853-addd9ed0cf3d",rules = { }),@ValidationRuleGroup(value = "2fdbf1c6-9e2d-4406-ada7-c20a9723abf2",rules = { })})
    @PostMapping("/api/lcplogics/loadSalesOrderPageSelect_12LCAPUser")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0>> loadSalesOrderPageSelect_12LCAPUser(@RequestBody LoadSalesOrderPageSelect_12LCAPUserCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesOrderPageSelect_12LCAPUserCustomizeService.loadSalesOrderPageSelect_12LCAPUser(body.getPage(), body.getSize()));
    } 


}
