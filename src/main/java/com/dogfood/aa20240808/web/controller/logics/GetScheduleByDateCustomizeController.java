package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.GetScheduleByDateCustomizeService; 
import com.dogfood.aa20240808.domain.entities.ScheduleEntity; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.GetScheduleByDateCustomizeControllerDto; 

@RestController
public class GetScheduleByDateCustomizeController {

    @Autowired
    private GetScheduleByDateCustomizeService getScheduleByDateCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "961d31b3d6c245c8a0b3dbb7dcf31698",rules = { }),@ValidationRuleGroup(value = "97e5e96324ae4dad81ee83e0054dd091",rules = { }),@ValidationRuleGroup(value = "d56a3d5db9cb4f48b74da014c0fb451c",rules = { })})
    @PostMapping("/api/lcplogics/getScheduleByDate")
    public ApiReturn<List<ScheduleEntity>> getScheduleByDate(@RequestBody GetScheduleByDateCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(getScheduleByDateCustomizeService.getScheduleByDate(body.getCreateDate()));
    } 


}
