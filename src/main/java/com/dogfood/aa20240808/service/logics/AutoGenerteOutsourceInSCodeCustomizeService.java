package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.AutoGenerteOutsourceInSCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 自动生成委外加工入库单号-ljl
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
public class AutoGenerteOutsourceInSCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private AutoGenerteOutsourceInSCodeCustomizeServiceMapper autoGenerteOutsourceInSCodeCustomizeServiceMapper;

    public String autoGenerteOutsourceInSCode() {
        AnonymousStructure_CFD50F605260F493CE058FD3BD746735 variable1 = new AnonymousStructure_CFD50F605260F493CE058FD3BD746735();
        Long num = 0L;
        String variable2 = "";
        String numString = "";
        String prefix = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(autoGenerteOutsourceInSCodeCustomizeServiceMapper.getAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(), autoGenerteOutsourceInSCodeCustomizeServiceMapper.countAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF().intValue(), AnonymousStructure_CFD50F605260F493CE058FD3BD746735.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).outsourceInStorage.code; 
            num = CommonFunctionUtil.convert(CommonFunctionUtil.subString(variable2, (CommonFunctionUtil.length(variable2) - 7L), 7L), Long.class); 
            num = (num + 1L); 
        } else {
            num = 1L; 
        } 

        numString = CommonFunctionUtil.toString(num); 
        prefix = "JIN"; 
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
