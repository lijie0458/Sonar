package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.GetOtherInSDetailsByCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetOtherInSDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetOtherInSDetailsByCodeCustomizeServiceMapper getOtherInSDetailsByCodeCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A getOtherInSDetailsByCode(String code) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A();
        result = CommonFunctionUtil.createListPage(getOtherInSDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_627D60E768ACE4DD4973B62FA955F62D(code), getOtherInSDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_627D60E768ACE4DD4973B62FA955F62D(code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A.class); 
        return result;
    } 


}
