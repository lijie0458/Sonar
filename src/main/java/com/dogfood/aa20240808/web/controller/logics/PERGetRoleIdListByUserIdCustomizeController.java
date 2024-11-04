package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERGetRoleIdListByUserIdCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.PERGetRoleIdListByUserIdCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERGetRoleIdListByUserIdCustomizeController {

    @Autowired
    private PERGetRoleIdListByUserIdCustomizeService pERGetRoleIdListByUserIdCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "0b912c0e-9c0e-443f-b496-716ca431495b",rules = { })})
    @PostMapping("/api/lcplogics/PERGetRoleIdListByUserId")
    public ApiReturn<List<Long>> pERGetRoleIdListByUserId(@RequestBody PERGetRoleIdListByUserIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERGetRoleIdListByUserIdCustomizeService.pERGetRoleIdListByUserId(body.getUserId()));
    } 


}
