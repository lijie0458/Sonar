package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetOutsourceInSDetailsByOutsourceInSCodeCustomizeService; 
import com.dogfood.aa20240808.domain.structure.OutsourceInStorageDetailsStrutureStructure; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetOutsourceInSDetailsByOutsourceInSCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetOutsourceInSDetailsByOutsourceInSCodeCustomizeController {

    @Autowired
    private GetOutsourceInSDetailsByOutsourceInSCodeCustomizeService getOutsourceInSDetailsByOutsourceInSCodeCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "21d8aa6a-bfd5-4f86-a20b-398b4cc6753a",rules = { })})
    @PostMapping("/api/lcplogics/getOutsourceInSDetailsByOutsourceInSCode")
    public ApiReturn<List<OutsourceInStorageDetailsStrutureStructure>> getOutsourceInSDetailsByOutsourceInSCode(@RequestBody GetOutsourceInSDetailsByOutsourceInSCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getOutsourceInSDetailsByOutsourceInSCodeCustomizeService.getOutsourceInSDetailsByOutsourceInSCode(body.getOutsourceInSCode()));
    } 


}
