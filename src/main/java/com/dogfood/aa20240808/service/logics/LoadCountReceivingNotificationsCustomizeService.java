package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadCountReceivingNotificationsCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F6C9B32C78FC00A2E7FD3832ABA02CCB; 

/**
 * 查询当前收货条数，创建采购申请用作单号
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
public class LoadCountReceivingNotificationsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadCountReceivingNotificationsCustomizeServiceMapper loadCountReceivingNotificationsCustomizeServiceMapper;

    public String loadCountReceivingNotifications() {
        String StringNum = "";
        String DateTime = "";
        List<AnonymousStructure_F6C9B32C78FC00A2E7FD3832ABA02CCB> variable1 = new ArrayList<>();
        AnonymousStructure_F6C9B32C78FC00A2E7FD3832ABA02CCB variable2 = new AnonymousStructure_F6C9B32C78FC00A2E7FD3832ABA02CCB();
        String result = "";
        DateTime = new StringBuilder().append(CommonFunctionUtil.toString("DD")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).toString(); 
        variable1 = loadCountReceivingNotificationsCustomizeServiceMapper.getSql1(DateTime); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1), 0L))) {
            StringNum = "1"; 
        } else {
            variable2 = CommonFunctionUtil.get(variable1, (CommonFunctionUtil.length(variable1) - 1L)); 
            StringNum = CommonFunctionUtil.convert((CommonFunctionUtil.convert(CommonFunctionUtil.subString(variable2.notificationId, 11L, CommonFunctionUtil.length(variable2.notificationId)), Long.class) + 1L), String.class); 
        } 

        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("DD")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("DD")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString("DD")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-0")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else {
            result = new StringBuilder().append(CommonFunctionUtil.toString("DD")).append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("-")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } 

        return result;
    } 

}
