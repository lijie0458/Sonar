package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetOtherInSDetailsByOtherInSCodeCustomizeControllerDto; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.OtherInStorageDetailsStrutureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.GetOtherInSDetailsByOtherInSCodeCustomizeService; 

@RestController
public class GetOtherInSDetailsByOtherInSCodeCustomizeController {

    @Autowired
    private GetOtherInSDetailsByOtherInSCodeCustomizeService getOtherInSDetailsByOtherInSCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "fd9564ef-ed2a-4512-ad88-466725838f14",rules = { })})
    @PostMapping("/api/lcplogics/getOtherInSDetailsByOtherInSCode")
    public ApiReturn<List<OtherInStorageDetailsStrutureStructure>> getOtherInSDetailsByOtherInSCode(@RequestBody GetOtherInSDetailsByOtherInSCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getOtherInSDetailsByOtherInSCodeCustomizeService.getOtherInSDetailsByOtherInSCode(body.getOtherInSCode()));
    } 

}
