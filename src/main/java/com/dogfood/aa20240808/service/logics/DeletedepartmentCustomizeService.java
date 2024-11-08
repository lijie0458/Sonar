package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A4BC80E26CB6B7890015021F634885B; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31A02440DB0E34FD453392B198B85190; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.DeletedepartmentCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 删除组织管理
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
public class DeletedepartmentCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private DeletedepartmentCustomizeServiceMapper deletedepartmentCustomizeServiceMapper;

    public AnonymousStructure_31A02440DB0E34FD453392B198B85190 deletedepartment(Long param1) {
        LambdaParamWrapper<List<Long>> DeleteSubclassListId = new LambdaParamWrapper<>(new ArrayList<>());
        AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258 SubordinateClassification = new AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258();
        AnonymousStructure_90BB04F104917B26166C550B4A1B0632 subVendor = new AnonymousStructure_90BB04F104917B26166C550B4A1B0632();
        AnonymousStructure_4A4BC80E26CB6B7890015021F634885B associatedData = new AnonymousStructure_4A4BC80E26CB6B7890015021F634885B();
        AnonymousStructure_3421ED028B001C489CD794910A15D0C0 variable1 = new AnonymousStructure_3421ED028B001C489CD794910A15D0C0();
        AnonymousStructure_31A02440DB0E34FD453392B198B85190 result = new AnonymousStructure_31A02440DB0E34FD453392B198B85190();
        // 查询下级分类
        CommonFunctionUtil.add(DeleteSubclassListId.param, param1);
        SubordinateClassification = CommonFunctionUtil.createListPage(deletedepartmentCustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(param1), deletedepartmentCustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(param1).intValue(), AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class); 
        CommonFunctionUtil.addAll(DeleteSubclassListId.param, CommonFunctionUtil.listTransform(SubordinateClassification.list, (item) -> item.department.id));
        while ((CommonFunctionUtil.notEquals(SubordinateClassification.total, 0L))) {
            variable1 = CommonFunctionUtil.clone(CommonFunctionUtil.get(SubordinateClassification.list, 0L)); 
            SubordinateClassification = CommonFunctionUtil.clone(CommonFunctionUtil.createListPage(deletedepartmentCustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C01(variable1), deletedepartmentCustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C01(variable1).intValue(), AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class)); 
            CommonFunctionUtil.addAll(DeleteSubclassListId.param, CommonFunctionUtil.clone(CommonFunctionUtil.listTransform(SubordinateClassification.list, (item) -> item.department.id)));
        } 

        subVendor = CommonFunctionUtil.createListPage(deletedepartmentCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(DeleteSubclassListId.param), deletedepartmentCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(DeleteSubclassListId.param).intValue(), AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class); 
        // 查询组织下是否有用户，没有直接删除
        if ((CommonFunctionUtil.equals(subVendor.total, 0L))) {
            result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_31A02440DB0E34FD453392B198B85190(), _bean1 -> {
    _bean1.property1 = true; 
    _bean1.property2 = DeleteSubclassListId.param; 
} ); 
        } else {
        } 

        return result;
    } 

}
