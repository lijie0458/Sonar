package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LogicStorageLocationCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.web.controller.logics.dto.LogicStorageLocationCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LogicStorageLocationCustomizeController {

    @Autowired
    private LogicStorageLocationCustomizeService logicStorageLocationCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "e72ee12601d54748813912520304e901",rules = { @ValidationRule(value = "required",targetName = "body.warehouse_code",argvs = "",errorMsg = "二级仓库编码不能为空"),@ValidationRule(value = "required",targetName = "body.warehouse_name",argvs = "",errorMsg = "二级仓库名称不能为空"),@ValidationRule(value = "pattern",targetName = "body.warehouse_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}",errorMsg = "请输入正确二级仓库名称")})})
    @PostMapping("/api/lcplogics/logicStorageLocation")
    public void logicStorageLocation(@RequestBody LogicStorageLocationCustomizeControllerDto body) throws Exception {
        logicStorageLocationCustomizeService.logicStorageLocation(body.getWarehouse_code(), body.getWarehouse_name());
    } 

}
