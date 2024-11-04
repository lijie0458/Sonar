package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OtherReturnStorageStateEnumEnum; 
import com.dogfood.aa20240808.service.entities.OtherReturnStorageEntityService; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.functional.wrapper.ExpressionWrapper; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.BatchChangeOtherReturnSStateCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageEntity; 

@Service
public class BatchChangeOtherReturnSStateCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private BatchChangeOtherReturnSStateCustomizeServiceMapper batchChangeOtherReturnSStateCustomizeServiceMapper;
    @Autowired
    private OtherReturnStorageEntityService otherReturnStorageEntityService;
    public void batchChangeOtherReturnSState(List<String> codeList, OtherReturnStorageStateEnumEnum otherReturnSState) {
        LambdaParamWrapper<OtherReturnStorageStateEnumEnum> otherReturnSStateWrapper = new LambdaParamWrapper<>(otherReturnSState);
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0A9AC12F27464BEB34E2113F9C452432 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0A9AC12F27464BEB34E2113F9C452432();
        List<OtherReturnStorageEntity> variable2 = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(batchChangeOtherReturnSStateCustomizeServiceMapper.getAnonymousStructure_CCF83669FF6932F4220A16134A2F3077(otherReturnSStateWrapper.param, codeList), batchChangeOtherReturnSStateCustomizeServiceMapper.countAnonymousStructure_CCF83669FF6932F4220A16134A2F3077(otherReturnSStateWrapper.param, codeList).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0A9AC12F27464BEB34E2113F9C452432.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CCF83669FF6932F4220A16134A2F3077 item = variable1.list.get(index.intValue());
                item.otherReturnStorage.state = ExpressionWrapper.matchExpression(otherReturnSStateWrapper.param, e1 -> {
    if (CommonFunctionUtil.equals(e1, OtherReturnStorageStateEnumEnum.FIELD_0)) {
        return OtherReturnStorageStateEnumEnum.FIELD_1;
    } 

    if (CommonFunctionUtil.equals(e1, OtherReturnStorageStateEnumEnum.FIELD_1)) {
        return OtherReturnStorageStateEnumEnum.FIELD_2;
    } 

    if (CommonFunctionUtil.equals(e1, OtherReturnStorageStateEnumEnum.FIELD_2)) {
        return OtherReturnStorageStateEnumEnum.FIELD_2;
    } 

    return null;
} ); 
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item.otherReturnStorage));
            } 

            otherReturnStorageEntityService.batchUpdate(variable2, null);
        } else {
        } 

        return ;
    } 


}
