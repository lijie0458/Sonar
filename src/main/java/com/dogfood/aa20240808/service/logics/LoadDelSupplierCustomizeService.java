package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadDelSupplierCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadDelSupplierCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadDelSupplierCustomizeServiceMapper loadDelSupplierCustomizeServiceMapper;
    public Boolean loadDelSupplier(Long param1) {
        Boolean result = false;
        if ((CommonFunctionUtil.createListPage(loadDelSupplierCustomizeServiceMapper.getAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(param1), loadDelSupplierCustomizeServiceMapper.countAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B.class).total.compareTo(0L) > 0)) {
            result = true; 
        } else {
        } 

        return result;
    } 


}
