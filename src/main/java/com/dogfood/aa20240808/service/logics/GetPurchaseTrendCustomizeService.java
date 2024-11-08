package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.GetPurchaseTrendCustomizeServiceMapper; 

/**
 * 得到采购趋势-首页-ljl
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
public class GetPurchaseTrendCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetPurchaseTrendCustomizeServiceMapper getPurchaseTrendCustomizeServiceMapper;

    public List<AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151> getPurchaseTrend() {
        List<AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151> result = new ArrayList<>();
        result = getPurchaseTrendCustomizeServiceMapper.getSql1(); 
        return result;
    } 

}
