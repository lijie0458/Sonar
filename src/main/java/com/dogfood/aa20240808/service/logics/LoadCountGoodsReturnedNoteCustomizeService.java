package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadCountGoodsReturnedNoteCustomizeServiceMapper; 

@Service
public class LoadCountGoodsReturnedNoteCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadCountGoodsReturnedNoteCustomizeServiceMapper loadCountGoodsReturnedNoteCustomizeServiceMapper;
    public String loadCountGoodsReturnedNote() {
        String StringNum = "";
        String DateTime = "";
        String result = "";
        DateTime = new StringBuilder().append(CommonFunctionUtil.toString("PO")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).toString(); 
        StringNum = CommonFunctionUtil.convert((loadCountGoodsReturnedNoteCustomizeServiceMapper.getSql1(DateTime) + 1L), String.class); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("PO")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("PO")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("PO")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-0")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else {
            result = new StringBuilder().append(CommonFunctionUtil.toString("PO")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } 

        return result;
    } 


}
