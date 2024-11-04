package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.OtherReturnStorageUpdateDataCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class OtherReturnStorageUpdateDataCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private OtherReturnStorageUpdateDataCustomizeServiceMapper otherReturnStorageUpdateDataCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47 otherReturnStorageUpdateData(String otherReturnCode) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47();
        result = CommonFunctionUtil.createListPage(otherReturnStorageUpdateDataCustomizeServiceMapper.getAnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE(otherReturnCode), otherReturnStorageUpdateDataCustomizeServiceMapper.countAnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE(otherReturnCode).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47.class); 
        return result;
    } 


}
