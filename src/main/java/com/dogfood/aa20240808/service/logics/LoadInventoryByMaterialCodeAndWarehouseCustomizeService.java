package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadInventoryByMaterialCodeAndWarehouseCustomizeServiceMapper; 

@Service
public class LoadInventoryByMaterialCodeAndWarehouseCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadInventoryByMaterialCodeAndWarehouseCustomizeServiceMapper loadInventoryByMaterialCodeAndWarehouseCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> loadInventoryByMaterialCodeAndWarehouse(String materialCode, Long warehouse, String lotNumber, Long location) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> result = new ArrayList<>();
        result = loadInventoryByMaterialCodeAndWarehouseCustomizeServiceMapper.getSql1(materialCode, location, lotNumber, warehouse); 
        return result;
    } 


}
