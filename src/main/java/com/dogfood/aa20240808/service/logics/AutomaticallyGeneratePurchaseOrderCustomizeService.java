package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.AutomaticallyGeneratePurchaseOrderCustomizeServiceMapper; 

/**
 * 自动生成采购申请编号-ljl
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
public class AutomaticallyGeneratePurchaseOrderCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private AutomaticallyGeneratePurchaseOrderCustomizeServiceMapper automaticallyGeneratePurchaseOrderCustomizeServiceMapper;

    public String automaticallyGeneratePurchaseOrder() {
        String StringNum = "";
        AnonymousStructure_4A4BC80E26CB6B7890015021F634885B variable1 = new AnonymousStructure_4A4BC80E26CB6B7890015021F634885B();
        Long num = 0L;
        String variable2 = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(automaticallyGeneratePurchaseOrderCustomizeServiceMapper.getAnonymousStructure_7F3F9816C439A138B8DD4078A49BCBFF(), automaticallyGeneratePurchaseOrderCustomizeServiceMapper.countAnonymousStructure_7F3F9816C439A138B8DD4078A49BCBFF().intValue(), AnonymousStructure_4A4BC80E26CB6B7890015021F634885B.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.get(variable1.list, 0L).purchaseRequest.requestNumber; 
            num = CommonFunctionUtil.convert(CommonFunctionUtil.subString(variable2, (CommonFunctionUtil.length(variable2) - 4L), 4L), Long.class); 
        } else {
            num = 0L; 
        } 

        StringNum = CommonFunctionUtil.convert((num + 1L), String.class); 
        if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 1L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("000")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 2L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("00")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(StringNum), 3L))) {
            result = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString("0")).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } else {
            result = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.formatDate(CommonFunctionUtil.currDate("global"), "yyyyMMdd"))).append(CommonFunctionUtil.toString(StringNum)).toString(); 
        } 

        return result;
    } 

}
