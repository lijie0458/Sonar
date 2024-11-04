package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.LoadDeliveryReleaseDetailsSelect_15CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadDeliveryReleaseDetailsSelect_15CustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadDeliveryReleaseDetailsSelect_15CustomizeController {

    @Autowired
    private LoadDeliveryReleaseDetailsSelect_15CustomizeService loadDeliveryReleaseDetailsSelect_15CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "20b24717-3d0b-43a1-b497-f03270eb77cb",rules = { @ValidationRule(value = "required",targetName = "body.warehouseId",argvs = "",errorMsg = "仓库不能为空")}),@ValidationRuleGroup(value = "06993bb3-1884-4305-a146-121d6ef6aa33",rules = { @ValidationRule(value = "required",targetName = "body.warehouseId",argvs = "",errorMsg = "发货仓库不能为空")}),@ValidationRuleGroup(value = "61b59c3c-643a-437f-97bf-459b424812af",rules = { @ValidationRule(value = "required",targetName = "body.warehouseId",argvs = "",errorMsg = "仓库不能为空")})})
    @PostMapping("/api/lcplogics/loadDeliveryReleaseDetailsSelect_15")
    public ApiReturn<Storage_locationEntity> loadDeliveryReleaseDetailsSelect_15(@RequestBody LoadDeliveryReleaseDetailsSelect_15CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadDeliveryReleaseDetailsSelect_15CustomizeService.loadDeliveryReleaseDetailsSelect_15(body.getWarehouseId()));
    } 


}
