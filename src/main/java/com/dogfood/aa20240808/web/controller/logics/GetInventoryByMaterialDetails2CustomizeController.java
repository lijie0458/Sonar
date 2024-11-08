package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetInventoryByMaterialDetails2CustomizeControllerDto; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.GetInventoryByMaterialDetails2CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetInventoryByMaterialDetails2CustomizeController {

    @Autowired
    private GetInventoryByMaterialDetails2CustomizeService getInventoryByMaterialDetails2CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "ef678628dd5042d0b70d87e44e2a85fe",rules = { }),@ValidationRuleGroup(value = "634d1349595c4908b9272601ad88faf6",rules = { @ValidationRule(value = "required",targetName = "body.warehouseId",argvs = "",errorMsg = "调出仓库不能为空")})})
    @PostMapping("/api/lcplogics/getInventoryByMaterialDetails2")
    public ApiReturn<InventoryEntity> getInventoryByMaterialDetails2(@RequestBody GetInventoryByMaterialDetails2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getInventoryByMaterialDetails2CustomizeService.getInventoryByMaterialDetails2(body.getMaterialCode(), body.getWarehouseId(), body.getLotNumber()));
    } 

}
