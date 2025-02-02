package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadProductReturnStorageDetailsSelect_1CustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadProductReturnStorageDetailsSelect_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadProductReturnStorageDetailsSelect_1CustomizeServiceMapper loadProductReturnStorageDetailsSelect_1CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1416F1A429B2FBD7D325ACBFB771EF7 loadProductReturnStorageDetailsSelect_1(Long page, Long size, Boolean isUpdate) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1416F1A429B2FBD7D325ACBFB771EF7 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1416F1A429B2FBD7D325ACBFB771EF7();
        result = CommonFunctionUtil.createListPage(loadProductReturnStorageDetailsSelect_1CustomizeServiceMapper.getAnonymousStructure_742E48DFC5C3FE76DFBCFC5AEB7FA442(page, size, isUpdate), loadProductReturnStorageDetailsSelect_1CustomizeServiceMapper.countAnonymousStructure_742E48DFC5C3FE76DFBCFC5AEB7FA442(page, size, isUpdate).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D1416F1A429B2FBD7D325ACBFB771EF7.class); 
        return result;
    } 


}
