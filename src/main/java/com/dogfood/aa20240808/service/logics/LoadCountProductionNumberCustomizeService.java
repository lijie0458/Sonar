package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadCountProductionNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadCountProductionNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadCountProductionNumberCustomizeServiceMapper loadCountProductionNumberCustomizeServiceMapper;
    public String loadCountProductionNumber(DistinctionEnumEnum DistinctionEnum) {
        String StringNum = "";
        String DateTime = "";
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        String variable2 = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(loadCountProductionNumberCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(DistinctionEnum), loadCountProductionNumberCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(DistinctionEnum).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        if ((CommonFunctionUtil.equals(variable1.total, 0L))) {
            StringNum = "1"; 
        } else {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).productionMaterialRequisition.documentNumber; 
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
