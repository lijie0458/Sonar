package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeController {

    @Autowired
    private LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeService loadGoodsReturnedNoteSelect_19BePutInStorageCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "88506837-4652-4063-a1f6-f43ba0a305d8",rules = { }),@ValidationRuleGroup(value = "58c036d1-849f-44b5-95b5-493511a37ddd",rules = { })})
    @PostMapping("/api/lcplogics/loadGoodsReturnedNoteSelect_19BePutInStorage")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_611269E21EE6FE18529B487D4B579CBA>> loadGoodsReturnedNoteSelect_19BePutInStorage(@RequestBody LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadGoodsReturnedNoteSelect_19BePutInStorageCustomizeService.loadGoodsReturnedNoteSelect_19BePutInStorage(body.getPage(), body.getSize()));
    } 


}
