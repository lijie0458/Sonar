package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadAddPurchaseRequestorUpdateSelectCustomizeControllerDto; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadAddPurchaseRequestorUpdateSelectCustomizeService; 

@RestController
public class LoadAddPurchaseRequestorUpdateSelectCustomizeController {

    @Autowired
    private LoadAddPurchaseRequestorUpdateSelectCustomizeService loadAddPurchaseRequestorUpdateSelectCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "a4f23544-996d-427d-ae9d-caf0441bfc6d",rules = { }),@ValidationRuleGroup(value = "100228eb-0474-4f16-adc1-80d0c36f8144",rules = { }),@ValidationRuleGroup(value = "890f5246a23648e5b38194d420263081",rules = { }),@ValidationRuleGroup(value = "351c4222-fddf-4fdb-a1c5-cff9bce68c59",rules = { }),@ValidationRuleGroup(value = "e6ac0913-3d35-40bb-b9d5-d0cb4ac6b713",rules = { })})
    @PostMapping("/api/lcplogics/loadAddPurchaseRequestorUpdateSelect")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC>> loadAddPurchaseRequestorUpdateSelect(@RequestBody LoadAddPurchaseRequestorUpdateSelectCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadAddPurchaseRequestorUpdateSelectCustomizeService.loadAddPurchaseRequestorUpdateSelect(body.getPage(), body.getSize(), body.getListMaterialDetailsCode()));
    } 


}
