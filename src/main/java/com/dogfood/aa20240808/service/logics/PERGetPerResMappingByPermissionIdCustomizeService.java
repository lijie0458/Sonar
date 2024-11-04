package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import com.dogfood.aa20240808.repository.PERGetPerResMappingByPermissionIdCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERGetPerResMappingByPermissionIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERGetPerResMappingByPermissionIdCustomizeServiceMapper pERGetPerResMappingByPermissionIdCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF> pERGetPerResMappingByPermissionId(Long permissionId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF> result = new ArrayList<>();
        if ((CommonFunctionUtil.notEquals(permissionId, null))) {
            result = CommonFunctionUtil.createListPage(pERGetPerResMappingByPermissionIdCustomizeServiceMapper.getAnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF(permissionId), pERGetPerResMappingByPermissionIdCustomizeServiceMapper.countAnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF(permissionId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_38593AA815D055EA90DAB07FE4542F93.class).list; 
        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数permissionId为null"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 


}
