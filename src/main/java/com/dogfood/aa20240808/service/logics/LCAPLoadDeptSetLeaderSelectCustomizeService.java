package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LCAPLoadDeptSetLeaderSelectCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 设置部门主管下拉选择器数据
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
public class LCAPLoadDeptSetLeaderSelectCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPLoadDeptSetLeaderSelectCustomizeServiceMapper lCAPLoadDeptSetLeaderSelectCustomizeServiceMapper;

    public AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E lCAPLoadDeptSetLeaderSelect(Long page, Long size, String deptId) {
        AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E result = new AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E();
        result = CommonFunctionUtil.createListPage(lCAPLoadDeptSetLeaderSelectCustomizeServiceMapper.getAnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA(page, size, deptId), lCAPLoadDeptSetLeaderSelectCustomizeServiceMapper.countAnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA(page, size, deptId).intValue(), AnonymousStructure_C477D5E68C0A882A877BCEEA4EA2DE1E.class); 
        return result;
    } 

}
