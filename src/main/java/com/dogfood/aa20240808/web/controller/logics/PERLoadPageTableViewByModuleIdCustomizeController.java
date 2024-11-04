package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERLoadPageTableViewByModuleIdCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.PERLoadPageTableViewByModuleIdCustomizeService; 

@RestController
public class PERLoadPageTableViewByModuleIdCustomizeController {

    @Autowired
    private PERLoadPageTableViewByModuleIdCustomizeService pERLoadPageTableViewByModuleIdCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "5d96cfad-89f9-4cd3-aa8e-97e6bf891bd5",rules = { }),@ValidationRuleGroup(value = "5f7ec8ac-6378-48a7-90ae-ca508ced580f",rules = { })})
    @PostMapping("/api/lcplogics/PERLoadPageTableViewByModuleId")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E>> pERLoadPageTableViewByModuleId(@RequestBody PERLoadPageTableViewByModuleIdCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERLoadPageTableViewByModuleIdCustomizeService.pERLoadPageTableViewByModuleId(body.getModuleId()));
    } 


}
