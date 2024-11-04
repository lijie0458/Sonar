package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadProductReturnStorageDetailsSelect_3CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadProductReturnStorageDetailsSelect_3CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadProductReturnStorageDetailsSelect_3CustomizeServiceMapper loadProductReturnStorageDetailsSelect_3CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_81C47AE0C4FBFF20DD913EDAD8D8292C loadProductReturnStorageDetailsSelect_3(Long page, Long size, String num) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_81C47AE0C4FBFF20DD913EDAD8D8292C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_81C47AE0C4FBFF20DD913EDAD8D8292C();
        result = CommonFunctionUtil.createListPage(loadProductReturnStorageDetailsSelect_3CustomizeServiceMapper.getAnonymousStructure_6122FFF7EE63A7C8A589CA1BA02FF87D(num, page, size), loadProductReturnStorageDetailsSelect_3CustomizeServiceMapper.countAnonymousStructure_6122FFF7EE63A7C8A589CA1BA02FF87D(num, page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_81C47AE0C4FBFF20DD913EDAD8D8292C.class); 
        return result;
    } 


}
