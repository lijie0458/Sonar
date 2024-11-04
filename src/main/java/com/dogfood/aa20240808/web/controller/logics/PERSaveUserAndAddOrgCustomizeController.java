package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.dogfood.aa20240808.web.validation.Validation; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 
import com.dogfood.aa20240808.web.controller.logics.dto.PERSaveUserAndAddOrgCustomizeControllerDto; 
import com.dogfood.aa20240808.service.logics.PERSaveUserAndAddOrgCustomizeService; 

@RestController
public class PERSaveUserAndAddOrgCustomizeController {

    @Autowired
    private PERSaveUserAndAddOrgCustomizeService pERSaveUserAndAddOrgCustomizeService;
    @Validation(value = { @ValidationRuleGroup(value = "3d6f1853-e94f-455e-a9ad-d2c23d116812",rules = { }),@ValidationRuleGroup(value = "aff521fe-576f-4f7c-bad2-97a6a3675035",rules = { })})
    @PostMapping("/api/lcplogics/PERSaveUserAndAddOrg")
    public void pERSaveUserAndAddOrg(@RequestBody PERSaveUserAndAddOrgCustomizeControllerDto body) throws Exception {
        pERSaveUserAndAddOrgCustomizeService.pERSaveUserAndAddOrg(body.getUser(), body.getUserOrgMapping(), body.getIsUpdate(), body.getRoleIdList());
    } 


}
