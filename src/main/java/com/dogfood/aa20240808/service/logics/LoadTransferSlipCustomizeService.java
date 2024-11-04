package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadTransferSlipCustomizeServiceMapper; 

@Service
public class LoadTransferSlipCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadTransferSlipCustomizeServiceMapper loadTransferSlipCustomizeServiceMapper;
    public String loadTransferSlip() {
        String StringNum = "";
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8DA35266D6FA0C20B8C0F202157B3DD8> variable1 = new ArrayList<>();
        String variable2 = "";
        String result = "";
        variable1 = loadTransferSlipCustomizeServiceMapper.getSql1(); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1), 0L))) {
            StringNum = "1"; 
        } else {
            variable2 = CommonFunctionUtil.get(variable1, (CommonFunctionUtil.length(variable1) - 1L)).documentNumber; 
            StringNum = CommonFunctionUtil.convert((CommonFunctionUtil.convert(CommonFunctionUtil.subString(variable2, 6L, (CommonFunctionUtil.length(variable2) - 6L)), Long.class) + 1L), String.class); 
        } 

        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("-000000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("-00000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("-0000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 4L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("-000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 5L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("-00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 6L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("-0")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else {
            result = new StringBuilder().append(CommonFunctionUtil.toString("-")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } 

        return result;
    } 


}
