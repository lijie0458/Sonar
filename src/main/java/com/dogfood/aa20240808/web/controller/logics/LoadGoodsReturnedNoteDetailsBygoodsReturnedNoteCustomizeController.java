package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeControllerDto; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeService; 
import com.dogfood.aa20240808.domain.structure.BePutInStorageStructureStructure; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeController {

    @Autowired
    private LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeService loadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "be2cdc770b9844b0a8cf8020ff7f4200",rules = { })})
    @PostMapping("/api/lcplogics/loadGoodsReturnedNoteDetailsBygoodsReturnedNote")
    public ApiReturn<List<BePutInStorageStructureStructure>> loadGoodsReturnedNoteDetailsBygoodsReturnedNote(@RequestBody LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeService.loadGoodsReturnedNoteDetailsBygoodsReturnedNote(body.getOrder_number()));
    } 


}
