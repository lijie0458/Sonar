package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetUserAndRoleByuserNameCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetUserAndRoleByuserNameCustomizeControllerDto; 

@RestController
public class GetUserAndRoleByuserNameCustomizeController {

    @Autowired
    private GetUserAndRoleByuserNameCustomizeService getUserAndRoleByuserNameCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "9def06478dcb4138a0375c08ae55970e",rules = { })})
    @PostMapping("/api/lcplogics/getUserAndRoleByuserName")
    public ApiReturn<AnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625> getUserAndRoleByuserName(@RequestBody GetUserAndRoleByuserNameCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getUserAndRoleByuserNameCustomizeService.getUserAndRoleByuserName(body.getUserName()));
    } 

}
