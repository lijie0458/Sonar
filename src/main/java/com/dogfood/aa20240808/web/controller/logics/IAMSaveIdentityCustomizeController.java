package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.IAMSaveIdentityCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.SaveIdentitySourceResultStructure; 
import com.dogfood.aa20240808.web.controller.logics.dto.IAMSaveIdentityCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class IAMSaveIdentityCustomizeController {

    @Autowired
    private IAMSaveIdentityCustomizeService iAMSaveIdentityCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "bda6a0ab-894e-4322-bdfd-a1118a036d98",rules = { }),@ValidationRuleGroup(value = "0ee24520-e39f-4e80-865f-27f1a7236e39",rules = { }),@ValidationRuleGroup(value = "d1821356-0586-4d7d-92dc-2724cc8e1d36",rules = { }),@ValidationRuleGroup(value = "71bb980c-7b56-4992-9a66-2e10c13a8404",rules = { }),@ValidationRuleGroup(value = "fbb18c05-8090-461a-99c5-0ec96d98b4f9",rules = { }),@ValidationRuleGroup(value = "0009cc43-1bf3-4a4c-b579-8b0e39c8fcef",rules = { }),@ValidationRuleGroup(value = "ea9f3954-f6b7-42d4-90ec-41713cea19ec",rules = { }),@ValidationRuleGroup(value = "7fcb7e80-d691-4aad-9498-91c0e095f661",rules = { })})
    @PostMapping("/api/lcplogics/IAMSaveIdentity")
    public ApiReturn<SaveIdentitySourceResultStructure> iAMSaveIdentity(@RequestBody IAMSaveIdentityCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(iAMSaveIdentityCustomizeService.iAMSaveIdentity(body.getSourceDto()));
    } 

}
