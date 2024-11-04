package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.LoadSalesOrderPageSelect_11CustomerManagementCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadSalesOrderPageSelect_11CustomerManagementCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadSalesOrderPageSelect_11CustomerManagementCustomizeServiceMapper loadSalesOrderPageSelect_11CustomerManagementCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1> loadSalesOrderPageSelect_11CustomerManagement(Long page, Long size) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadSalesOrderPageSelect_11CustomerManagementCustomizeServiceMapper.getAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(page, size), loadSalesOrderPageSelect_11CustomerManagementCustomizeServiceMapper.countAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7.class).list; 
        return result;
    } 


}
