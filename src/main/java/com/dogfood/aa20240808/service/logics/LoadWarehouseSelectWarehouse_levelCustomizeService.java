package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadWarehouseSelectWarehouse_levelCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB; 
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
public class LoadWarehouseSelectWarehouse_levelCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadWarehouseSelectWarehouse_levelCustomizeServiceMapper loadWarehouseSelectWarehouse_levelCustomizeServiceMapper;

    public AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB loadWarehouseSelectWarehouse_level() {
        AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB result = new AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB();
        result = CommonFunctionUtil.createListPage(loadWarehouseSelectWarehouse_levelCustomizeServiceMapper.getAnonymousStructure_FBDF0236130EE9AC89BCD2B8CB75C869(), loadWarehouseSelectWarehouse_levelCustomizeServiceMapper.countAnonymousStructure_FBDF0236130EE9AC89BCD2B8CB75C869().intValue(), AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB.class); 
        return result;
    } 

}
