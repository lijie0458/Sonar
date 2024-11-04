package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPLoadPermissionResourceListViewCustomizeServiceMapper; 

@Service
public class LCAPLoadPermissionResourceListViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPLoadPermissionResourceListViewCustomizeServiceMapper lCAPLoadPermissionResourceListViewCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92 lCAPLoadPermissionResourceListView(Long page, Long size) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92();
        result = CommonFunctionUtil.createListPage(lCAPLoadPermissionResourceListViewCustomizeServiceMapper.getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(page, size), lCAPLoadPermissionResourceListViewCustomizeServiceMapper.countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92.class); 
        return result;
    } 


}
