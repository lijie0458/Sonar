package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C6669C4944106C618500528DC95920ED; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.ProductReturnStorageUpdateDataCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新产品入库退回数据时拿到的回显数据-ljl
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
public class ProductReturnStorageUpdateDataCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private ProductReturnStorageUpdateDataCustomizeServiceMapper productReturnStorageUpdateDataCustomizeServiceMapper;

    public AnonymousStructure_C6669C4944106C618500528DC95920ED productReturnStorageUpdateData(String productReturnCode) {
        AnonymousStructure_C6669C4944106C618500528DC95920ED result = new AnonymousStructure_C6669C4944106C618500528DC95920ED();
        result = CommonFunctionUtil.createListPage(productReturnStorageUpdateDataCustomizeServiceMapper.getAnonymousStructure_3DDDBD014D56BE7B460F5D710BCE1FDF(productReturnCode), productReturnStorageUpdateDataCustomizeServiceMapper.countAnonymousStructure_3DDDBD014D56BE7B460F5D710BCE1FDF(productReturnCode).intValue(), AnonymousStructure_C6669C4944106C618500528DC95920ED.class); 
        return result;
    } 

}
