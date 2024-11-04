package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.IAMLoadAccountBindDataCustomizeService; 
import com.dogfood.aa20240808.domain.structure.AccountBindStructureStructure; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMLoadAccountBindDataCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMLoadAccountBindDataCustomizeController {

    @Autowired
    private IAMLoadAccountBindDataCustomizeService iAMLoadAccountBindDataCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "4921085d-5bf3-4a69-b885-82df3db91f4c",rules = { }),@ValidationRuleGroup(value = "f622d2f3-c328-44ef-aa26-07f1784a4705",rules = { })})
    @PostMapping("/api/lcplogics/IAMLoadAccountBindData")
    public ApiReturn<List<AccountBindStructureStructure>> iAMLoadAccountBindData(@RequestBody IAMLoadAccountBindDataCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMLoadAccountBindDataCustomizeService.iAMLoadAccountBindData(body.getUserId()));
    } 


}
