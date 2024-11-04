package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadSaleOderByInventoryIdCustomizeServiceMapper; 
import java.util.ArrayList; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadSaleOderByInventoryIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadSaleOderByInventoryIdCustomizeServiceMapper loadSaleOderByInventoryIdCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E4317B835B85F4F0A55543D88FC5FF1> loadSaleOderByInventoryId(List<String> param1) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E4317B835B85F4F0A55543D88FC5FF1> result = new ArrayList<>();
        result = loadSaleOderByInventoryIdCustomizeServiceMapper.getSql1(param1); 
        return result;
    } 


}
