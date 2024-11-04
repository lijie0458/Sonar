package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.ValidationRule; 
import com.dogfood.aa20240808.service.logics.LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeController {

    @Autowired
    private LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeService loadAddGoodsReturnedNoteUpdateSelect_3CustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "aef0dbb9-5f17-45e1-970a-989f3b188e12",rules = { @ValidationRule(value = "required",targetName = "body.BeputlnStorageId",argvs = "",errorMsg = "订单号不能为空")})})
    @PostMapping("/api/lcplogics/loadAddGoodsReturnedNoteUpdateSelect_3")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_10F2061EB738BC3413E904F245F8BF2E> loadAddGoodsReturnedNoteUpdateSelect_3(@RequestBody LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadAddGoodsReturnedNoteUpdateSelect_3CustomizeService.loadAddGoodsReturnedNoteUpdateSelect_3(body.getPage(), body.getSize(), body.getBeputlnStorageId(), body.getBePulnStorageDetailsIdList()));
    } 


}
