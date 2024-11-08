package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetOtherInSDetailsByCodeCustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetOtherInSDetailsByCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetOtherInSDetailsByCodeCustomizeController {

    @Autowired
    private GetOtherInSDetailsByCodeCustomizeService getOtherInSDetailsByCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "8e00265d-3be6-47b1-bc32-ea4caff0920d",rules = { })})
    @PostMapping("/api/lcplogics/getOtherInSDetailsByCode")
    public ApiReturn<AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A> getOtherInSDetailsByCode(@RequestBody GetOtherInSDetailsByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getOtherInSDetailsByCodeCustomizeService.getOtherInSDetailsByCode(body.getCode()));
    } 

}
