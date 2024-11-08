package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.GetSalesTrendCustomizeServiceMapper; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 得到销售趋势-首页-ljl
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class GetSalesTrendCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetSalesTrendCustomizeServiceMapper getSalesTrendCustomizeServiceMapper;

    public List<AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151> getSalesTrend() {
        List<AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151> result = new ArrayList<>();
        result = getSalesTrendCustomizeServiceMapper.getSql1(); 
        return result;
    } 

}
