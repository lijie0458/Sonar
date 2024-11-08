package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERGetUserListByRoleIdCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.PERGetUserListByRoleIdCustomizeService; 

@RestController
public class PERGetUserListByRoleIdCustomizeController {

    @Autowired
    private PERGetUserListByRoleIdCustomizeService pERGetUserListByRoleIdCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "b16ed669-5d39-4b85-ad95-312187de78a4",rules = { })})
    @PostMapping("/api/lcplogics/PERGetUserListByRoleId")
    public ApiReturn<List<AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B>> pERGetUserListByRoleId(@RequestBody PERGetUserListByRoleIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERGetUserListByRoleIdCustomizeService.pERGetUserListByRoleId(body.getRoleId()));
    } 

}
