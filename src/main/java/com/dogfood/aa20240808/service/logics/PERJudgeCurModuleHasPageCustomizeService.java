package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.PERJudgeCurModuleHasPageCustomizeServiceMapper; 

@Service
public class PERJudgeCurModuleHasPageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERJudgeCurModuleHasPageCustomizeServiceMapper pERJudgeCurModuleHasPageCustomizeServiceMapper;
    public Boolean pERJudgeCurModuleHasPage(Long moduleId) {
        Long tmp = 0L;
        Boolean result = false;
        if ((CommonFunctionUtil.notEquals(moduleId, null))) {
            tmp = pERJudgeCurModuleHasPageCustomizeServiceMapper.getStructure1(moduleId); 
            if ((tmp.compareTo(0L) > 0)) {
                result = true; 
            } else {
                result = false; 
            } 

        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数moduleId为null"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 


}
