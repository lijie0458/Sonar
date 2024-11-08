package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 通过入库单查询对应的退货单
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
public class LoadGoodsReturnedNoteByBePutInStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper loadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper;

    public AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D loadGoodsReturnedNoteByBePutInStorage(String param1) {
        AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D result = new AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D();
        result = CommonFunctionUtil.createListPage(loadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper.getAnonymousStructure_5FEA4FE0D02D7521E8E79FE86D5BDFE6(param1), loadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper.countAnonymousStructure_5FEA4FE0D02D7521E8E79FE86D5BDFE6(param1).intValue(), AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D.class); 
        return result;
    } 

}
