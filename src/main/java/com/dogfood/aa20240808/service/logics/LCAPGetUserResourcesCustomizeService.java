package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LCAPGetUserResourcesCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.LCAPGetResourceResultStructure; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPGetUserResourcesCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPGetUserResourcesCustomizeServiceMapper lCAPGetUserResourcesCustomizeServiceMapper;
    public List<LCAPGetResourceResultStructure> lCAPGetUserResources(String userId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824();
        List<String> variable2 = new ArrayList<>();
        LCAPGetResourceResultStructure variable3 = new LCAPGetResourceResultStructure();
        List<LCAPGetResourceResultStructure> variable4 = new ArrayList<>();
        LCAPGetResourceResultStructure variable5 = new LCAPGetResourceResultStructure();
        List<LCAPGetResourceResultStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(lCAPGetUserResourcesCustomizeServiceMapper.getAnonymousStructure_B202841ADEE061731D68863F55003B0E(userId), lCAPGetUserResourcesCustomizeServiceMapper.countAnonymousStructure_B202841ADEE061731D68863F55003B0E(userId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FA75F69B8BA9C34178F71FC536D2D824.class); 
        for (Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B202841ADEE061731D68863F55003B0E item = variable1.list.get(i.intValue());
            if (CommonFunctionUtil.contains(variable2, item.lCAPResource.name)) {
            } else {
                CommonFunctionUtil.add(variable2, item.lCAPResource.name);
                variable3.resourceValue = item.lCAPResource.name; 
                variable3.resourceType = item.lCAPResource.type; 
                variable5 = CommonFunctionUtil.clone(variable3); 
                CommonFunctionUtil.add(variable4, variable5);
            } 

        } 

        result = variable4; 
        return result;
    } 


}
