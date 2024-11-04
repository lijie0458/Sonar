package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPGetMappingByPermissionIdAndResourceIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper lCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper;
    public List<Long> lCAPGetMappingByPermissionIdAndResourceId(Long permissionId, Long resourceId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_38593AA815D055EA90DAB07FE4542F93 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_38593AA815D055EA90DAB07FE4542F93();
        List<Long> mappingIdList = new ArrayList<>();
        CommonFunctionUtil.clear(mappingIdList);
        variable1 = CommonFunctionUtil.createListPage(lCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper.getAnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF(permissionId, resourceId), lCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper.countAnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF(permissionId, resourceId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_38593AA815D055EA90DAB07FE4542F93.class); 
        for (Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF item = variable1.list.get(i.intValue());
            CommonFunctionUtil.add(mappingIdList, item.lCAPPerResMapping.id);
        } 

        return mappingIdList;
    } 


}
