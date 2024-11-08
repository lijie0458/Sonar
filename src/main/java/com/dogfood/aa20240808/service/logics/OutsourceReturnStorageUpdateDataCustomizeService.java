package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_918C890596FE76F2D0016F5A4227FA96; 
import com.dogfood.aa20240808.repository.OutsourceReturnStorageUpdateDataCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新委外加工入库退回数据时拿到的回显数据-ljl
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
public class OutsourceReturnStorageUpdateDataCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private OutsourceReturnStorageUpdateDataCustomizeServiceMapper outsourceReturnStorageUpdateDataCustomizeServiceMapper;

    public AnonymousStructure_918C890596FE76F2D0016F5A4227FA96 outsourceReturnStorageUpdateData(String outsourceReturnCode) {
        AnonymousStructure_918C890596FE76F2D0016F5A4227FA96 result = new AnonymousStructure_918C890596FE76F2D0016F5A4227FA96();
        result = CommonFunctionUtil.createListPage(outsourceReturnStorageUpdateDataCustomizeServiceMapper.getAnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA(outsourceReturnCode), outsourceReturnStorageUpdateDataCustomizeServiceMapper.countAnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA(outsourceReturnCode).intValue(), AnonymousStructure_918C890596FE76F2D0016F5A4227FA96.class); 
        return result;
    } 

}
