package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LCAPLoadDeptAddUserSelectCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPLoadDeptAddUserSelectCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPLoadDeptAddUserSelectCustomizeController {

    @Autowired
    private LCAPLoadDeptAddUserSelectCustomizeService lCAPLoadDeptAddUserSelectCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "bd4737d154a24ec5afbb3c55efcf030d",rules = { })})
    @PostMapping("/api/lcplogics/LCAPLoadDeptAddUserSelect")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E> lCAPLoadDeptAddUserSelect(@RequestBody LCAPLoadDeptAddUserSelectCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPLoadDeptAddUserSelectCustomizeService.lCAPLoadDeptAddUserSelect(body.getPage(), body.getSize(), body.getDeptId(), body.getSearch()));
    } 


}
