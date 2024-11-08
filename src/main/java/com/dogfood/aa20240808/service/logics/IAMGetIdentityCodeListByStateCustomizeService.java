package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22E188A54D4B66D541C0CA978F47CF23; 
import com.dogfood.aa20240808.repository.IAMGetIdentityCodeListByStateCustomizeServiceMapper; 

/**
 * IAM-通过state类型身份源下所有唯一标识
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class IAMGetIdentityCodeListByStateCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private IAMGetIdentityCodeListByStateCustomizeServiceMapper iAMGetIdentityCodeListByStateCustomizeServiceMapper;

    public List<String> iAMGetIdentityCodeListByState(IdentitySourceStateEnumEnum state) {
        List<String> result = new ArrayList<>();
        result = CommonFunctionUtil.listTransform(CommonFunctionUtil.createListPage(iAMGetIdentityCodeListByStateCustomizeServiceMapper.getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(state), iAMGetIdentityCodeListByStateCustomizeServiceMapper.countAnonymousStructure_E6204F88FA3760A005F0E371750B535E(state).intValue(), AnonymousStructure_22E188A54D4B66D541C0CA978F47CF23.class).list, (item) -> item.identitySourceConfig.code); 
        return result;
    } 

}
