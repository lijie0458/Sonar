package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_918C890596FE76F2D0016F5A4227FA96; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.OutsourceReturnStorageUpdateDataCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.OutsourceReturnStorageUpdateDataCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class OutsourceReturnStorageUpdateDataCustomizeController {

    @Autowired
    private OutsourceReturnStorageUpdateDataCustomizeService outsourceReturnStorageUpdateDataCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "4cd94daa-4155-47af-82e1-6f345b4f30c2",rules = { })})
    @PostMapping("/api/lcplogics/outsourceReturnStorageUpdateData")
    public ApiReturn<AnonymousStructure_918C890596FE76F2D0016F5A4227FA96> outsourceReturnStorageUpdateData(@RequestBody OutsourceReturnStorageUpdateDataCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(outsourceReturnStorageUpdateDataCustomizeService.outsourceReturnStorageUpdateData(body.getOutsourceReturnCode()));
    } 

}
