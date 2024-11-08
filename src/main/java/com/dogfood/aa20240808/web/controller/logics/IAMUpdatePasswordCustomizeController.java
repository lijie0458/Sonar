package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.ResponseResultStructure; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.IAMUpdatePasswordCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMUpdatePasswordCustomizeControllerDto; 

@RestController
public class IAMUpdatePasswordCustomizeController {

    @Autowired
    private IAMUpdatePasswordCustomizeService iAMUpdatePasswordCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "53215abe-9d42-423d-a9b5-0849d5cf5f8c",rules = { }),@ValidationRuleGroup(value = "1657b660-eda6-407c-9c94-a84def7485d6",rules = { })})
    @PostMapping("/api/lcplogics/IAMUpdatePassword")
    public ApiReturn<ResponseResultStructure> iAMUpdatePassword(@RequestBody IAMUpdatePasswordCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMUpdatePasswordCustomizeService.iAMUpdatePassword(body.getOldPwd(), body.getNewPwd(), body.getConfirmNewPwd(), body.getUserId()));
    } 

}
