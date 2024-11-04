package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeController {

    @Autowired
    private LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeService loadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3876e16a-efe2-4cc0-85dd-ffd9bfe8078b",rules = { })})
    @PostMapping("/api/lcplogics/loadBePutInStorageListSelect_3Warehouse_levelTwo")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3> loadBePutInStorageListSelect_3Warehouse_levelTwo(@RequestBody LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeService.loadBePutInStorageListSelect_3Warehouse_levelTwo(body.getPage(), body.getSize()));
    } 


}
