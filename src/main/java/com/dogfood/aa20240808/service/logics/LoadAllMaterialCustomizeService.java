package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadAllMaterialCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询全部的分类，创建分类使用
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
public class LoadAllMaterialCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadAllMaterialCustomizeServiceMapper loadAllMaterialCustomizeServiceMapper;

    public AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C loadAllMaterial() {
        AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C result = new AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C();
        result = CommonFunctionUtil.createListPage(loadAllMaterialCustomizeServiceMapper.getAnonymousStructure_988572FC06FE621688549C0BC53D9030(), loadAllMaterialCustomizeServiceMapper.countAnonymousStructure_988572FC06FE621688549C0BC53D9030().intValue(), AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C.class); 
        return result;
    } 

}
