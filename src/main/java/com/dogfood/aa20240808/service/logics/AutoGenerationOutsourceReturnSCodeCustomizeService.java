package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.AutoGenerationOutsourceReturnSCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class AutoGenerationOutsourceReturnSCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private AutoGenerationOutsourceReturnSCodeCustomizeServiceMapper autoGenerationOutsourceReturnSCodeCustomizeServiceMapper;
    public String autoGenerationOutsourceReturnSCode() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B008B6EA68E34052D6DD5E601C00DF35 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B008B6EA68E34052D6DD5E601C00DF35();
        String variable2 = "";
        String variable3 = "";
        Long num = 0L;
        String numString = "";
        String prefix = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(autoGenerationOutsourceReturnSCodeCustomizeServiceMapper.getAnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170(), autoGenerationOutsourceReturnSCodeCustomizeServiceMapper.countAnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B008B6EA68E34052D6DD5E601C00DF35.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).outsourceReturnStorage.returnCode; 
            variable3 = CommonFunctionUtil.subString(variable2, (CommonFunctionUtil.length(variable2) - 7L), 7L); 
            num = (CommonFunctionUtil.convert(variable3, Long.class) + 1L); 
        } else {
            num = 1L; 
        } 

        numString = CommonFunctionUtil.toString(num); 
        prefix = "JINT"; 
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
