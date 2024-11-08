package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadPurchaseOrderSelectSupplierDetailsCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7; 
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
public class LoadPurchaseOrderSelectSupplierDetailsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadPurchaseOrderSelectSupplierDetailsCustomizeServiceMapper loadPurchaseOrderSelectSupplierDetailsCustomizeServiceMapper;

    public List<AnonymousStructure_E310A9D695F45E4453B876CB739D4C34> loadPurchaseOrderSelectSupplierDetails(Long page, Long size) {
        List<AnonymousStructure_E310A9D695F45E4453B876CB739D4C34> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadPurchaseOrderSelectSupplierDetailsCustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(page, size), loadPurchaseOrderSelectSupplierDetailsCustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(page, size).intValue(), AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class).list; 
        return result;
    } 

}
