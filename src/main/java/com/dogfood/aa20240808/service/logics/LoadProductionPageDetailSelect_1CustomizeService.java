package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadProductionPageDetailSelect_1CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 领料部门-cmk
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
public class LoadProductionPageDetailSelect_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadProductionPageDetailSelect_1CustomizeServiceMapper loadProductionPageDetailSelect_1CustomizeServiceMapper;

    public List<AnonymousStructure_3421ED028B001C489CD794910A15D0C0> loadProductionPageDetailSelect_1(Long page, Long size) {
        List<AnonymousStructure_3421ED028B001C489CD794910A15D0C0> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadProductionPageDetailSelect_1CustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(page, size), loadProductionPageDetailSelect_1CustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(page, size).intValue(), AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class).list; 
        return result;
    } 

}
