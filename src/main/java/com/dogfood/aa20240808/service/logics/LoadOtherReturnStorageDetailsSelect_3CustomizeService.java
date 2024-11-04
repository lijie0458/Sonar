package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadOtherReturnStorageDetailsSelect_3CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadOtherReturnStorageDetailsSelect_3CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadOtherReturnStorageDetailsSelect_3CustomizeServiceMapper loadOtherReturnStorageDetailsSelect_3CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA loadOtherReturnStorageDetailsSelect_3(Long page, Long size, Boolean isUpdate) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA();
        result = CommonFunctionUtil.createListPage(loadOtherReturnStorageDetailsSelect_3CustomizeServiceMapper.getAnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401(page, size, isUpdate), loadOtherReturnStorageDetailsSelect_3CustomizeServiceMapper.countAnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401(page, size, isUpdate).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA.class); 
        return result;
    } 


}
