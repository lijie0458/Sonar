package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadSalesOrderPageSelect_13DepartmentCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadSalesOrderPageSelect_13DepartmentCustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadSalesOrderPageSelect_13DepartmentCustomizeController {

    @Autowired
    private LoadSalesOrderPageSelect_13DepartmentCustomizeService loadSalesOrderPageSelect_13DepartmentCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "43a6c18b-01ce-4854-9450-126b99fc065a",rules = { }),@ValidationRuleGroup(value = "feb13b6d-9f85-4685-8e2b-051f45db110d",rules = { }),@ValidationRuleGroup(value = "d6995b83-3593-45ca-b7ad-35786713bc57",rules = { }),@ValidationRuleGroup(value = "c21155de-9d0a-42fe-b12f-9d15bd002163",rules = { }),@ValidationRuleGroup(value = "6924a0a8-56c0-4d8e-ade8-54c56e13835d",rules = { })})
    @PostMapping("/api/lcplogics/loadSalesOrderPageSelect_13Department")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0>> loadSalesOrderPageSelect_13Department(@RequestBody LoadSalesOrderPageSelect_13DepartmentCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadSalesOrderPageSelect_13DepartmentCustomizeService.loadSalesOrderPageSelect_13Department(body.getPage(), body.getSize()));
    } 


}
