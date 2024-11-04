package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadPurchaseRequestDetailsSelectPurchaseRequestCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadPurchaseRequestDetailsSelectPurchaseRequestCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadPurchaseRequestDetailsSelectPurchaseRequestCustomizeServiceMapper loadPurchaseRequestDetailsSelectPurchaseRequestCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B loadPurchaseRequestDetailsSelectPurchaseRequest(Long page, Long size) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B();
        result = CommonFunctionUtil.createListPage(loadPurchaseRequestDetailsSelectPurchaseRequestCustomizeServiceMapper.getAnonymousStructure_7F3F9816C439A138B8DD4078A49BCBFF(page, size), loadPurchaseRequestDetailsSelectPurchaseRequestCustomizeServiceMapper.countAnonymousStructure_7F3F9816C439A138B8DD4078A49BCBFF(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B.class); 
        return result;
    } 


}
