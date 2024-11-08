package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.DeletedepartmentCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.DeletedepartmentCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class DeletedepartmentCustomizeController {

    @Autowired
    private DeletedepartmentCustomizeService deletedepartmentCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "102301102d764161bb2dc63966b1ff0d",rules = { })})
    @PostMapping("/api/lcplogics/deletedepartment")
    public ApiReturn<AnonymousStructure_31A02440DB0E34FD453392B198B85190> deletedepartment(@RequestBody DeletedepartmentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(deletedepartmentCustomizeService.deletedepartment(body.getParam1()));
    } 

}
