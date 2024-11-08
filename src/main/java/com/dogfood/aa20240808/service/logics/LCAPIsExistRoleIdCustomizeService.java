package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LCAPIsExistRoleIdCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70791B893F53C2EFB9E501591763B020; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6; 

/**
 * 
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
public class LCAPIsExistRoleIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPIsExistRoleIdCustomizeServiceMapper lCAPIsExistRoleIdCustomizeServiceMapper;

    public Boolean lCAPIsExistRoleId(Long roleId) {
        AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6 variable1 = new AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6();
        Boolean result = false;
        variable1 = CommonFunctionUtil.createListPage(lCAPIsExistRoleIdCustomizeServiceMapper.getAnonymousStructure_70791B893F53C2EFB9E501591763B020(), lCAPIsExistRoleIdCustomizeServiceMapper.countAnonymousStructure_70791B893F53C2EFB9E501591763B020().intValue(), AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class); 
        result = false; 
        for (Long i = 0L; i < CommonFunctionUtil.length(variable1.list); i++) {
            AnonymousStructure_70791B893F53C2EFB9E501591763B020 item = variable1.list.get(i.intValue());
            if ((CommonFunctionUtil.equals(roleId, item.lCAPRole.id))) {
                result = true; 
            } else {
            } 

        } 

        return result;
    } 

}
