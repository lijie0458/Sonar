package com.dogfood.aa20240808.web.controller.rest; 

import org.springframework.web.bind.annotation.RestController; 
import java.util.List; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.service.logics.LCAPGetUserResourcesCustomizeService; 
import com.dogfood.aa20240808.domain.structure.LCAPGetResourceResultStructure; 

@RestController
public class LCAPGetResourceResultController {

    @Autowired
    private LCAPGetUserResourcesCustomizeService lCAPGetUserResourcesCustomizeService;
    @GetMapping("/rest/getUserResources")
    public List<LCAPGetResourceResultStructure> LCAPGetResourceResult(@RequestParam(required = false) String userId) throws Exception {
        return lCAPGetUserResourcesCustomizeService.lCAPGetUserResources(userId);
    } 


}
