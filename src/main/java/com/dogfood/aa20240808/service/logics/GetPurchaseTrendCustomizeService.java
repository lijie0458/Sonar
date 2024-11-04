package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.GetPurchaseTrendCustomizeServiceMapper; 

@Service
public class GetPurchaseTrendCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetPurchaseTrendCustomizeServiceMapper getPurchaseTrendCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151> getPurchaseTrend() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151> result = new ArrayList<>();
        result = getPurchaseTrendCustomizeServiceMapper.getSql1(); 
        return result;
    } 


}
