package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_950B930A01B608CCA173536BB93CD694; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.AutoGenerteOtherInSCodeCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 自动生成其他入库单号-ljl
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
public class AutoGenerteOtherInSCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private AutoGenerteOtherInSCodeCustomizeServiceMapper autoGenerteOtherInSCodeCustomizeServiceMapper;

    public String autoGenerteOtherInSCode() {
        AnonymousStructure_950B930A01B608CCA173536BB93CD694 variable1 = new AnonymousStructure_950B930A01B608CCA173536BB93CD694();
        Long num = 0L;
        String variable2 = "";
        String numString = "";
        String prefix = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(autoGenerteOtherInSCodeCustomizeServiceMapper.getAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(), autoGenerteOtherInSCodeCustomizeServiceMapper.countAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119().intValue(), AnonymousStructure_950B930A01B608CCA173536BB93CD694.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).otherInStorage.code; 
            num = CommonFunctionUtil.convert(CommonFunctionUtil.subString(variable2, (CommonFunctionUtil.length(variable2) - 7L), 7L), Long.class); 
            num = (num + 1L); 
        } else {
            num = 1L; 
        } 

        numString = CommonFunctionUtil.toString(num); 
        prefix = "QIN"; 
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
