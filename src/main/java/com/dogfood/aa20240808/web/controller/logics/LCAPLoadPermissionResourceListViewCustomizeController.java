package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LCAPLoadPermissionResourceListViewCustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPLoadPermissionResourceListViewCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPLoadPermissionResourceListViewCustomizeController {

    @Autowired
    private LCAPLoadPermissionResourceListViewCustomizeService lCAPLoadPermissionResourceListViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "5abb2be265c5485696cc32a43e9ba987",rules = { })})
    @PostMapping("/api/lcplogics/LCAPLoadPermissionResourceListView")
    public ApiReturn<AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92> lCAPLoadPermissionResourceListView(@RequestBody LCAPLoadPermissionResourceListViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPLoadPermissionResourceListViewCustomizeService.lCAPLoadPermissionResourceListView(body.getPage(), body.getSize()));
    } 

}
