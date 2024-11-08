package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPLoadPermissionResourceListViewCustomizeServiceMapper; 

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
public class LCAPLoadPermissionResourceListViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPLoadPermissionResourceListViewCustomizeServiceMapper lCAPLoadPermissionResourceListViewCustomizeServiceMapper;

    public AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92 lCAPLoadPermissionResourceListView(Long page, Long size) {
        AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92 result = new AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92();
        result = CommonFunctionUtil.createListPage(lCAPLoadPermissionResourceListViewCustomizeServiceMapper.getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(page, size), lCAPLoadPermissionResourceListViewCustomizeServiceMapper.countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(page, size).intValue(), AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92.class); 
        return result;
    } 

}
