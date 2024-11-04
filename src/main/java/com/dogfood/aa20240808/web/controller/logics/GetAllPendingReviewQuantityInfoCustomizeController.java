package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.GetAllPendingReviewQuantityInfoCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.AllPendingReviewQuantityStructure; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetAllPendingReviewQuantityInfoCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetAllPendingReviewQuantityInfoCustomizeController {

    @Autowired
    private GetAllPendingReviewQuantityInfoCustomizeService getAllPendingReviewQuantityInfoCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "f50e01de1c93453290c34bbf350fab8e",rules = { })})
    @PostMapping("/api/lcplogics/getAllPendingReviewQuantityInfo")
    public ApiReturn<AllPendingReviewQuantityStructure> getAllPendingReviewQuantityInfo(@RequestBody GetAllPendingReviewQuantityInfoCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getAllPendingReviewQuantityInfoCustomizeService.getAllPendingReviewQuantityInfo(body.getDataViewAuthority()));
    } 


}
