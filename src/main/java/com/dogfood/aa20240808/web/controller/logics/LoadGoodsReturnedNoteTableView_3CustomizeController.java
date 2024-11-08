package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadGoodsReturnedNoteTableView_3CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D2D225B3C0E66306C0CD512C8C88B497; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadGoodsReturnedNoteTableView_3CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadGoodsReturnedNoteTableView_3CustomizeController {

    @Autowired
    private LoadGoodsReturnedNoteTableView_3CustomizeService loadGoodsReturnedNoteTableView_3CustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "8b48c1e5-a922-4477-a473-99553ac838bb",rules = { })})
    @PostMapping("/api/lcplogics/loadGoodsReturnedNoteTableView_3")
    public ApiReturn<AnonymousStructure_D2D225B3C0E66306C0CD512C8C88B497> loadGoodsReturnedNoteTableView_3(@RequestBody LoadGoodsReturnedNoteTableView_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadGoodsReturnedNoteTableView_3CustomizeService.loadGoodsReturnedNoteTableView_3(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter(), body.getTimeHorizon(), body.getDataViewAuthorityUserNameList()));
    } 

}
