package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.PERJudgeOrgHasChildrenCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERJudgeOrgHasChildrenCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERJudgeOrgHasChildrenCustomizeServiceMapper pERJudgeOrgHasChildrenCustomizeServiceMapper;
    public Boolean pERJudgeOrgHasChildren(Long id) {
        Long childrenNum = 0L;
        Boolean result = false;
        if ((CommonFunctionUtil.notEquals(id, null))) {
            childrenNum = pERJudgeOrgHasChildrenCustomizeServiceMapper.getSql1(id); 
            if ((childrenNum.compareTo(0L) > 0)) {
                result = true; 
            } else {
                result = false; 
            } 

        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数为null"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 


}
