package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadMeasuringUnitTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadMeasuringUnitTableViewCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadMeasuringUnitTableViewCustomizeController {

    @Autowired
    private LoadMeasuringUnitTableViewCustomizeService loadMeasuringUnitTableViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "fddf000c-f53f-431b-92e3-669413f50018",rules = { })})
    @PostMapping("/api/lcplogics/loadMeasuringUnitTableView")
    public ApiReturn<AnonymousStructure_5DA3D583870666F723936098E7C05C85> loadMeasuringUnitTableView(@RequestBody LoadMeasuringUnitTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadMeasuringUnitTableViewCustomizeService.loadMeasuringUnitTableView(body.getPage(), body.getSize(), body.getSort(), body.getOrder(), body.getFilter()));
    } 

}
