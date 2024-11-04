package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadCountBePutInStorageCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadCountBePutInStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadCountBePutInStorageCustomizeServiceMapper loadCountBePutInStorageCustomizeServiceMapper;
    public String loadCountBePutInStorage() {
        String StringNum = "";
        String DateTime = "";
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4CEE0E97896F6CC84687108D2DB0952B> variable1 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4CEE0E97896F6CC84687108D2DB0952B variable2 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4CEE0E97896F6CC84687108D2DB0952B();
        String result = "";
        DateTime = new StringBuilder().append(CommonFunctionUtil.toString("WIN")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).toString(); 
        variable1 = loadCountBePutInStorageCustomizeServiceMapper.getSql1(DateTime); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1), 0L))) {
            StringNum = "1"; 
        } else {
            variable2 = CommonFunctionUtil.get(variable1, (CommonFunctionUtil.length(variable1) - 1L)); 
            LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(variable2)).toString()));
            StringNum = CommonFunctionUtil.convert((CommonFunctionUtil.convert(CommonFunctionUtil.subString(variable2.bePutInStorageId, 12L, CommonFunctionUtil.length(variable2.bePutInStorageId)), Long.class) + 1L), String.class); 
        } 

        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("WIN")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("WIN")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("WIN")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-0")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else {
            result = new StringBuilder().append(CommonFunctionUtil.toString("WIN")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } 

        return result;
    } 


}
