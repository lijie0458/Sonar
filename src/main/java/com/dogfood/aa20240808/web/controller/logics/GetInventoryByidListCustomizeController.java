package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetInventoryByidListCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.service.logics.GetInventoryByidListCustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetInventoryByidListCustomizeController {

    @Autowired
    private GetInventoryByidListCustomizeService getInventoryByidListCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "9f0a84a3a0ce47c38f3c91490468d1ba",rules = { }),@ValidationRuleGroup(value = "0fb26d26-7eb8-49c3-b4b9-aeb00ffa1533",rules = { }),@ValidationRuleGroup(value = "188f0630-b40c-49db-8d40-a0e46d2fb68b",rules = { }),@ValidationRuleGroup(value = "51793e3a8aa04d25b498fb3f253888aa",rules = { }),@ValidationRuleGroup(value = "d2f07ad2-8b18-4ef0-a9d9-6c553874be28",rules = { }),@ValidationRuleGroup(value = "9f1e85ae-b86b-40f5-93b1-80af7eb5751d",rules = { })})
    @PostMapping("/api/lcplogics/getInventoryByidList")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B> getInventoryByidList(@RequestBody GetInventoryByidListCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getInventoryByidListCustomizeService.getInventoryByidList(body.getIdList()));
    } 


}
