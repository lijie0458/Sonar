package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.entities.LCAPDepartment; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPGetDeptsCustomizeServiceMapper; 

@Service
public class LCAPGetDeptsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPGetDeptsCustomizeServiceMapper lCAPGetDeptsCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C lCAPGetDepts(String deptId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202> childDeptList = new ArrayList<>();
        List<LCAPDepartment> addList = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C();
        if (CommonFunctionUtil.hasValue(deptId)) {
            childDeptList = lCAPGetDeptsCustomizeServiceMapper.getAnonymousStructure_FF3D47421C85AD91C2FDAE6821984202(deptId); 
            if ((CommonFunctionUtil.length(childDeptList).compareTo(0L) > 0)) {
                CommonFunctionUtil.addAll(addList, CommonFunctionUtil.listTransform(childDeptList, (item) -> item.lCAPDepartment));
                for (Long index = 0L; index < childDeptList.size(); index++) {
                    com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202 item = childDeptList.get(index.intValue());
                    CommonFunctionUtil.addAll(addList, this.lCAPGetDepts(item.lCAPDepartment.deptId).list);
                } 

                result = CommonFunctionUtil.createListPage(addList, CommonFunctionUtil.length(addList), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C.class); 
            } else {
            } 

        } else {
        } 

        return result;
    } 


}
