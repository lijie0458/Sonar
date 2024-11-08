package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadMaterialCodeCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadMaterialCodeCustomizeControllerDto; 

@RestController
public class LoadMaterialCodeCustomizeController {

    @Autowired
    private LoadMaterialCodeCustomizeService loadMaterialCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "aeebb48f6d6246048f8128452332456e",rules = { @ValidationRule(value = "required",targetName = "body.code",argvs = "",errorMsg = "分类编码不能为空"),@ValidationRule(value = "^az09-$",targetName = "body.code",argvs = "",errorMsg = "")})})
    @PostMapping("/api/lcplogics/loadMaterialCode")
    public ApiReturn<Boolean> loadMaterialCode(@RequestBody LoadMaterialCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadMaterialCodeCustomizeService.loadMaterialCode(body.getCode()));
    } 

}
