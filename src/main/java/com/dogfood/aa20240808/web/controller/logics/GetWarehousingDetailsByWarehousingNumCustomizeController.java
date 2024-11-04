package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetWarehousingDetailsByWarehousingNumCustomizeService; 
import com.dogfood.aa20240808.domain.structure.ProductInStorageDetailsStrutureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetWarehousingDetailsByWarehousingNumCustomizeControllerDto; 

@RestController
public class GetWarehousingDetailsByWarehousingNumCustomizeController {

    @Autowired
    private GetWarehousingDetailsByWarehousingNumCustomizeService getWarehousingDetailsByWarehousingNumCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "524516ea903f406a9cb0fe732ea777ff",rules = { }),@ValidationRuleGroup(value = "cb20de98545c4bdeb17b68a2b830565e",rules = { })})
    @PostMapping("/api/lcplogics/getWarehousingDetailsByWarehousingNum")
    public ApiReturn<List<ProductInStorageDetailsStrutureStructure>> getWarehousingDetailsByWarehousingNum(@RequestBody GetWarehousingDetailsByWarehousingNumCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getWarehousingDetailsByWarehousingNumCustomizeService.getWarehousingDetailsByWarehousingNum(body.getWarehousingNum()));
    } 


}
