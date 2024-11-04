package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadPurchaseRequestCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadPurchaseRequestCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadPurchaseRequestCustomizeServiceMapper loadPurchaseRequestCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76 loadPurchaseRequest(List<String> Code) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76();
        result = CommonFunctionUtil.createListPage(loadPurchaseRequestCustomizeServiceMapper.getAnonymousStructure_01111CA3E3650D568675CF6F150A301E(Code), loadPurchaseRequestCustomizeServiceMapper.countAnonymousStructure_01111CA3E3650D568675CF6F150A301E(Code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76.class); 
        return result;
    } 


}
