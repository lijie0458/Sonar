package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import com.dogfood.aa20240808.functional.wrapper.ExpressionWrapper; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.repository.BatchChangeOutsourceInSStateCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.enumeration.OutsourceInStorageStateEnumEnum; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.service.entities.OutsourceInStorageEntityService; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class BatchChangeOutsourceInSStateCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private BatchChangeOutsourceInSStateCustomizeServiceMapper batchChangeOutsourceInSStateCustomizeServiceMapper;
    @Autowired
    private OutsourceInStorageEntityService outsourceInStorageEntityService;
    public void batchChangeOutsourceInSState(List<String> codeList, OutsourceInStorageStateEnumEnum outsourceInSState) {
        LambdaParamWrapper<OutsourceInStorageStateEnumEnum> outsourceInSStateWrapper = new LambdaParamWrapper<>(outsourceInSState);
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735();
        List<OutsourceInStorageEntity> variable2 = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(batchChangeOutsourceInSStateCustomizeServiceMapper.getAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(outsourceInSStateWrapper.param, codeList), batchChangeOutsourceInSStateCustomizeServiceMapper.countAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(outsourceInSStateWrapper.param, codeList).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF item = variable1.list.get(index.intValue());
                item.outsourceInStorage.state = ExpressionWrapper.matchExpression(outsourceInSStateWrapper.param, e1 -> {
    if (CommonFunctionUtil.equals(e1, OutsourceInStorageStateEnumEnum.FIELD_0)) {
        return OutsourceInStorageStateEnumEnum.FIELD_1;
    } 

    if (CommonFunctionUtil.equals(e1, OutsourceInStorageStateEnumEnum.FIELD_1)) {
        return OutsourceInStorageStateEnumEnum.FIELD_2;
    } 

    if (CommonFunctionUtil.equals(e1, OutsourceInStorageStateEnumEnum.FIELD_2)) {
        return OutsourceInStorageStateEnumEnum.FIELD_2;
    } 

    return null;
} ); 
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item.outsourceInStorage));
            } 

            outsourceInStorageEntityService.batchUpdate(variable2, Arrays.asList("code", "state"));
        } else {
        } 

        return ;
    } 


}
