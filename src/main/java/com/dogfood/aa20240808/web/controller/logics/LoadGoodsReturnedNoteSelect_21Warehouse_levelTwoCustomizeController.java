package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadGoodsReturnedNoteSelect_21Warehouse_levelTwoCustomizeControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.service.logics.LoadGoodsReturnedNoteSelect_21Warehouse_levelTwoCustomizeService; 

@RestController
public class LoadGoodsReturnedNoteSelect_21Warehouse_levelTwoCustomizeController {

    @Autowired
    private LoadGoodsReturnedNoteSelect_21Warehouse_levelTwoCustomizeService loadGoodsReturnedNoteSelect_21Warehouse_levelTwoCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "806a8f69-816f-48ad-b28e-9ab3172cdde7",rules = { }),@ValidationRuleGroup(value = "c00dbc58-825b-4030-90d8-264a5c383031",rules = { })})
    @PostMapping("/api/lcplogics/loadGoodsReturnedNoteSelect_21Warehouse_levelTwo")
    public ApiReturn<List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2>> loadGoodsReturnedNoteSelect_21Warehouse_levelTwo(@RequestBody LoadGoodsReturnedNoteSelect_21Warehouse_levelTwoCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadGoodsReturnedNoteSelect_21Warehouse_levelTwoCustomizeService.loadGoodsReturnedNoteSelect_21Warehouse_levelTwo(body.getPage(), body.getSize()));
    } 


}
