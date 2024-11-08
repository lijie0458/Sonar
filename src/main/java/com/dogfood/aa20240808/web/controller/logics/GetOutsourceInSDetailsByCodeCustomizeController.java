package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetOutsourceInSDetailsByCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetOutsourceInSDetailsByCodeCustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetOutsourceInSDetailsByCodeCustomizeController {

    @Autowired
    private GetOutsourceInSDetailsByCodeCustomizeService getOutsourceInSDetailsByCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "1f6f56e2ec72493f8150e0c850a7f0a3",rules = { })})
    @PostMapping("/api/lcplogics/getOutsourceInSDetailsByCode")
    public ApiReturn<AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC> getOutsourceInSDetailsByCode(@RequestBody GetOutsourceInSDetailsByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getOutsourceInSDetailsByCodeCustomizeService.getOutsourceInSDetailsByCode(body.getCode()));
    } 

}
