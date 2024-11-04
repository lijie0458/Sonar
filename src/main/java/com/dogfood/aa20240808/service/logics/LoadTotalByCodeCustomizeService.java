package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadTotalByCodeCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class LoadTotalByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadTotalByCodeCustomizeServiceMapper loadTotalByCodeCustomizeServiceMapper;
    public BigDecimal loadTotalByCode(String param1) {
        BigDecimal result = BigDecimal.ZERO;
        result = loadTotalByCodeCustomizeServiceMapper.getSql1(param1); 
        return result;
    } 


}
