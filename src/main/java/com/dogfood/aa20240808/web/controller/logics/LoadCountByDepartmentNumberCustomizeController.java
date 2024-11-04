package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadCountByDepartmentNumberCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadCountByDepartmentNumberCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountByDepartmentNumberCustomizeController {

    @Autowired
    private LoadCountByDepartmentNumberCustomizeService loadCountByDepartmentNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "b58a0df0-412b-4dee-a79a-a71cc63a69ca",rules = { }),@ValidationRuleGroup(value = "e0ef6e7ec8634aa99245a4a80758fd6c",rules = { }),@ValidationRuleGroup(value = "a0287228-f5cb-4bce-a929-3e73b35bf4d2",rules = { })})
    @PostMapping("/api/lcplogics/loadCountByDepartmentNumber")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9FE930414F5E9743D02790CBA595E403> loadCountByDepartmentNumber(@RequestBody LoadCountByDepartmentNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadCountByDepartmentNumberCustomizeService.loadCountByDepartmentNumber(body.getParam1()));
    } 


}
