package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.OtherInStorageDetailsEntityService; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.UpdateOtherInSUnreturnQuantityCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class UpdateOtherInSUnreturnQuantityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdateOtherInSUnreturnQuantityCustomizeServiceMapper updateOtherInSUnreturnQuantityCustomizeServiceMapper;
    @Autowired
    private OtherInStorageDetailsEntityService otherInStorageDetailsEntityService;
    public void updateOtherInSUnreturnQuantity(String otherReturnCode, Boolean addOrReduce) {
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B51AAE4540035E591EF7715DD05C2F68> variable1 = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B51AAE4540035E591EF7715DD05C2F68());
        variable1.param = CommonFunctionUtil.createListPage(updateOtherInSUnreturnQuantityCustomizeServiceMapper.getAnonymousStructure_AE46AD2B7381676FFE065B948F85DD20(otherReturnCode), updateOtherInSUnreturnQuantityCustomizeServiceMapper.countAnonymousStructure_AE46AD2B7381676FFE065B948F85DD20(otherReturnCode).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B51AAE4540035E591EF7715DD05C2F68.class); 
        if ((variable1.param.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.param.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AE46AD2B7381676FFE065B948F85DD20 item = variable1.param.list.get(index.intValue());
                if (addOrReduce) {
                    item.otherInStorageDetails.unreturnQuantity = (item.otherInStorageDetails.unreturnQuantity.add(item.otherReturnStorageDetails.quantity)); 
                } else {
                    item.otherInStorageDetails.unreturnQuantity = (item.otherInStorageDetails.unreturnQuantity.subtract(item.otherReturnStorageDetails.quantity)); 
                } 

            } 

            otherInStorageDetailsEntityService.batchUpdate(CommonFunctionUtil.listTransform(variable1.param.list, (item) -> item.otherInStorageDetails), null);
        } else {
        } 

        return ;
    } 


}
