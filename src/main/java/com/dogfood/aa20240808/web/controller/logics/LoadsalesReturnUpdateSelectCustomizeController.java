package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C807E715FC032F8BE6027971BB14D4D0; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.LoadsalesReturnUpdateSelectCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadsalesReturnUpdateSelectCustomizeControllerDto; 

@RestController
public class LoadsalesReturnUpdateSelectCustomizeController {

    @Autowired
    private LoadsalesReturnUpdateSelectCustomizeService loadsalesReturnUpdateSelectCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "18799ff4-e943-4ee1-92d9-758a1fcbebef",rules = { @ValidationRule(value = "required",targetName = "body.orderNumber",argvs = "",errorMsg = "源单单号不能为空")})})
    @PostMapping("/api/lcplogics/loadsalesReturnUpdateSelect")
    public ApiReturn<List<AnonymousStructure_C807E715FC032F8BE6027971BB14D4D0>> loadsalesReturnUpdateSelect(@RequestBody LoadsalesReturnUpdateSelectCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadsalesReturnUpdateSelectCustomizeService.loadsalesReturnUpdateSelect(body.getPage(), body.getSize(), body.getListMaterialDetailsCode(), body.getOrderNumber()));
    } 

}
