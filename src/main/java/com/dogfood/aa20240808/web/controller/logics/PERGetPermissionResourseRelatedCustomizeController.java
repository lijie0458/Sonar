package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.PERGetPermissionResourseRelatedCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.LCAPPermissionAndResourceStructure; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERGetPermissionResourseRelatedCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERGetPermissionResourseRelatedCustomizeController {

    @Autowired
    private PERGetPermissionResourseRelatedCustomizeService pERGetPermissionResourseRelatedCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "b1402151-7e77-4879-a973-269e63f074bf",rules = { })})
    @PostMapping("/api/lcplogics/PERGetPermissionResourseRelated")
    public ApiReturn<List<LCAPPermissionAndResourceStructure>> pERGetPermissionResourseRelated(@RequestBody PERGetPermissionResourseRelatedCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERGetPermissionResourseRelatedCustomizeService.pERGetPermissionResourseRelated(body.getPermissionId()));
    } 


}
