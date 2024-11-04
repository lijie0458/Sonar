package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadProductionPageDetailSelect_21CustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadProductionPageDetailSelect_21CustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadProductionPageDetailSelect_21CustomizeController {

    @Autowired
    private LoadProductionPageDetailSelect_21CustomizeService loadProductionPageDetailSelect_21CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "1efce9dc-c4a0-4beb-b926-9db32ed7c416",rules = { }),@ValidationRuleGroup(value = "b6825405-cd0d-4789-9d6b-e6b58376d05a",rules = { }),@ValidationRuleGroup(value = "331e5c2d-a09d-48ba-b55f-c377672cc15c",rules = { }),@ValidationRuleGroup(value = "66a41f7e-c891-4475-9790-219f06237519",rules = { }),@ValidationRuleGroup(value = "1f177a41-81be-4b77-aea4-3722718ce36a",rules = { }),@ValidationRuleGroup(value = "f3d03024-f14c-48ad-b3e6-67bb8a689876",rules = { }),@ValidationRuleGroup(value = "c25e7c04-6502-4c95-8721-88f7ff227026",rules = { }),@ValidationRuleGroup(value = "173f8151-d150-491b-a809-88bca1d0cc34",rules = { })})
    @PostMapping("/api/lcplogics/loadProductionPageDetailSelect_21")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0>> loadProductionPageDetailSelect_21(@RequestBody LoadProductionPageDetailSelect_21CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadProductionPageDetailSelect_21CustomizeService.loadProductionPageDetailSelect_21(body.getPage(), body.getSize()));
    } 


}
