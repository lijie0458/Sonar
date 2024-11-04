package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.ResponseResultStructure; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.IAMAccountBindOrUnBindCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMAccountBindOrUnBindCustomizeControllerDto; 

@RestController
public class IAMAccountBindOrUnBindCustomizeController {

    @Autowired
    private IAMAccountBindOrUnBindCustomizeService iAMAccountBindOrUnBindCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "e78eeb0a-2d57-4d63-844e-60b7cbf00be9",rules = { }),@ValidationRuleGroup(value = "26ea5c14-1979-4bb6-9352-4d30969ff1a3",rules = { }),@ValidationRuleGroup(value = "c2ce6f81-010e-456e-98c8-768f89aabe01",rules = { })})
    @PostMapping("/api/lcplogics/IAMAccountBindOrUnBind")
    public ApiReturn<ResponseResultStructure> iAMAccountBindOrUnBind(@RequestBody IAMAccountBindOrUnBindCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMAccountBindOrUnBindCustomizeService.iAMAccountBindOrUnBind(body.getUserName(), body.getPassword(), body.getOpenId(), body.getName(), body.getIdentitySourceId(), body.getHasAccount(), body.getBindOrUnbind(), body.getPasswordConfirm(), body.getIsFromUserCenter()));
    } 


}
