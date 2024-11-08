package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.service.logics.LoadALLSupplierCustomizeService; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class LoadALLSupplierCustomizeController {

    @Autowired
    private LoadALLSupplierCustomizeService loadALLSupplierCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "12d5189e-289c-4505-ad42-5ebb1d654990",rules = { }),@ValidationRuleGroup(value = "137c963474c6431984c58e7cce71cd36",rules = { }),@ValidationRuleGroup(value = "925f320bcce042eda4b70087caf50265",rules = { })})
    @PostMapping("/api/lcplogics/loadALLSupplier")
    public ApiReturn<AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4> loadALLSupplier() throws Exception {
        return ApiReturn.of(loadALLSupplierCustomizeService.loadALLSupplier());
    } 

}
