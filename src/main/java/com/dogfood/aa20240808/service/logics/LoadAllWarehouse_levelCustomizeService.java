package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadAllWarehouse_levelCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询全部一级仓库
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
public class LoadAllWarehouse_levelCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadAllWarehouse_levelCustomizeServiceMapper loadAllWarehouse_levelCustomizeServiceMapper;

    public AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB loadAllWarehouse_level() {
        AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB result = new AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB();
        result = CommonFunctionUtil.createListPage(loadAllWarehouse_levelCustomizeServiceMapper.getAnonymousStructure_FBDF0236130EE9AC89BCD2B8CB75C869(), loadAllWarehouse_levelCustomizeServiceMapper.countAnonymousStructure_FBDF0236130EE9AC89BCD2B8CB75C869().intValue(), AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB.class); 
        return result;
    } 

}
