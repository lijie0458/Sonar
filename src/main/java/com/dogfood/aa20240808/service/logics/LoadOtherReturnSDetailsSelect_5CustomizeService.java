package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LoadOtherReturnSDetailsSelect_5CustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadOtherReturnSDetailsSelect_5CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadOtherReturnSDetailsSelect_5CustomizeServiceMapper loadOtherReturnSDetailsSelect_5CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AB0A5EBF6FE0E340A646C7A5F0D62D97 loadOtherReturnSDetailsSelect_5(Long page, Long size, String otherInSCode) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AB0A5EBF6FE0E340A646C7A5F0D62D97 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AB0A5EBF6FE0E340A646C7A5F0D62D97();
        result = CommonFunctionUtil.createListPage(loadOtherReturnSDetailsSelect_5CustomizeServiceMapper.getAnonymousStructure_98440B1FAD10952B517FBB02DA4BFEBF(page, size, otherInSCode), loadOtherReturnSDetailsSelect_5CustomizeServiceMapper.countAnonymousStructure_98440B1FAD10952B517FBB02DA4BFEBF(page, size, otherInSCode).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AB0A5EBF6FE0E340A646C7A5F0D62D97.class); 
        return result;
    } 


}
