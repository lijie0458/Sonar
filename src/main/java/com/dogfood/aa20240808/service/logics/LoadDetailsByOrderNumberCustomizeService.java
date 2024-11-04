package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadDetailsByOrderNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadDetailsByOrderNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadDetailsByOrderNumberCustomizeServiceMapper loadDetailsByOrderNumberCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C loadDetailsByOrderNumber(String orderNumber) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C();
        result = CommonFunctionUtil.createListPage(loadDetailsByOrderNumberCustomizeServiceMapper.getAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(orderNumber), loadDetailsByOrderNumberCustomizeServiceMapper.countAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(orderNumber).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C.class); 
        return result;
    } 


}
