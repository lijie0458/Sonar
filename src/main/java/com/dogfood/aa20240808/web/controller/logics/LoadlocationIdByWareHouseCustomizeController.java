package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.service.logics.LoadlocationIdByWareHouseCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadlocationIdByWareHouseCustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadlocationIdByWareHouseCustomizeController {

    @Autowired
    private LoadlocationIdByWareHouseCustomizeService loadlocationIdByWareHouseCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "b3d8961b-085c-46a3-b3e4-41cfc85edc03",rules = { @ValidationRule(value = "required",targetName = "body.id",argvs = "",errorMsg = "")})})
    @PostMapping("/api/lcplogics/loadlocationIdByWareHouse")
    public ApiReturn<Long> loadlocationIdByWareHouse(@RequestBody LoadlocationIdByWareHouseCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadlocationIdByWareHouseCustomizeService.loadlocationIdByWareHouse(body.getId()));
    } 


}
