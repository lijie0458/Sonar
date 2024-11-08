package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LoadSupplierDetailsBySupplierIdCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 通过supplierId查询供应商详情
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
public class LoadSupplierDetailsBySupplierIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSupplierDetailsBySupplierIdCustomizeServiceMapper loadSupplierDetailsBySupplierIdCustomizeServiceMapper;

    public AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 loadSupplierDetailsBySupplierId(Long supplierId) {
        AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 result = new AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7();
        result = CommonFunctionUtil.createListPage(loadSupplierDetailsBySupplierIdCustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(supplierId), loadSupplierDetailsBySupplierIdCustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(supplierId).intValue(), AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class); 
        return result;
    } 

}
