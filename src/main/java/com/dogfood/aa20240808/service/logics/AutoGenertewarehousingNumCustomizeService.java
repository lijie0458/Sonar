package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.AutoGenertewarehousingNumCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 自动生成产品入库单号-ljl
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
public class AutoGenertewarehousingNumCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private AutoGenertewarehousingNumCustomizeServiceMapper autoGenertewarehousingNumCustomizeServiceMapper;

    public String autoGenertewarehousingNum() {
        AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8 variable1 = new AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8();
        Long num = 0L;
        String variable2 = "";
        String numString = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(autoGenertewarehousingNumCustomizeServiceMapper.getAnonymousStructure_B061947A9149609D07E92A50DDC32508(), autoGenertewarehousingNumCustomizeServiceMapper.countAnonymousStructure_B061947A9149609D07E92A50DDC32508().intValue(), AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).productInStorage.num; 
            num = CommonFunctionUtil.convert(CommonFunctionUtil.subString(variable2, (CommonFunctionUtil.length(variable2) - 7L), 7L), Long.class); 
            num = (num + 1L); 
        } else {
            num = 1L; 
        } 

        numString = CommonFunctionUtil.toString(num); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("CIN000000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("CIN00000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("CIN0000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 4L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("CIN000")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 5L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("CIN00")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 6L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("CIN0")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(numString), 7L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("CIN")).append(CommonFunctionUtil.toString(numString)).toString(); 
        } else {
            result = "错误"; 
        } 

        return result;
    } 

}
