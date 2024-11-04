package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.ProductReturnStorageUpdateDataCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class ProductReturnStorageUpdateDataCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private ProductReturnStorageUpdateDataCustomizeServiceMapper productReturnStorageUpdateDataCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C6669C4944106C618500528DC95920ED productReturnStorageUpdateData(String productReturnCode) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C6669C4944106C618500528DC95920ED result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C6669C4944106C618500528DC95920ED();
        result = CommonFunctionUtil.createListPage(productReturnStorageUpdateDataCustomizeServiceMapper.getAnonymousStructure_3DDDBD014D56BE7B460F5D710BCE1FDF(productReturnCode), productReturnStorageUpdateDataCustomizeServiceMapper.countAnonymousStructure_3DDDBD014D56BE7B460F5D710BCE1FDF(productReturnCode).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C6669C4944106C618500528DC95920ED.class); 
        return result;
    } 


}
