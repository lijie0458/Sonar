package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSupplierTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadSupplierTableViewCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSupplierTableViewCustomizeController {

    @Autowired
    private LoadSupplierTableViewCustomizeService loadSupplierTableViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "43c858d5-9f36-46d4-949e-460f708f02e1",rules = { }),@ValidationRuleGroup(value = "37ed12e3559f43a7a4ea957f2d5cc8c0",rules = { })})
    @PostMapping("/api/lcplogics/loadSupplierTableView")
    public ApiReturn<AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4> loadSupplierTableView(@RequestBody LoadSupplierTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSupplierTableViewCustomizeService.loadSupplierTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder()));
    } 

}
