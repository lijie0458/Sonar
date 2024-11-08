package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadInventoryPageSelect_13MaterialDetailsCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 
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
public class LoadInventoryPageSelect_13MaterialDetailsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadInventoryPageSelect_13MaterialDetailsCustomizeServiceMapper loadInventoryPageSelect_13MaterialDetailsCustomizeServiceMapper;

    public AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445 loadInventoryPageSelect_13MaterialDetails(Long page, Long size) {
        AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445 result = new AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445();
        result = CommonFunctionUtil.createListPage(loadInventoryPageSelect_13MaterialDetailsCustomizeServiceMapper.getAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(page, size), loadInventoryPageSelect_13MaterialDetailsCustomizeServiceMapper.countAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(page, size).intValue(), AnonymousStructure_F0A6AD1F847998046703F6AA6DBF4445.class); 
        return result;
    } 

}
