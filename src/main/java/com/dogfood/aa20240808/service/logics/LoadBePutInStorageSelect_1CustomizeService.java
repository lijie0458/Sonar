package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadBePutInStorageSelect_1CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3; 

/**
 * 选择仓库逻辑
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
public class LoadBePutInStorageSelect_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadBePutInStorageSelect_1CustomizeServiceMapper loadBePutInStorageSelect_1CustomizeServiceMapper;

    public List<AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> loadBePutInStorageSelect_1(Long page, Long size) {
        List<AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadBePutInStorageSelect_1CustomizeServiceMapper.getAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(page, size), loadBePutInStorageSelect_1CustomizeServiceMapper.countAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(page, size).intValue(), AnonymousStructure_D68ADEA2FD6A42F4478E1BA20619B4E3.class).list; 
        return result;
    } 

}
