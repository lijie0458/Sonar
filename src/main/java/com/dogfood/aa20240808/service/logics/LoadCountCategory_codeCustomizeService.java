package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadCountCategory_codeCustomizeServiceMapper; 

@Service
public class LoadCountCategory_codeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadCountCategory_codeCustomizeServiceMapper loadCountCategory_codeCustomizeServiceMapper;
    public String loadCountCategory_code(String code) {
        Long num = 0L;
        String StringNum = "";
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445();
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(loadCountCategory_codeCustomizeServiceMapper.getAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(), loadCountCategory_codeCustomizeServiceMapper.countAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            num = CommonFunctionUtil.convert(CommonFunctionUtil.get(variable1.list, 0L).materialDetails.materialCode, Long.class); 
        } else {
            num = 0L; 
        } 

        StringNum = CommonFunctionUtil.convert((num + 1L), String.class); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else {
            result = StringNum; 
        } 

        return result;
    } 


}
