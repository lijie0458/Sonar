package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeServiceMapper loadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3 loadBePutInStorageListSelect_3Warehouse_levelTwo(Long page, Long size) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3();
        result = CommonFunctionUtil.createListPage(loadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeServiceMapper.getAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(page, size), loadBePutInStorageListSelect_3Warehouse_levelTwoCustomizeServiceMapper.countAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3.class); 
        return result;
    } 


}
