package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.IAMGetAllRoleCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1F7B77FE76090915A8B00D40711CE1D; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * IAM-获取全部角色
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
public class IAMGetAllRoleCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private IAMGetAllRoleCustomizeServiceMapper iAMGetAllRoleCustomizeServiceMapper;

    public AnonymousStructure_D1F7B77FE76090915A8B00D40711CE1D iAMGetAllRole() {
        AnonymousStructure_D1F7B77FE76090915A8B00D40711CE1D result = new AnonymousStructure_D1F7B77FE76090915A8B00D40711CE1D();
        result = CommonFunctionUtil.createListPage(iAMGetAllRoleCustomizeServiceMapper.getAnonymousStructure_2DEF4ABE7106B802381959043348A3D2(), iAMGetAllRoleCustomizeServiceMapper.countAnonymousStructure_2DEF4ABE7106B802381959043348A3D2().intValue(), AnonymousStructure_D1F7B77FE76090915A8B00D40711CE1D.class); 
        return result;
    } 

}
