package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadPurchaseRequestcountCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6DA269AB370A5461E2D5B972914D4E4; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 点击下订单查询可以选择的物料总数
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
public class LoadPurchaseRequestcountCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadPurchaseRequestcountCustomizeServiceMapper loadPurchaseRequestcountCustomizeServiceMapper;

    public AnonymousStructure_E6DA269AB370A5461E2D5B972914D4E4 loadPurchaseRequestcount(List<Long> Code) {
        AnonymousStructure_E6DA269AB370A5461E2D5B972914D4E4 result = new AnonymousStructure_E6DA269AB370A5461E2D5B972914D4E4();
        result = CommonFunctionUtil.createListPage(loadPurchaseRequestcountCustomizeServiceMapper.getAnonymousStructure_93C34739441EB8F4AE7F54EB8CA28354(Code), loadPurchaseRequestcountCustomizeServiceMapper.countAnonymousStructure_93C34739441EB8F4AE7F54EB8CA28354(Code).intValue(), AnonymousStructure_E6DA269AB370A5461E2D5B972914D4E4.class); 
        return result;
    } 

}
