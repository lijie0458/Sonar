package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadCountInventoryTotalByCodeCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class LoadCountInventoryTotalByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadCountInventoryTotalByCodeCustomizeServiceMapper loadCountInventoryTotalByCodeCustomizeServiceMapper;
    public BigDecimal loadCountInventoryTotalByCode(String param1) {
        BigDecimal result = BigDecimal.ZERO;
        result = loadCountInventoryTotalByCodeCustomizeServiceMapper.getSql1(param1); 
        return result;
    } 


}
