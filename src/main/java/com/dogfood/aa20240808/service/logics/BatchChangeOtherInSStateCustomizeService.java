package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.BatchChangeOtherInSStateCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import com.dogfood.aa20240808.functional.wrapper.ExpressionWrapper; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_950B930A01B608CCA173536BB93CD694; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.entities.OtherInStorageEntityService; 
import com.dogfood.aa20240808.domain.enumeration.OtherInStorageStateEnumEnum; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

/**
 * 批量改变其他入库订单状态-ljl
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
public class BatchChangeOtherInSStateCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private BatchChangeOtherInSStateCustomizeServiceMapper batchChangeOtherInSStateCustomizeServiceMapper;

    @Autowired
    private OtherInStorageEntityService otherInStorageEntityService;

    public void batchChangeOtherInSState(List<String> codeList, OtherInStorageStateEnumEnum otherInSState) {
        LambdaParamWrapper<OtherInStorageStateEnumEnum> otherInSStateWrapper = new LambdaParamWrapper<>(otherInSState);
        AnonymousStructure_950B930A01B608CCA173536BB93CD694 variable1 = new AnonymousStructure_950B930A01B608CCA173536BB93CD694();
        List<OtherInStorageEntity> variable2 = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(batchChangeOtherInSStateCustomizeServiceMapper.getAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(otherInSStateWrapper.param, codeList), batchChangeOtherInSStateCustomizeServiceMapper.countAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(otherInSStateWrapper.param, codeList).intValue(), AnonymousStructure_950B930A01B608CCA173536BB93CD694.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119 item = variable1.list.get(index.intValue());
                item.otherInStorage.state = ExpressionWrapper.matchExpression(otherInSStateWrapper.param, e1 -> {
    if (CommonFunctionUtil.equals(e1, OtherInStorageStateEnumEnum.FIELD_0)) {
        return OtherInStorageStateEnumEnum.FIELD_1;
    } 

    if (CommonFunctionUtil.equals(e1, OtherInStorageStateEnumEnum.FIELD_1)) {
        return OtherInStorageStateEnumEnum.FIELD_2;
    } 

    if (CommonFunctionUtil.equals(e1, OtherInStorageStateEnumEnum.FIELD_2)) {
        return OtherInStorageStateEnumEnum.FIELD_2;
    } 

    return null;
} ); 
                CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(item.otherInStorage));
            } 

            otherInStorageEntityService.batchUpdate(variable2, Arrays.asList("code", "state"));
        } else {
        } 

        return ;
    } 

}
