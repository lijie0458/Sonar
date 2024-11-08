package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetWarehousingDetailsByCode1CustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.OtherInStorageDetailsStrutureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetWarehousingDetailsByCode1CustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetWarehousingDetailsByCode1CustomizeController {

    @Autowired
    private GetWarehousingDetailsByCode1CustomizeService getWarehousingDetailsByCode1CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "1963ea84d57d41f3894bb3509037596d",rules = { })})
    @PostMapping("/api/lcplogics/getWarehousingDetailsByCode1")
    public ApiReturn<List<OtherInStorageDetailsStrutureStructure>> getWarehousingDetailsByCode1(@RequestBody GetWarehousingDetailsByCode1CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getWarehousingDetailsByCode1CustomizeService.getWarehousingDetailsByCode1(body.getCode()));
    } 

}
