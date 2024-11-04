package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.GetProductInStorageDetailsByNumCustomizeServiceMapper; 

@Service
public class GetProductInStorageDetailsByNumCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetProductInStorageDetailsByNumCustomizeServiceMapper getProductInStorageDetailsByNumCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_43C4248D3E0D419ADBA05E27680916BA getProductInStorageDetailsByNum(String num) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_43C4248D3E0D419ADBA05E27680916BA result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_43C4248D3E0D419ADBA05E27680916BA();
        result = CommonFunctionUtil.createListPage(getProductInStorageDetailsByNumCustomizeServiceMapper.getAnonymousStructure_DE3F897B0BDAE2532E935544A33C053B(num), getProductInStorageDetailsByNumCustomizeServiceMapper.countAnonymousStructure_DE3F897B0BDAE2532E935544A33C053B(num).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_43C4248D3E0D419ADBA05E27680916BA.class); 
        return result;
    } 


}
