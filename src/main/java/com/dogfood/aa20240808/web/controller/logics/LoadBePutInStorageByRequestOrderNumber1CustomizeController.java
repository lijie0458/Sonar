package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBePutInStorageByRequestOrderNumber1CustomizeControllerDto; 
import com.dogfood.aa20240808.domain.structure.BePutInStorageStructureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadBePutInStorageByRequestOrderNumber1CustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadBePutInStorageByRequestOrderNumber1CustomizeController {

    @Autowired
    private LoadBePutInStorageByRequestOrderNumber1CustomizeService loadBePutInStorageByRequestOrderNumber1CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "101fadcd5f114a3195b74ca209a83938",rules = { })})
    @PostMapping("/api/lcplogics/loadBePutInStorageByRequestOrderNumber1")
    public ApiReturn<List<BePutInStorageStructureStructure>> loadBePutInStorageByRequestOrderNumber1(@RequestBody LoadBePutInStorageByRequestOrderNumber1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBePutInStorageByRequestOrderNumber1CustomizeService.loadBePutInStorageByRequestOrderNumber1(body.getBePutInStorageld()));
    } 


}
