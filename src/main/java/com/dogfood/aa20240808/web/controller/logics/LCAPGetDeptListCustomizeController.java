package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetDeptListCustomizeControllerDto; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LCAPGetDeptListCustomizeService; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202; 

@RestController
public class LCAPGetDeptListCustomizeController {

    @Autowired
    private LCAPGetDeptListCustomizeService lCAPGetDeptListCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "0f330087e1d145b088cbeb506e534d76",rules = { }),@ValidationRuleGroup(value = "b166086ad969447dba56159632d9e3f3",rules = { }),@ValidationRuleGroup(value = "dc41aa29fa1f4a5e9008a31733371994",rules = { }),@ValidationRuleGroup(value = "b68dad5d-0009-4c8a-9e1d-44a933a9eb19",rules = { }),@ValidationRuleGroup(value = "eb7465e9-df48-4b68-b5cb-79a3c27ee303",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetDeptList")
    public ApiReturn<List<AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202>> lCAPGetDeptList(@RequestBody LCAPGetDeptListCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetDeptListCustomizeService.lCAPGetDeptList(body.getDeptId(), body.getIsUpdate()));
    } 

}
