package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadMaterialSelectMaterialCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

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
public class LoadMaterialSelectMaterialCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadMaterialSelectMaterialCustomizeServiceMapper loadMaterialSelectMaterialCustomizeServiceMapper;

    public AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C loadMaterialSelectMaterial(Long page, Long size) {
        AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C result = new AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C();
        result = CommonFunctionUtil.createListPage(loadMaterialSelectMaterialCustomizeServiceMapper.getAnonymousStructure_988572FC06FE621688549C0BC53D9030(page, size), loadMaterialSelectMaterialCustomizeServiceMapper.countAnonymousStructure_988572FC06FE621688549C0BC53D9030(page, size).intValue(), AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C.class); 
        return result;
    } 

}
