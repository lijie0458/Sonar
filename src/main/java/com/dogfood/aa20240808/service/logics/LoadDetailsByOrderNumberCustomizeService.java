package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadDetailsByOrderNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C; 

/**
 * 陈明阔-更新占用库存是通过订单号查到详情信息
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
public class LoadDetailsByOrderNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadDetailsByOrderNumberCustomizeServiceMapper loadDetailsByOrderNumberCustomizeServiceMapper;

    public AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C loadDetailsByOrderNumber(String orderNumber) {
        AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C result = new AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C();
        result = CommonFunctionUtil.createListPage(loadDetailsByOrderNumberCustomizeServiceMapper.getAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(orderNumber), loadDetailsByOrderNumberCustomizeServiceMapper.countAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(orderNumber).intValue(), AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C.class); 
        return result;
    } 

}
