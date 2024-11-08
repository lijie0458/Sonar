package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadPurchaseRequestOrderCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 点击下订单查询可以选择的物料
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
public class LoadPurchaseRequestOrderCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadPurchaseRequestOrderCustomizeServiceMapper loadPurchaseRequestOrderCustomizeServiceMapper;

    public AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76 loadPurchaseRequestOrder(List<Long> Code) {
        AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76 result = new AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76();
        result = CommonFunctionUtil.createListPage(loadPurchaseRequestOrderCustomizeServiceMapper.getAnonymousStructure_01111CA3E3650D568675CF6F150A301E(Code), loadPurchaseRequestOrderCustomizeServiceMapper.countAnonymousStructure_01111CA3E3650D568675CF6F150A301E(Code).intValue(), AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76.class); 
        return result;
    } 

}
