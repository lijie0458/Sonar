package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.service.logics.LoadCountReceivingNotificationsCustomizeService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadCountReceivingNotificationsCustomizeController {

    @Autowired
    private LoadCountReceivingNotificationsCustomizeService loadCountReceivingNotificationsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "501e247d-e0dd-4f9d-8f03-05ad545230b0",rules = { })})
    @PostMapping("/api/lcplogics/loadCountReceivingNotifications")
    public ApiReturn<String> loadCountReceivingNotifications() throws Exception {
        return ApiReturn.of(loadCountReceivingNotificationsCustomizeService.loadCountReceivingNotifications());
    } 


}
