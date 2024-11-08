package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0A9AC12F27464BEB34E2113F9C452432; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.AutoGenerationOtherReturnSCodeCustomizeServiceMapper; 

/**
 * 自动生成其他入库退回单号-ljl
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
public class AutoGenerationOtherReturnSCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private AutoGenerationOtherReturnSCodeCustomizeServiceMapper autoGenerationOtherReturnSCodeCustomizeServiceMapper;

    public String autoGenerationOtherReturnSCode() {
        AnonymousStructure_0A9AC12F27464BEB34E2113F9C452432 variable1 = new AnonymousStructure_0A9AC12F27464BEB34E2113F9C452432();
        String variable2 = "";
        String variable3 = "";
        Long num = 0L;
        String numString = "";
        String prefix = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(autoGenerationOtherReturnSCodeCustomizeServiceMapper.getAnonymousStructure_CCF83669FF6932F4220A16134A2F3077(), autoGenerationOtherReturnSCodeCustomizeServiceMapper.countAnonymousStructure_CCF83669FF6932F4220A16134A2F3077().intValue(), AnonymousStructure_0A9AC12F27464BEB34E2113F9C452432.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).otherReturnStorage.returnCode; 
            variable3 = CommonFunctionUtil.subString(variable2, (CommonFunctionUtil.length(variable2) - 7L), 7L); 
            num = (CommonFunctionUtil.convert(variable3, Long.class) + 1L); 
        } else {
            num = 1L; 
        } 

        numString = CommonFunctionUtil.toString(num); 
        prefix = "QINT"; 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(prefix)).append(CommonFunctionUtil.toString("000000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(prefix)).append(CommonFunctionUtil.toString("00000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(prefix)).append(CommonFunctionUtil.toString("0000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 4L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(prefix)).append(CommonFunctionUtil.toString("000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 5L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(prefix)).append(CommonFunctionUtil.toString("00")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 6L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(prefix)).append(CommonFunctionUtil.toString("0")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 7L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(prefix)).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else {
            result = "错误"; 
        } 

        return result;
    } 

}
