package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadTotalQuantity1CustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadTotalQuantity1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadTotalQuantity1CustomizeServiceMapper loadTotalQuantity1CustomizeServiceMapper;
    public Long loadTotalQuantity1(Long id, String code) {
        Long result = 0L;
        result = loadTotalQuantity1CustomizeServiceMapper.getStructure1(code, id); 
        return result;
    } 


}
