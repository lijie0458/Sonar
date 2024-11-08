package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.PERJudgeOrgHasUserCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * PER-判断组织下是否有用户
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
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
