package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.LoadMaterialSelect2MeasuringUnitCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import com.dogfood.aa20240808.web.controller.logics.dto.LoadMaterialSelect2MeasuringUnitCustomizeControllerDto; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadMaterialSelect2MeasuringUnitCustomizeController {

    @Autowired
    private LoadMaterialSelect2MeasuringUnitCustomizeService loadMaterialSelect2MeasuringUnitCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "6ee75e4f-3d43-473f-980f-9d7136e74f8d",rules = { })})
    @PostMapping("/api/lcplogics/loadMaterialSelect2MeasuringUnit")
    public ApiReturn<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85> loadMaterialSelect2MeasuringUnit(@RequestBody LoadMaterialSelect2MeasuringUnitCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(loadMaterialSelect2MeasuringUnitCustomizeService.loadMaterialSelect2MeasuringUnit(body.getPage(), body.getSize()));
    } 


}
