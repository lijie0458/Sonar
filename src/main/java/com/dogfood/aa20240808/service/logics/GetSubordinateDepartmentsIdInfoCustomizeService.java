package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.GetSubordinateDepartmentsIdInfoCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 得到传入部门下属部门id信息-ljl
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
public class GetSubordinateDepartmentsIdInfoCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetSubordinateDepartmentsIdInfoCustomizeServiceMapper getSubordinateDepartmentsIdInfoCustomizeServiceMapper;

    public List<Long> getSubordinateDepartmentsIdInfo(List<Long> departmentIdList) {
        List<AnonymousStructure_3421ED028B001C489CD794910A15D0C0> variable1 = new ArrayList<>();
        List<Long> variable2 = new ArrayList<>();
        List<Long> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getSubordinateDepartmentsIdInfoCustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(departmentIdList), getSubordinateDepartmentsIdInfoCustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(departmentIdList).intValue(), AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class).list; 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            variable2 = CommonFunctionUtil.listTransform(variable1, (item) -> item.department.id); 
            CommonFunctionUtil.addAll(result, this.getSubordinateDepartmentsIdInfo(variable2));
            CommonFunctionUtil.addAll(result, variable2);
        } else {
        } 

        return result;
    } 

}
