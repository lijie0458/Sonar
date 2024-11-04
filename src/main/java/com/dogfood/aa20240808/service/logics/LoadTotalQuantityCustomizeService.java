package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadTotalQuantityCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadTotalQuantityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadTotalQuantityCustomizeServiceMapper loadTotalQuantityCustomizeServiceMapper;
    public Long loadTotalQuantity(Long id, String code) {
        Long result = 0L;
        result = loadTotalQuantityCustomizeServiceMapper.getStructure1(code, id); 
        return result;
    } 


}
