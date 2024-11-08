package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.GetStoragelocationByStorageCustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetStoragelocationByStorageCustomizeControllerDto; 

@RestController
public class GetStoragelocationByStorageCustomizeController {

    @Autowired
    private GetStoragelocationByStorageCustomizeService getStoragelocationByStorageCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "d814ec20d5e54a5ea84c916e3ab893e5",rules = { @ValidationRule(value = "required",targetName = "body.storageId",argvs = "",errorMsg = "仓库不能为空")}),@ValidationRuleGroup(value = "3f8945466fb5485cbb6d1013b4d0130e",rules = { @ValidationRule(value = "required",targetName = "body.storageId",argvs = "",errorMsg = "仓库不能为空")}),@ValidationRuleGroup(value = "10e00af00fb84f7cbc00dd1b8186531d",rules = { }),@ValidationRuleGroup(value = "2d5aac2b-bc50-4e89-9186-96194312dfd7",rules = { }),@ValidationRuleGroup(value = "1b1e9547-04c4-4448-8ab6-13be0359cf0f",rules = { }),@ValidationRuleGroup(value = "d050e797a4ac4579b4ab20d27c4ac9f8",rules = { @ValidationRule(value = "required",targetName = "body.storageId",argvs = "",errorMsg = "仓库不能为空")})})
    @PostMapping("/api/lcplogics/getStoragelocationByStorage")
    public ApiReturn<List<Storage_locationEntity>> getStoragelocationByStorage(@RequestBody GetStoragelocationByStorageCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getStoragelocationByStorageCustomizeService.getStoragelocationByStorage(body.getStorageId()));
    } 

}
