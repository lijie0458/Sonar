package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadSalesOrderPageDetailsSelect_12CustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 
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
public class LoadSalesOrderPageDetailsSelect_12CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSalesOrderPageDetailsSelect_12CustomizeServiceMapper loadSalesOrderPageDetailsSelect_12CustomizeServiceMapper;

    public List<AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1> loadSalesOrderPageDetailsSelect_12(Long page, Long size) {
        List<AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadSalesOrderPageDetailsSelect_12CustomizeServiceMapper.getAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(page, size), loadSalesOrderPageDetailsSelect_12CustomizeServiceMapper.countAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(page, size).intValue(), AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7.class).list; 
        return result;
    } 

}
