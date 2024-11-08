package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.LoadTotalQuantity2CustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询累计退货数量
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
public class LoadTotalQuantity2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadTotalQuantity2CustomizeServiceMapper loadTotalQuantity2CustomizeServiceMapper;

    public Long loadTotalQuantity2(Long id, String code, String batchNumber) {
        Long result = 0L;
        result = loadTotalQuantity2CustomizeServiceMapper.getStructure1(code, id, batchNumber); 
        return result;
    } 

}
