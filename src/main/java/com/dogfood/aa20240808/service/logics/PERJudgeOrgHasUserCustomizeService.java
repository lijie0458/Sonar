package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.PERJudgeOrgHasUserCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERJudgeOrgHasUserCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERJudgeOrgHasUserCustomizeServiceMapper pERJudgeOrgHasUserCustomizeServiceMapper;
    public Boolean pERJudgeOrgHasUser(Long orgId) {
        Long tmp = 0L;
        Boolean result = false;
        tmp = pERJudgeOrgHasUserCustomizeServiceMapper.getSql1(orgId); 
        if ((tmp.compareTo(0L) > 0)) {
            result = true; 
        } else {
            result = false; 
        } 

        return result;
    } 


}
