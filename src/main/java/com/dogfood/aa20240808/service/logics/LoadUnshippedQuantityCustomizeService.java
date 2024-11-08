package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadUnshippedQuantityCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

/**
 * 根据当前id查询已出库的数量
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
