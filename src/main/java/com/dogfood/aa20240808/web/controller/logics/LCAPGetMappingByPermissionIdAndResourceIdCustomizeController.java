package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LCAPGetMappingByPermissionIdAndResourceIdCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetMappingByPermissionIdAndResourceIdCustomizeControllerDto; 

@RestController
public class LCAPGetMappingByPermissionIdAndResourceIdCustomizeController {

    @Autowired
    private LCAPGetMappingByPermissionIdAndResourceIdCustomizeService lCAPGetMappingByPermissionIdAndResourceIdCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "d4c1ffaccc1142c4ad518805454b1e51",rules = { }),@ValidationRuleGroup(value = "14a472301cc54dfca9187d75272bb9fa",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetMappingByPermissionIdAndResourceId")
    public ApiReturn<List<Long>> lCAPGetMappingByPermissionIdAndResourceId(@RequestBody LCAPGetMappingByPermissionIdAndResourceIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetMappingByPermissionIdAndResourceIdCustomizeService.lCAPGetMappingByPermissionIdAndResourceId(body.getPermissionId(), body.getResourceId()));
    } 


}
