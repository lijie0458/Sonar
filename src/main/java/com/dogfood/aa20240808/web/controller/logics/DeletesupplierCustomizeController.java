package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.DeletesupplierCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190; 
import com.dogfood.aa20240808.web.controller.logics.dto.DeletesupplierCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class DeletesupplierCustomizeController {

    @Autowired
    private DeletesupplierCustomizeService deletesupplierCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "e860f2c8613545738d091e9bec2536f9",rules = { })})
    @PostMapping("/api/lcplogics/deletesupplier")
    public ApiReturn<AnonymousStructure_31A02440DB0E34FD453392B198B85190> deletesupplier(@RequestBody DeletesupplierCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(deletesupplierCustomizeService.deletesupplier(body.getParam1()));
    } 

}
