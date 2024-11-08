package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.entities.LCAPDepartment; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202; 
import com.dogfood.aa20240808.repository.LCAPGetDeptsCustomizeServiceMapper; 

/**
 * 递归获取所有子部门列表
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
public class LCAPGetDeptsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPGetDeptsCustomizeServiceMapper lCAPGetDeptsCustomizeServiceMapper;

    public AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C lCAPGetDepts(String deptId) {
        List<AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202> childDeptList = new ArrayList<>();
        List<LCAPDepartment> addList = new ArrayList<>();
        AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C result = new AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C();
        if (CommonFunctionUtil.hasValue(deptId)) {
            childDeptList = lCAPGetDeptsCustomizeServiceMapper.getAnonymousStructure_FF3D47421C85AD91C2FDAE6821984202(deptId); 
            if ((CommonFunctionUtil.length(childDeptList).compareTo(0L) > 0)) {
                CommonFunctionUtil.addAll(addList, CommonFunctionUtil.listTransform(childDeptList, (item) -> item.lCAPDepartment));
                for (Long index = 0L; index < childDeptList.size(); index++) {
                    AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202 item = childDeptList.get(index.intValue());
                    CommonFunctionUtil.addAll(addList, this.lCAPGetDepts(item.lCAPDepartment.deptId).list);
                } 

                result = CommonFunctionUtil.createListPage(addList, CommonFunctionUtil.length(addList), AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C.class); 
            } else {
            } 

        } else {
        } 

        return result;
    } 

}
