package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.OutsourceInStorageDetailsStrutureStructure; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetWarehousingDetailsByCodeCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.GetWarehousingDetailsByCodeCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetWarehousingDetailsByCodeCustomizeController {

    @Autowired
    private GetWarehousingDetailsByCodeCustomizeService getWarehousingDetailsByCodeCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "6df20b3c54b44206b3e84e4fcf14c7bd",rules = { })})
    @PostMapping("/api/lcplogics/getWarehousingDetailsByCode")
    public ApiReturn<List<OutsourceInStorageDetailsStrutureStructure>> getWarehousingDetailsByCode(@RequestBody GetWarehousingDetailsByCodeCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getWarehousingDetailsByCodeCustomizeService.getWarehousingDetailsByCode(body.getCode()));
    } 

}
