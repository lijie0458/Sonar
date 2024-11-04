package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadOutsourceReturnStorageDetailsSelect_2CustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadOutsourceReturnStorageDetailsSelect_2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadOutsourceReturnStorageDetailsSelect_2CustomizeServiceMapper loadOutsourceReturnStorageDetailsSelect_2CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA loadOutsourceReturnStorageDetailsSelect_2(Long page, Long size, Boolean isUpdate) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA();
        result = CommonFunctionUtil.createListPage(loadOutsourceReturnStorageDetailsSelect_2CustomizeServiceMapper.getAnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401(page, size, isUpdate), loadOutsourceReturnStorageDetailsSelect_2CustomizeServiceMapper.countAnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401(page, size, isUpdate).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D0676F3E420D7085CFD3BE92EA0925FA.class); 
        return result;
    } 


}
