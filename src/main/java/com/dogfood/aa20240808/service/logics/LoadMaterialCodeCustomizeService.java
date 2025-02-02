package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadMaterialCodeCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadMaterialCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadMaterialCodeCustomizeServiceMapper loadMaterialCodeCustomizeServiceMapper;
    public Boolean loadMaterialCode(String code) {
        List<String> variable1 = new ArrayList<>();
        Boolean result = false;
        variable1 = loadMaterialCodeCustomizeServiceMapper.getSql1(); 
        result = CommonFunctionUtil.contains(variable1, code); 
        return result;
    } 


}
