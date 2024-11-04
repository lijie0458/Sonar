package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.DeletedepartmentCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class DeletedepartmentCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private DeletedepartmentCustomizeServiceMapper deletedepartmentCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190 deletedepartment(Long param1) {
        List<Long> DeleteSubclassListId = new ArrayList<>();
        LambdaParamWrapper<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258> SubordinateClassification = new LambdaParamWrapper<>(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258());
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632 subVendor = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B associatedData = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190();
        CommonFunctionUtil.add(DeleteSubclassListId, param1);
        SubordinateClassification.param = CommonFunctionUtil.createListPage(deletedepartmentCustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(param1), deletedepartmentCustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class); 
        CommonFunctionUtil.addAll(DeleteSubclassListId, CommonFunctionUtil.listTransform(SubordinateClassification.param.list, (item) -> item.department.id));
        while ((CommonFunctionUtil.notEquals(SubordinateClassification.param.total, 0L))) {
            variable1 = CommonFunctionUtil.clone(CommonFunctionUtil.get(SubordinateClassification.param.list, 0L)); 
            SubordinateClassification.param = CommonFunctionUtil.clone(CommonFunctionUtil.createListPage(deletedepartmentCustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C01(variable1), deletedepartmentCustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C01(variable1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class)); 
            CommonFunctionUtil.addAll(DeleteSubclassListId, CommonFunctionUtil.clone(CommonFunctionUtil.listTransform(SubordinateClassification.param.list, (item) -> item.department.id)));
        } 

        subVendor = CommonFunctionUtil.createListPage(deletedepartmentCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(DeleteSubclassListId), deletedepartmentCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(DeleteSubclassListId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
        if ((CommonFunctionUtil.equals(subVendor.total, 0L))) {
            result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean564 -> {
    _bean564.property1 = true; 
    _bean564.property2 = DeleteSubclassListId; 
} ); 
        } else {
        } 

        return result;
    } 


}
