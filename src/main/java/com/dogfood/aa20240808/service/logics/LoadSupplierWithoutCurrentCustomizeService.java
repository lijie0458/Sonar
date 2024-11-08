package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadSupplierWithoutCurrentCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询除当前分类以外的所有分类
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
public class LoadSupplierWithoutCurrentCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSupplierWithoutCurrentCustomizeServiceMapper loadSupplierWithoutCurrentCustomizeServiceMapper;

    public AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4 loadSupplierWithoutCurrent(Long currentSupplierId) {
        AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4 result = new AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4();
        result = CommonFunctionUtil.createListPage(loadSupplierWithoutCurrentCustomizeServiceMapper.getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(currentSupplierId), loadSupplierWithoutCurrentCustomizeServiceMapper.countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(currentSupplierId).intValue(), AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4.class); 
        return result;
    } 

}
