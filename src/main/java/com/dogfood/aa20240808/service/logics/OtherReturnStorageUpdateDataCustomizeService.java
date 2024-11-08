package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.OtherReturnStorageUpdateDataCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47; 

/**
 * 更新其他入库退回数据时拿到的回显数据-ljl
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
public class OtherReturnStorageUpdateDataCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private OtherReturnStorageUpdateDataCustomizeServiceMapper otherReturnStorageUpdateDataCustomizeServiceMapper;

    public AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47 otherReturnStorageUpdateData(String otherReturnCode) {
        AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47 result = new AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47();
        result = CommonFunctionUtil.createListPage(otherReturnStorageUpdateDataCustomizeServiceMapper.getAnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE(otherReturnCode), otherReturnStorageUpdateDataCustomizeServiceMapper.countAnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE(otherReturnCode).intValue(), AnonymousStructure_2C3D2ABFC26123EEFF51ABA78EB19E47.class); 
        return result;
    } 

}
