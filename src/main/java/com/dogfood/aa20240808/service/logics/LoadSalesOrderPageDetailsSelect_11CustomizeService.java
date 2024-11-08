package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A11AF91CE5BDC8E059810F0AAE38812B; 
import com.dogfood.aa20240808.repository.LoadSalesOrderPageDetailsSelect_11CustomizeServiceMapper; 
import java.util.ArrayList; 
import java.util.List; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 获取当前仓库中所有的物料信息
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
public class LoadSalesOrderPageDetailsSelect_11CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSalesOrderPageDetailsSelect_11CustomizeServiceMapper loadSalesOrderPageDetailsSelect_11CustomizeServiceMapper;

    public List<AnonymousStructure_A11AF91CE5BDC8E059810F0AAE38812B> loadSalesOrderPageDetailsSelect_11(List<String> List, List<Long> param1) {
        List<AnonymousStructure_A11AF91CE5BDC8E059810F0AAE38812B> result = new ArrayList<>();
        result = loadSalesOrderPageDetailsSelect_11CustomizeServiceMapper.getSql1(List, param1); 
        return result;
    } 

}
