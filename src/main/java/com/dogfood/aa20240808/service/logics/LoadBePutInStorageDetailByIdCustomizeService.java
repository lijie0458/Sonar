package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadBePutInStorageDetailByIdCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据入库单查询明细
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
public class LoadBePutInStorageDetailByIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadBePutInStorageDetailByIdCustomizeServiceMapper loadBePutInStorageDetailByIdCustomizeServiceMapper;

    public AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A loadBePutInStorageDetailById(String param1) {
        AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A result = new AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A();
        result = CommonFunctionUtil.createListPage(loadBePutInStorageDetailByIdCustomizeServiceMapper.getAnonymousStructure_FBC19D3E627714EA9E439E295A9EA7AD(param1), loadBePutInStorageDetailByIdCustomizeServiceMapper.countAnonymousStructure_FBC19D3E627714EA9E439E295A9EA7AD(param1).intValue(), AnonymousStructure_0BD7E5F7F4FE0AF7AF9130D7DA795E6A.class); 
        return result;
    } 

}
