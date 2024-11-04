package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeControllerDto; 

@RestController
public class LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeController {

    @Autowired
    private LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeService loadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "1c627ad4-5b84-4326-9b08-0696bb02d39d",rules = { }),@ValidationRuleGroup(value = "94bb52d0-c80b-4fa2-921e-27d6c82c8786",rules = { })})
    @PostMapping("/api/lcplogics/loadGoodsReturnedNoteSelect_20SupplierDetails")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34>> loadGoodsReturnedNoteSelect_20SupplierDetails(@RequestBody LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeService.loadGoodsReturnedNoteSelect_20SupplierDetails(body.getPage(), body.getSize()));
    } 


}
