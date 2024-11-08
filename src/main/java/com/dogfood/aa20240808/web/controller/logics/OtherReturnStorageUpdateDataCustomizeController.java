package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.OtherReturnStorageUpdateDataCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.OtherReturnStorageUpdateDataCustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47; 

@RestController
public class OtherReturnStorageUpdateDataCustomizeController {

    @Autowired
    private OtherReturnStorageUpdateDataCustomizeService otherReturnStorageUpdateDataCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "376b029b-f865-4794-867c-aebf861ff923",rules = { })})
    @PostMapping("/api/lcplogics/otherReturnStorageUpdateData")
    public ApiReturn<AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47> otherReturnStorageUpdateData(@RequestBody OtherReturnStorageUpdateDataCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(otherReturnStorageUpdateDataCustomizeService.otherReturnStorageUpdateData(body.getOtherReturnCode()));
    } 

}
