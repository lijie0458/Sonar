package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.PERGetRoleIdListByUserIdCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERGetRoleIdListByUserIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERGetRoleIdListByUserIdCustomizeServiceMapper pERGetRoleIdListByUserIdCustomizeServiceMapper;
    public List<Long> pERGetRoleIdListByUserId(String userId) {
        List<Long> result = new ArrayList<>();
        result = pERGetRoleIdListByUserIdCustomizeServiceMapper.getSql1(userId); 
        return result;
    } 


}
