package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0; 
import com.dogfood.aa20240808.service.logics.LoadWarehouseSelectLCAPUserCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehouseSelectLCAPUserCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadWarehouseSelectLCAPUserCustomizeController {

    @Autowired
    private LoadWarehouseSelectLCAPUserCustomizeService loadWarehouseSelectLCAPUserCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "e4fa8aee-ebcf-4eba-88d4-8fc1781a4389",rules = { }),@ValidationRuleGroup(value = "e6a711ba-9b08-431e-93b3-ab0a3f365ac2",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehouseSelectLCAPUser")
    public ApiReturn<List<AnonymousStructure_47C167E7217746A55100F50A57F637C0>> loadWarehouseSelectLCAPUser(@RequestBody LoadWarehouseSelectLCAPUserCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehouseSelectLCAPUserCustomizeService.loadWarehouseSelectLCAPUser(body.getPage(), body.getSize()));
    } 

}
