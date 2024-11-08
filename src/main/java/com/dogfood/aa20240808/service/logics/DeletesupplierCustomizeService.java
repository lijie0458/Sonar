package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.DeletesupplierCustomizeServiceMapper; 

/**
 * 删除供应商分类
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
public class DeletesupplierCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private DeletesupplierCustomizeServiceMapper deletesupplierCustomizeServiceMapper;

    public AnonymousStructure_31A02440DB0E34FD453392B198B85190 deletesupplier(Long param1) {
        LambdaParamWrapper<List<Long>> DeleteSubclassListId = new LambdaParamWrapper<>(new ArrayList<>());
        AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4 SubordinateClassification = new AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4();
        AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7 subVendor = new AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7();
        AnonymousStructure_15236DED8CD807484AC741CD838A113B associatedData = new AnonymousStructure_15236DED8CD807484AC741CD838A113B();
        List<Long> suppelierDetailListId = new ArrayList<>();
        AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8 variable1 = new AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8();
        List<Long> variable2 = new ArrayList<>();
        AnonymousStructure_31A02440DB0E34FD453392B198B85190 result = new AnonymousStructure_31A02440DB0E34FD453392B198B85190();
        // 查询下级分类
        CommonFunctionUtil.add(DeleteSubclassListId.param, param1);
        SubordinateClassification = CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(param1), deletesupplierCustomizeServiceMapper.countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(param1).intValue(), AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4.class); 
        LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(SubordinateClassification)).toString()));
        CommonFunctionUtil.addAll(DeleteSubclassListId.param, CommonFunctionUtil.listTransform(SubordinateClassification.list, (item) -> item.supplier.id));
        LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(DeleteSubclassListId.param)).toString()));
        while ((CommonFunctionUtil.notEquals(SubordinateClassification.total, 0L))) {
            variable1 = CommonFunctionUtil.clone(CommonFunctionUtil.get(SubordinateClassification.list, 0L)); 
            SubordinateClassification = CommonFunctionUtil.clone(CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C81(variable1), deletesupplierCustomizeServiceMapper.countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C81(variable1).intValue(), AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4.class)); 
            CommonFunctionUtil.addAll(DeleteSubclassListId.param, CommonFunctionUtil.clone(CommonFunctionUtil.listTransform(SubordinateClassification.list, (item) -> item.supplier.id)));
        } 

        subVendor = CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(DeleteSubclassListId.param), deletesupplierCustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(DeleteSubclassListId.param).intValue(), AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class); 
        // 分类下没有供应商，直接删除
        // 有供应商则查询关联数据，如果没有关联数据也可以删除，如果有则不能删除
        if ((CommonFunctionUtil.equals(subVendor.total, 0L))) {
            result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean1 -> {
    _bean1.property1 = true; 
    _bean1.property2 = DeleteSubclassListId.param; 
} ); 
        } else {
            variable2 = CommonFunctionUtil.listTransform(subVendor.list, (item) -> item.supplierDetails.id); 
            associatedData = CommonFunctionUtil.createListPage(deletesupplierCustomizeServiceMapper.getAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(variable2), deletesupplierCustomizeServiceMapper.countAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(variable2).intValue(), AnonymousStructure_15236DED8CD807484AC741CD838A113B.class); 
            if ((CommonFunctionUtil.equals(associatedData.total, 0L))) {
                result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean1 -> {
    _bean1.property1 = true; 
    _bean1.property2 = DeleteSubclassListId.param; 
} ); 
            } else {
                result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean1 -> {
    _bean1.property2 = DeleteSubclassListId.param; 
    _bean1.property1 = false; 
} ); 
            } 

        } 

        return result;
    } 

}
