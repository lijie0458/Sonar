package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadquantityShippedByDetailsIdCustomizeServiceMapper; 

@Service
public class LoadquantityShippedByDetailsIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadquantityShippedByDetailsIdCustomizeServiceMapper loadquantityShippedByDetailsIdCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626> loadquantityShippedByDetailsId() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626> result = new ArrayList<>();
        result = loadquantityShippedByDetailsIdCustomizeServiceMapper.getSql1(); 
        return result;
    } 


}
