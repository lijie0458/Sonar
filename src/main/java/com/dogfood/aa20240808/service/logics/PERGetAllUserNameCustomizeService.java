package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.PERGetAllUserNameCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERGetAllUserNameCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERGetAllUserNameCustomizeServiceMapper pERGetAllUserNameCustomizeServiceMapper;
    public List<String> pERGetAllUserName() {
        List<String> result = new ArrayList<>();
        result = pERGetAllUserNameCustomizeServiceMapper.getSql1(); 
        return result;
    } 


}
