package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPLoadResourceTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LCAPLoadResourceTableViewCustomizeService; 

@RestController
public class LCAPLoadResourceTableViewCustomizeController {

    @Autowired
    private LCAPLoadResourceTableViewCustomizeService lCAPLoadResourceTableViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "8c00beb7044c4385a10aa292bffa05a4",rules = { })})
    @PostMapping("/api/lcplogics/LCAPLoadResourceTableView")
    public ApiReturn<AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92> lCAPLoadResourceTableView(@RequestBody LCAPLoadResourceTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPLoadResourceTableViewCustomizeService.lCAPLoadResourceTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder()));
    } 

}
