package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetResOriginalDateOrSelectedDateByPerIdCustomizeService; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.entities.LCAPResource; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetResOriginalDateOrSelectedDateByPerIdCustomizeControllerDto; 

@RestController
public class GetResOriginalDateOrSelectedDateByPerIdCustomizeController {

    @Autowired
    private GetResOriginalDateOrSelectedDateByPerIdCustomizeService getResOriginalDateOrSelectedDateByPerIdCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "67fce2efc76f43c3bdc0ca7def9750fe",rules = { }),@ValidationRuleGroup(value = "e6f3f48bc49748a1b43697b0ac5c5d74",rules = { }),@ValidationRuleGroup(value = "68a580ce35eb49b587558f74a97b565a",rules = { })})
    @PostMapping("/api/lcplogics/getResOriginalDateOrSelectedDateByPerId")
    public ApiReturn<List<LCAPResource>> getResOriginalDateOrSelectedDateByPerId(@RequestBody GetResOriginalDateOrSelectedDateByPerIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getResOriginalDateOrSelectedDateByPerIdCustomizeService.getResOriginalDateOrSelectedDateByPerId(body.getPerId(), body.getOriginalOrSelected()));
    } 


}
