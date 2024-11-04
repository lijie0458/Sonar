package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadMaterialTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadMaterialTableViewCustomizeService; 

@RestController
public class LoadMaterialTableViewCustomizeController {

    @Autowired
    private LoadMaterialTableViewCustomizeService loadMaterialTableViewCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "f3f7f013-1568-409a-92e3-107274946175",rules = { }),@ValidationRuleGroup(value = "4f0c9ff6-9608-4d37-8e8c-e3a457f719b0",rules = { }),@ValidationRuleGroup(value = "d6802d52-81e5-467c-bf85-72705ccc4521",rules = { }),@ValidationRuleGroup(value = "ff1a3ecb-863e-4a59-ac5f-2e7500dc7b86",rules = { }),@ValidationRuleGroup(value = "9777e006-1b02-424a-9e35-d1196317f2dd",rules = { }),@ValidationRuleGroup(value = "b801c811-dbad-45e7-b991-36b1237d1c60",rules = { }),@ValidationRuleGroup(value = "c9dc2c1a-87a9-455d-85d8-491ff83ba08e",rules = { }),@ValidationRuleGroup(value = "5bd39322-6672-468e-a50f-4aed465ce7fd",rules = { }),@ValidationRuleGroup(value = "2466ac45-839d-45ca-ada5-c5b3ae53a9f4",rules = { }),@ValidationRuleGroup(value = "60091e5f480c461794d401f2490d747c",rules = { }),@ValidationRuleGroup(value = "b74c93ad-0a91-4683-aaa3-e6e9c80a8348",rules = { }),@ValidationRuleGroup(value = "7d082e2b-2f15-4f25-a3d0-fbffd9ff6f42",rules = { }),@ValidationRuleGroup(value = "17792439-76a6-44d2-ab04-6ea4319a8c59",rules = { })})
    @PostMapping("/api/lcplogics/loadMaterialTableView")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C> loadMaterialTableView(@RequestBody LoadMaterialTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadMaterialTableViewCustomizeService.loadMaterialTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 


}
