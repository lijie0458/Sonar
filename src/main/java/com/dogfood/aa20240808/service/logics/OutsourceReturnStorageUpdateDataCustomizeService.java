package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.OutsourceReturnStorageUpdateDataCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class OutsourceReturnStorageUpdateDataCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private OutsourceReturnStorageUpdateDataCustomizeServiceMapper outsourceReturnStorageUpdateDataCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_918C890596FE76F2D0016F5A4227FA96 outsourceReturnStorageUpdateData(String outsourceReturnCode) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_918C890596FE76F2D0016F5A4227FA96 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_918C890596FE76F2D0016F5A4227FA96();
        result = CommonFunctionUtil.createListPage(outsourceReturnStorageUpdateDataCustomizeServiceMapper.getAnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA(outsourceReturnCode), outsourceReturnStorageUpdateDataCustomizeServiceMapper.countAnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA(outsourceReturnCode).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_918C890596FE76F2D0016F5A4227FA96.class); 
        return result;
    } 


}
