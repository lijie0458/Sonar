package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetMaterialByIdListCustomizeService; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetMaterialByIdListCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class GetMaterialByIdListCustomizeController {

    @Autowired
    private GetMaterialByIdListCustomizeService getMaterialByIdListCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "286aca0e4c924106a6f32b51c7c44e2b",rules = { }),@ValidationRuleGroup(value = "0ff56391f177468886c71fff7f918709",rules = { })})
    @PostMapping("/api/lcplogics/getMaterialByIdList")
    public ApiReturn<AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C> getMaterialByIdList(@RequestBody GetMaterialByIdListCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getMaterialByIdListCustomizeService.getMaterialByIdList(body.getIdList()));
    } 

}
