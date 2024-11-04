package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPSearchDeptsCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LCAPSearchDeptsCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPSearchDeptsCustomizeController {

    @Autowired
    private LCAPSearchDeptsCustomizeService lCAPSearchDeptsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "11b57f989a0c433d9961b26c24cd1141",rules = { })})
    @PostMapping("/api/lcplogics/LCAPSearchDepts")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C> lCAPSearchDepts(@RequestBody LCAPSearchDeptsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPSearchDeptsCustomizeService.lCAPSearchDepts(body.getName()));
    } 


}
