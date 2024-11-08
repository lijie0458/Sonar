package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C; 
import com.dogfood.aa20240808.repository.GetMaterialByIdListCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据父级idList拿到物料分类的子级信息
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
public class GetMaterialByIdListCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetMaterialByIdListCustomizeServiceMapper getMaterialByIdListCustomizeServiceMapper;

    public AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C getMaterialByIdList(List<Long> idList) {
        AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C result = new AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C();
        result = CommonFunctionUtil.createListPage(getMaterialByIdListCustomizeServiceMapper.getAnonymousStructure_988572FC06FE621688549C0BC53D9030(idList), getMaterialByIdListCustomizeServiceMapper.countAnonymousStructure_988572FC06FE621688549C0BC53D9030(idList).intValue(), AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C.class); 
        return result;
    } 

}
