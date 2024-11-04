package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadMaterialTableView1CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadMaterialTableView1CustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadMaterialTableView1CustomizeController {

    @Autowired
    private LoadMaterialTableView1CustomizeService loadMaterialTableView1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3294e7b8-291a-4c00-b23d-76ebf9afaab1",rules = { }),@ValidationRuleGroup(value = "6dd07c26-8379-42d0-8195-90602776424d",rules = { }),@ValidationRuleGroup(value = "0532ccdc-ad9b-4c36-9cca-c57103d94abb",rules = { }),@ValidationRuleGroup(value = "c6c9aacc-c62a-4d12-80a2-ebec7f074bf2",rules = { }),@ValidationRuleGroup(value = "1006e6d7-8332-4f35-87f9-8420a5985118",rules = { }),@ValidationRuleGroup(value = "7d06747e-07d0-43b2-99a8-1785b9820314",rules = { }),@ValidationRuleGroup(value = "4c5e75ae-74bd-4f9f-8ca8-16dbe98d0472",rules = { }),@ValidationRuleGroup(value = "40da81c0-9c94-4ab2-b894-9b459055dd12",rules = { }),@ValidationRuleGroup(value = "ca7bff66-b4cb-4488-bee3-6c48a2424a72",rules = { }),@ValidationRuleGroup(value = "5f18372a-97d5-42b9-8916-28f77a42106d",rules = { }),@ValidationRuleGroup(value = "d6b10c25-3ba1-4d39-8bf7-ea66758736ba",rules = { }),@ValidationRuleGroup(value = "9894d127-12ef-4227-b3f2-0f1f13c97048",rules = { }),@ValidationRuleGroup(value = "898c9c3c-7e36-45e4-b57d-631e633a906a",rules = { })})
    @PostMapping("/api/lcplogics/loadMaterialTableView1")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_683439DE5EBB64E86D9B7E9441427D1E> loadMaterialTableView1(@RequestBody LoadMaterialTableView1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadMaterialTableView1CustomizeService.loadMaterialTableView1(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getMaterialId()));
    } 


}
