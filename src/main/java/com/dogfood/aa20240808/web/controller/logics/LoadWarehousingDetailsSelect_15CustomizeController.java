package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadWarehousingDetailsSelect_15CustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadWarehousingDetailsSelect_15CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadWarehousingDetailsSelect_15CustomizeController {

    @Autowired
    private LoadWarehousingDetailsSelect_15CustomizeService loadWarehousingDetailsSelect_15CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "a452faf2-7378-4f52-a6cb-ba0fe8d42cdb",rules = { }),@ValidationRuleGroup(value = "ee916d87e84e46feb4a2ea699c124305",rules = { }),@ValidationRuleGroup(value = "d5adb98b-a727-4855-af4f-4797f0cb0847",rules = { })})
    @PostMapping("/api/lcplogics/loadWarehousingDetailsSelect_15")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445> loadWarehousingDetailsSelect_15(@RequestBody LoadWarehousingDetailsSelect_15CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadWarehousingDetailsSelect_15CustomizeService.loadWarehousingDetailsSelect_15(body.getPage(), body.getSize()));
    } 


}
