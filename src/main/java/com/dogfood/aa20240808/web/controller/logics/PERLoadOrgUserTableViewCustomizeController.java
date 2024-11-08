package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERLoadOrgUserTableViewCustomizeControllerDto; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.service.logics.PERLoadOrgUserTableViewCustomizeService; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4949638EA1EA3533FFEA3179FEC0328D; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class PERLoadOrgUserTableViewCustomizeController {

    @Autowired
    private PERLoadOrgUserTableViewCustomizeService pERLoadOrgUserTableViewCustomizeService;

    @Validation(value = { @ValidationRuleGroup(value = "f9933e26-ca55-430b-a088-0b7ebef6247e",rules = { })})
    @PostMapping("/api/lcplogics/PERLoadOrgUserTableView")
    public ApiReturn<AnonymousStructure_4949638EA1EA3533FFEA3179FEC0328D> pERLoadOrgUserTableView(@RequestBody PERLoadOrgUserTableViewCustomizeControllerDto body) throws Exception {
        return ApiReturn.of(pERLoadOrgUserTableViewCustomizeService.pERLoadOrgUserTableView(body.getOrgId(), body.getPage(), body.getSize()));
    } 

}
