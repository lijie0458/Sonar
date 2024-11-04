package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadCountCategory_codeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadCountCategory_codeCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountCategory_codeCustomizeController {

    @Autowired
    private LoadCountCategory_codeCustomizeService loadCountCategory_codeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "12ac34a8-1e97-4a6c-abce-920311f21e9f",rules = { })})
    @PostMapping("/api/lcplogics/loadCountCategory_code")
    public ApiReturn<String> loadCountCategory_code(@RequestBody LoadCountCategory_codeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadCountCategory_codeCustomizeService.loadCountCategory_code(body.getCode()));
    } 


}
