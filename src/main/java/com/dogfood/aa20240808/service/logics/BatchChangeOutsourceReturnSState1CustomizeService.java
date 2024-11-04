package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import com.dogfood.aa20240808.functional.wrapper.ExpressionWrapper; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.enumeration.OutsourceReturnStorageStateEnumEnum; 
import com.dogfood.aa20240808.service.entities.OutsourceReturnStorageEntityService; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.BatchChangeOutsourceReturnSState1CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity; 

@Service
public class BatchChangeOutsourceReturnSState1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private BatchChangeOutsourceReturnSState1CustomizeServiceMapper batchChangeOutsourceReturnSState1CustomizeServiceMapper;
    @Autowired
    private OutsourceReturnStorageEntityService outsourceReturnStorageEntityService;
    public void batchChangeOutsourceReturnSState1(List<String> codeList, OutsourceReturnStorageStateEnumEnum outsourceReturnSState) {
        LambdaParamWrapper<OutsourceReturnStorageStateEnumEnum> outsourceReturnSStateWrapper = new LambdaParamWrapper<>(outsourceReturnSState);
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B008B6EA68E34052D6DD5E601C00DF35 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B008B6EA68E34052D6DD5E601C00DF35();
        List<OutsourceReturnStorageEntity> variable2 = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(batchChangeOutsourceReturnSState1CustomizeServiceMapper.getAnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170(outsourceReturnSStateWrapper.param, codeList), batchChangeOutsourceReturnSState1CustomizeServiceMapper.countAnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170(outsourceReturnSStateWrapper.param, codeList).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B008B6EA68E34052D6DD5E601C00DF35.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170 item = variable1.list.get(index.intValue());
                item.outsourceReturnStorage.state = ExpressionWrapper.matchExpression(outsourceReturnSStateWrapper.param, e1 -> {
    if (CommonFunctionUtil.equals(e1, OutsourceReturnStorageStateEnumEnum.FIELD_0)) {
        return OutsourceReturnStorageStateEnumEnum.FIELD_1;
    } 

    if (CommonFunctionUtil.equals(e1, OutsourceReturnStorageStateEnumEnum.FIELD_1)) {
        return OutsourceReturnStorageStateEnumEnum.FIELD_2;
    } 

    if (CommonFunctionUtil.equals(e1, OutsourceReturnStorageStateEnumEnum.FIELD_2)) {
        return OutsourceReturnStorageStateEnumEnum.FIELD_2;
    } 

    return null;
} ); 
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item.outsourceReturnStorage));
            } 

            outsourceReturnStorageEntityService.batchUpdate(variable2, Arrays.asList("returnCode", "state"));
        } else {
        } 

        return ;
    } 


}
