package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadUnshippedQuantityCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class LoadUnshippedQuantityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadUnshippedQuantityCustomizeServiceMapper loadUnshippedQuantityCustomizeServiceMapper;
    public BigDecimal loadUnshippedQuantity(Long id, Long notid) {
        BigDecimal result = BigDecimal.ZERO;
        result = loadUnshippedQuantityCustomizeServiceMapper.getStructure1(id, notid); 
        return result;
    } 


}
