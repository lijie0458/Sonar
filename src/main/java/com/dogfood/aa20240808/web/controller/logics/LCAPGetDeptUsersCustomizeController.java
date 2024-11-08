package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LCAPGetDeptUsersCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LCAPGetDeptUsersCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LCAPGetDeptUsersCustomizeController {

    @Autowired
    private LCAPGetDeptUsersCustomizeService lCAPGetDeptUsersCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "3ef2923042044677a425308ca949f6bc",rules = { })})
    @PostMapping("/api/lcplogics/LCAPGetDeptUsers")
    public ApiReturn<AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E> lCAPGetDeptUsers(@RequestBody LCAPGetDeptUsersCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(lCAPGetDeptUsersCustomizeService.lCAPGetDeptUsers(body.getDeptId(), body.getPage(), body.getSize()));
    } 

}
