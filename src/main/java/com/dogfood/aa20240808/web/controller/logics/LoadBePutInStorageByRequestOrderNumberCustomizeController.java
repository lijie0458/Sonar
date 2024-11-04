package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadBePutInStorageByRequestOrderNumberCustomizeService; 
import com.dogfood.aa20240808.domain.structure.BePutInStorageStructureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBePutInStorageByRequestOrderNumberCustomizeControllerDto; 

@RestController
public class LoadBePutInStorageByRequestOrderNumberCustomizeController {

    @Autowired
    private LoadBePutInStorageByRequestOrderNumberCustomizeService loadBePutInStorageByRequestOrderNumberCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "c3a2c135-1138-4cb3-95b5-390a60913bfb",rules = { })})
    @PostMapping("/api/lcplogics/loadBePutInStorageByRequestOrderNumber")
    public ApiReturn<List<BePutInStorageStructureStructure>> loadBePutInStorageByRequestOrderNumber(@RequestBody LoadBePutInStorageByRequestOrderNumberCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBePutInStorageByRequestOrderNumberCustomizeService.loadBePutInStorageByRequestOrderNumber(body.getReceivingNotificationsId()));
    } 


}
