package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.GetMaterialCodeCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetMaterialCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetMaterialCodeCustomizeServiceMapper getMaterialCodeCustomizeServiceMapper;
    public Boolean getMaterialCode(String materialCode) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC> variable1 = new ArrayList<>();
        Boolean result = false;
        variable1 = getMaterialCodeCustomizeServiceMapper.getAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(materialCode); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1), 0L))) {
            result = false; 
        } else {
            result = true; 
        } 

        return result;
    } 


}
