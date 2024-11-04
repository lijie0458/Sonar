package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.GetMaterialDetailsByCodeCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetMaterialDetailsByCodeCustomizeControllerDto; 

@RestController
public class GetMaterialDetailsByCodeCustomizeController {

    @Autowired
    private GetMaterialDetailsByCodeCustomizeService getMaterialDetailsByCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "16b15fb9e0194384870f7ca6af3d60d6",rules = { })})
    @PostMapping("/api/lcplogics/getMaterialDetailsByCode")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_67157391F5C859BD7A607E15FE4E75BD>> getMaterialDetailsByCode(@RequestBody GetMaterialDetailsByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getMaterialDetailsByCodeCustomizeService.getMaterialDetailsByCode(body.getCode()));
    } 


}
