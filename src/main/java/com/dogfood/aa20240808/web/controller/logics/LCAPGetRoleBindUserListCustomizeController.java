package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LCAPGetRoleBindUserListCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetRoleBindUserListCustomizeControllerDto; 

@RestController
public class LCAPGetRoleBindUserListCustomizeController {

    @Autowired
    private LCAPGetRoleBindUserListCustomizeService lCAPGetRoleBindUserListCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "b52127a8a3924adbbde249442fac8983",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetRoleBindUserList")
    public ApiReturn<List<AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5>> lCAPGetRoleBindUserList(@RequestBody LCAPGetRoleBindUserListCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetRoleBindUserListCustomizeService.lCAPGetRoleBindUserList(body.getInputRoleId()));
    } 

}
