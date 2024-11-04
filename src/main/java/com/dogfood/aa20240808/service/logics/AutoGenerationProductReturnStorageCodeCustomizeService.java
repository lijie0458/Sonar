package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.AutoGenerationProductReturnStorageCodeCustomizeServiceMapper; 

@Service
public class AutoGenerationProductReturnStorageCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private AutoGenerationProductReturnStorageCodeCustomizeServiceMapper autoGenerationProductReturnStorageCodeCustomizeServiceMapper;
    public String autoGenerationProductReturnStorageCode() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_222A592951B41AD41E51F912E2ACC192 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_222A592951B41AD41E51F912E2ACC192();
        String variable2 = "";
        String variable3 = "";
        Long num = 0L;
        String numString = "";
        String prefix = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(autoGenerationProductReturnStorageCodeCustomizeServiceMapper.getAnonymousStructure_4279DFF44F3D43DF96B3CEDD216313A9(), autoGenerationProductReturnStorageCodeCustomizeServiceMapper.countAnonymousStructure_4279DFF44F3D43DF96B3CEDD216313A9().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_222A592951B41AD41E51F912E2ACC192.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).productReturnStorage.productReturnCode; 
            variable3 = CommonFunctionUtil.subString(variable2, (CommonFunctionUtil.length(variable2) - 7L), 7L); 
            num = (CommonFunctionUtil.convert(variable3, Long.class) + 1L); 
        } else {
            num = 1L; 
        } 

        numString = CommonFunctionUtil.toString(num); 
        prefix = "CINT"; 
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
