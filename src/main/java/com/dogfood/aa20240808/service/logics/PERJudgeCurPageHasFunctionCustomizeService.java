package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.PERJudgeCurPageHasFunctionCustomizeServiceMapper; 

/**
 * PER-判断当前页面是否有功能
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
public class PERJudgeCurPageHasFunctionCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERJudgeCurPageHasFunctionCustomizeServiceMapper pERJudgeCurPageHasFunctionCustomizeServiceMapper;

    public Boolean pERJudgeCurPageHasFunction(Long pageId) {
        Long tmp = 0L;
        Boolean result = false;
        if ((CommonFunctionUtil.notEquals(pageId, null))) {
            tmp = pERJudgeCurPageHasFunctionCustomizeServiceMapper.getStructure1(pageId); 
            if ((tmp.compareTo(0L) > 0)) {
                result = true; 
            } else {
                result = false; 
            } 

        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数pageId为null"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 

}
