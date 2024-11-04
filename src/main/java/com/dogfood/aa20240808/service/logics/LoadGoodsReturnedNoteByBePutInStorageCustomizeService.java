package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadGoodsReturnedNoteByBePutInStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper loadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D loadGoodsReturnedNoteByBePutInStorage(String param1) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D();
        result = CommonFunctionUtil.createListPage(loadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper.getAnonymousStructure_5FEA4FE0D02D7521E8E79FE86D5BDFE6(param1), loadGoodsReturnedNoteByBePutInStorageCustomizeServiceMapper.countAnonymousStructure_5FEA4FE0D02D7521E8E79FE86D5BDFE6(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E23DBE8403ACA8567D474034F6EAA1D.class); 
        return result;
    } 


}
