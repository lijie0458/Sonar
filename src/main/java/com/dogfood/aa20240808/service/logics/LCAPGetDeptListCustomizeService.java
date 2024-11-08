package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LCAPGetDeptListCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202; 

/**
 * 获取所有部门列表
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
public class LCAPGetDeptListCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPGetDeptListCustomizeServiceMapper lCAPGetDeptListCustomizeServiceMapper;

    public List<AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202> lCAPGetDeptList(String deptId, Long isUpdate) {
        List<AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202> result = new ArrayList<>();
        if ((CommonFunctionUtil.hasValue(isUpdate) && (CommonFunctionUtil.equals(isUpdate, 1L)))) {
            result = lCAPGetDeptListCustomizeServiceMapper.getAnonymousStructure_FF3D47421C85AD91C2FDAE6821984202(deptId); 
        } else {
            result = lCAPGetDeptListCustomizeServiceMapper.getAnonymousStructure_FF3D47421C85AD91C2FDAE68219842021(); 
        } 

        return result;
    } 

}
