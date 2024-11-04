package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadWarehouseSelectWarehouse_levelCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadWarehouseSelectWarehouse_levelCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadWarehouseSelectWarehouse_levelCustomizeServiceMapper loadWarehouseSelectWarehouse_levelCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB loadWarehouseSelectWarehouse_level() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB();
        result = CommonFunctionUtil.createListPage(loadWarehouseSelectWarehouse_levelCustomizeServiceMapper.getAnonymousStructure_FBDF0236130EE9AC89BCD2B8CB75C869(), loadWarehouseSelectWarehouse_levelCustomizeServiceMapper.countAnonymousStructure_FBDF0236130EE9AC89BCD2B8CB75C869().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B64B037BB9E5F4EF0EB1BA7941C26AEB.class); 
        return result;
    } 


}
