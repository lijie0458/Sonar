package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.DeletesupplierCustomizeServiceMapper; 

@Service
public class DeletesupplierCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private DeletesupplierCustomizeServiceMapper deletesupplierCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190 deletesupplier(Long param1) {
        List<Long> DeleteSubclassListId = new ArrayList<>();
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4> SubordinateClassification = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4());
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7> subVendor = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7());
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B associatedData = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B();
        List<Long> suppelierDetailListId = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8();
        List<Long> variable2 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190();
        CommonFunctionUtil.add(DeleteSubclassListId, param1);
        SubordinateClassification.param = CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(param1), deletesupplierCustomizeServiceMapper.countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4.class); 
        LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(SubordinateClassification.param)).toString()));
        CommonFunctionUtil.addAll(DeleteSubclassListId, CommonFunctionUtil.listTransform(SubordinateClassification.param.list, (item) -> item.supplier.id));
        LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(DeleteSubclassListId)).toString()));
        while ((CommonFunctionUtil.notEquals(SubordinateClassification.param.total, 0L))) {
            variable1 = CommonFunctionUtil.clone(CommonFunctionUtil.get(SubordinateClassification.param.list, 0L)); 
            SubordinateClassification.param = CommonFunctionUtil.clone(CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C81(variable1), deletesupplierCustomizeServiceMapper.countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C81(variable1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4.class)); 
            CommonFunctionUtil.addAll(DeleteSubclassListId, CommonFunctionUtil.clone(CommonFunctionUtil.listTransform(SubordinateClassification.param.list, (item) -> item.supplier.id)));
        } 

        subVendor.param = CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(DeleteSubclassListId), deletesupplierCustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(DeleteSubclassListId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class); 
        if ((CommonFunctionUtil.equals(subVendor.param.total, 0L))) {
            result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean201 -> {
    _bean201.property1 = true; 
    _bean201.property2 = DeleteSubclassListId; 
} ); 
        } else {
            variable2 = CommonFunctionUtil.listTransform(subVendor.param.list, (item) -> item.supplierDetails.id); 
            associatedData = CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(variable2), deletesupplierCustomizeServiceMapper.countAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(variable2).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B.class); 
            if ((CommonFunctionUtil.equals(associatedData.total, 0L))) {
                result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean721 -> {
    _bean721.property1 = true; 
    _bean721.property2 = DeleteSubclassListId; 
} ); 
            } else {
                result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean421 -> {
    _bean421.property2 = DeleteSubclassListId; 
    _bean421.property1 = false; 
} ); 
            } 

        } 

        return result;
    } 


}
