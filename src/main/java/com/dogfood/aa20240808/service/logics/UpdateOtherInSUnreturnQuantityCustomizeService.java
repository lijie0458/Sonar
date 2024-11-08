package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.OtherInStorageDetailsEntityService; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.UpdateOtherInSUnreturnQuantityCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AE46AD2B7381676FFE065B948F85DD20; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B51AAE4540035E591EF7715DD05C2F68; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 更新其他入库详情的未退回数量-ljl
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
public class UpdateOtherInSUnreturnQuantityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private UpdateOtherInSUnreturnQuantityCustomizeServiceMapper updateOtherInSUnreturnQuantityCustomizeServiceMapper;

    @Autowired
    private OtherInStorageDetailsEntityService otherInStorageDetailsEntityService;

    public void updateOtherInSUnreturnQuantity(String otherReturnCode, Boolean addOrReduce) {
        AnonymousStructure_B51AAE4540035E591EF7715DD05C2F68 variable1 = new AnonymousStructure_B51AAE4540035E591EF7715DD05C2F68();
        variable1 = CommonFunctionUtil.createListPage(updateOtherInSUnreturnQuantityCustomizeServiceMapper.getAnonymousStructure_AE46AD2B7381676FFE065B948F85DD20(otherReturnCode), updateOtherInSUnreturnQuantityCustomizeServiceMapper.countAnonymousStructure_AE46AD2B7381676FFE065B948F85DD20(otherReturnCode).intValue(), AnonymousStructure_B51AAE4540035E591EF7715DD05C2F68.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_AE46AD2B7381676FFE065B948F85DD20 item = variable1.list.get(index.intValue());
                if (addOrReduce) {
                    item.otherInStorageDetails.unreturnQuantity = (item.otherInStorageDetails.unreturnQuantity.add(item.otherReturnStorageDetails.quantity)); 
                } else {
                    item.otherInStorageDetails.unreturnQuantity = (item.otherInStorageDetails.unreturnQuantity.subtract(item.otherReturnStorageDetails.quantity)); 
                } 

            } 

            otherInStorageDetailsEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.list, (item) -> item.otherInStorageDetails), null);
        } else {
        } 

        return ;
    } 

}
