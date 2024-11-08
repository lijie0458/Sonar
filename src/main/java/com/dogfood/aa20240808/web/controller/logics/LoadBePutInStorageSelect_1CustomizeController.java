package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBePutInStorageSelect_1CustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadBePutInStorageSelect_1CustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadBePutInStorageSelect_1CustomizeController {

    @Autowired
    private LoadBePutInStorageSelect_1CustomizeService loadBePutInStorageSelect_1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "c4e24aac-07f1-4e93-bafc-73d9c2e9cbe5",rules = { })})
    @PostMapping("/api/lcplogics/loadBePutInStorageSelect_1")
    public ApiReturn<List<AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2>> loadBePutInStorageSelect_1(@RequestBody LoadBePutInStorageSelect_1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBePutInStorageSelect_1CustomizeService.loadBePutInStorageSelect_1(body.getPage(), body.getSize()));
    } 

}
