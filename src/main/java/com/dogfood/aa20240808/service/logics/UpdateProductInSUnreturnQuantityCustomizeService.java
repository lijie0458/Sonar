package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_67F95B79F18189008108B68FF4F73EFC; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.service.entities.ProductInStorageDetailsEntityService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.UpdateProductInSUnreturnQuantityCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4; 

/**
 * 更新产品入库单详情的未退回数量-ljl
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
public class UpdateProductInSUnreturnQuantityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateProductInSUnreturnQuantityCustomizeServiceMapper updateProductInSUnreturnQuantityCustomizeServiceMapper;

    @Autowired
    private ProductInStorageDetailsEntityService productInStorageDetailsEntityService;

    public void updateProductInSUnreturnQuantity(String productReturnCode, Boolean addOrReduce) {
        AnonymousStructure_67F95B79F18189008108B68FF4F73EFC variable1 = new AnonymousStructure_67F95B79F18189008108B68FF4F73EFC();
        variable1 = CommonFunctionUtil.createListPage(updateProductInSUnreturnQuantityCustomizeServiceMapper.getAnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4(productReturnCode), updateProductInSUnreturnQuantityCustomizeServiceMapper.countAnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4(productReturnCode).intValue(), AnonymousStructure_67F95B79F18189008108B68FF4F73EFC.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4 item = variable1.list.get(index.intValue());
                if (addOrReduce) {
                    item.productInStorageDetails.unreturnQuantity = (item.productInStorageDetails.unreturnQuantity.add(item.productReturnStorageDetails.quantity)); 
                } else {
                    item.productInStorageDetails.unreturnQuantity = (item.productInStorageDetails.unreturnQuantity.subtract(item.productReturnStorageDetails.quantity)); 
                } 

            } 

            productInStorageDetailsEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.list, (item) -> item.productInStorageDetails), Arrays.asList("id", "unreturnQuantity"));
        } else {
        } 

        return ;
    } 

}
