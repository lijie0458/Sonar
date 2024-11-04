package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.service.logics.LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeService; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeController {

    @Autowired
    private LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeService loadAddGoodsReturnedNoteUpdateSelect_2CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "1b26ec07-2239-4831-9668-ad92e767704d",rules = { })})
    @PostMapping("/api/lcplogics/loadAddGoodsReturnedNoteUpdateSelect_2")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_611269E21EE6FE18529B487D4B579CBA>> loadAddGoodsReturnedNoteUpdateSelect_2(@RequestBody LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadAddGoodsReturnedNoteUpdateSelect_2CustomizeService.loadAddGoodsReturnedNoteUpdateSelect_2(body.getPage(), body.getSize()));
    } 


}
