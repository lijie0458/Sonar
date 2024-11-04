package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeControllerDto; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeController {

    @Autowired
    private LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeService loadBePutInStorageListSelect_1ReceivingNotificationsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "87bcd49b-ca10-40e9-8cef-f14bba1094f4",rules = { })})
    @PostMapping("/api/lcplogics/loadBePutInStorageListSelect_1ReceivingNotifications")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073>> loadBePutInStorageListSelect_1ReceivingNotifications(@RequestBody LoadBePutInStorageListSelect_1ReceivingNotificationsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadBePutInStorageListSelect_1ReceivingNotificationsCustomizeService.loadBePutInStorageListSelect_1ReceivingNotifications(body.getPage(), body.getSize()));
    } 


}
