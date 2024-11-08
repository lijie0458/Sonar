package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadAllCustomerManagementCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询全部客户
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
public class LoadAllCustomerManagementCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadAllCustomerManagementCustomizeServiceMapper loadAllCustomerManagementCustomizeServiceMapper;

    public AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7 loadAllCustomerManagement() {
        AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7 result = new AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7();
        result = CommonFunctionUtil.createListPage(loadAllCustomerManagementCustomizeServiceMapper.getAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(), loadAllCustomerManagementCustomizeServiceMapper.countAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1().intValue(), AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7.class); 
        return result;
    } 

}
