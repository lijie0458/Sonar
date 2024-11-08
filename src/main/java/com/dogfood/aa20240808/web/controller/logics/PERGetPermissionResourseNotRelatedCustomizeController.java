package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.LCAPPermissionAndResourceStructure; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.PERGetPermissionResourseNotRelatedCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERGetPermissionResourseNotRelatedCustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERGetPermissionResourseNotRelatedCustomizeController {

    @Autowired
    private PERGetPermissionResourseNotRelatedCustomizeService pERGetPermissionResourseNotRelatedCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "a9e4bea1-ea7f-4ba1-92b2-888a9d212ca7",rules = { })})
    @PostMapping("/api/lcplogics/PERGetPermissionResourseNotRelated")
    public ApiReturn<List<LCAPPermissionAndResourceStructure>> pERGetPermissionResourseNotRelated(@RequestBody PERGetPermissionResourseNotRelatedCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERGetPermissionResourseNotRelatedCustomizeService.pERGetPermissionResourseNotRelated(body.getPermissionId()));
    } 

}
