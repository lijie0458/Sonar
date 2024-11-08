package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.AutomaticallyGenerateSupplierDetailsCodeCustomizeServiceMapper; 

/**
 * 自动生成供应商编号后四位-ljl
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
public class AutomaticallyGenerateSupplierDetailsCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private AutomaticallyGenerateSupplierDetailsCodeCustomizeServiceMapper automaticallyGenerateSupplierDetailsCodeCustomizeServiceMapper;

    public String automaticallyGenerateSupplierDetailsCode(String code) {
        Long num = 0L;
        String StringNum = "";
        AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 variable1 = new AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7();
        String variable2 = "";
        String result = "";
        variable1 = CommonFunctionUtil.createListPage(automaticallyGenerateSupplierDetailsCodeCustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(), automaticallyGenerateSupplierDetailsCodeCustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34().intValue(), AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            num = CommonFunctionUtil.convert(CommonFunctionUtil.get(variable1.list, 0L).supplierDetails.supplier_code, Long.class); 
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
