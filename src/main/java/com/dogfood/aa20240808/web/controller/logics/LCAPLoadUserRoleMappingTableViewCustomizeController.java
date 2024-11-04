package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LCAPLoadUserRoleMappingTableViewCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPLoadUserRoleMappingTableViewCustomizeControllerDto; 

@RestController
public class LCAPLoadUserRoleMappingTableViewCustomizeController {

    @Autowired
    private LCAPLoadUserRoleMappingTableViewCustomizeService lCAPLoadUserRoleMappingTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "1564ff5e9c6449e98669fb25cd3e8edf",rules = { })})
    @PostMapping("/api/lcplogics/LCAPLoadUserRoleMappingTableView")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A43B95DDE943F37E89AA74CCF8732C90> lCAPLoadUserRoleMappingTableView(@RequestBody LCAPLoadUserRoleMappingTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPLoadUserRoleMappingTableViewCustomizeService.lCAPLoadUserRoleMappingTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
