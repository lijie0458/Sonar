package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.UpdateProductRetuenUnreturnQuantity1CustomizeServiceMapper; 
import com.dogfood.aa20240808.service.entities.OutsourceInStorageDetailsEntityService; 
import java.util.Arrays; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_20B4E731A2B2CCA994851294FA572B07; 

/**
 * 更新产品入库详情的未退回数量-ljl
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
public class UpdateProductRetuenUnreturnQuantity1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateProductRetuenUnreturnQuantity1CustomizeServiceMapper updateProductRetuenUnreturnQuantity1CustomizeServiceMapper;

    @Autowired
    private OutsourceInStorageDetailsEntityService outsourceInStorageDetailsEntityService;

    public void updateProductRetuenUnreturnQuantity1(String outsourceReturnCode, Boolean addOrReduce) {
        AnonymousStructure_20B4E731A2B2CCA994851294FA572B07 variable1 = new AnonymousStructure_20B4E731A2B2CCA994851294FA572B07();
        variable1 = CommonFunctionUtil.createListPage(updateProductRetuenUnreturnQuantity1CustomizeServiceMapper.getAnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71(outsourceReturnCode), updateProductRetuenUnreturnQuantity1CustomizeServiceMapper.countAnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71(outsourceReturnCode).intValue(), AnonymousStructure_20B4E731A2B2CCA994851294FA572B07.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71 item = variable1.list.get(index.intValue());
                if (addOrReduce) {
                    item.outsourceInStorageDetails.unreturnQuantity = (item.outsourceInStorageDetails.unreturnQuantity.add(item.outsourceReturnStorageDetails.quantity)); 
                } else {
                    item.outsourceInStorageDetails.unreturnQuantity = (item.outsourceInStorageDetails.unreturnQuantity.subtract(item.outsourceReturnStorageDetails.quantity)); 
                } 

            } 

            outsourceInStorageDetailsEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.list, (item) -> item.outsourceInStorageDetails), Arrays.asList("id", "unreturnQuantity"));
        } else {
        } 

        return ;
    } 

}
