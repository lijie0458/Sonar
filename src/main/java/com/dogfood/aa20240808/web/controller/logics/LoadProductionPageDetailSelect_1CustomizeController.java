package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductionPageDetailSelect_1CustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadProductionPageDetailSelect_1CustomizeService; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductionPageDetailSelect_1CustomizeController {

    @Autowired
    private LoadProductionPageDetailSelect_1CustomizeService loadProductionPageDetailSelect_1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "2f13065c-e358-48de-95f2-039a204a0d02",rules = { }),@ValidationRuleGroup(value = "0b983636-02d4-47f0-b410-9bc30a0ed8cf",rules = { }),@ValidationRuleGroup(value = "cbbf9465-0eac-48cc-8770-4f768526809f",rules = { }),@ValidationRuleGroup(value = "9ea84b50-c096-46b0-9edb-8d986e0f609b",rules = { }),@ValidationRuleGroup(value = "9280a901-7c7e-4cd7-81ad-a480a3f0f282",rules = { }),@ValidationRuleGroup(value = "eee8662a-35e6-4545-b511-a861a57f9af5",rules = { })})
    @PostMapping("/api/lcplogics/loadProductionPageDetailSelect_1")
    public ApiReturn<List<AnonymousStructure_3421ED028B001C489CD794910A15D0C0>> loadProductionPageDetailSelect_1(@RequestBody LoadProductionPageDetailSelect_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductionPageDetailSelect_1CustomizeService.loadProductionPageDetailSelect_1(body.getPage(), body.getSize()));
    } 

}
