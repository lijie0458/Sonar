package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LCAPCreateRootDeptCustomizeServiceMapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.entities.LCAPDepartment; 
import com.dogfood.aa20240808.service.entities.LCAPDepartmentService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202; 
import com.dogfood.aa20240808.service.entities.LCAPUserDeptMappingService; 

/**
 * 创建根部门
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
public class LCAPCreateRootDeptCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPCreateRootDeptCustomizeServiceMapper lCAPCreateRootDeptCustomizeServiceMapper;

    @Autowired
    private LCAPDepartmentService lCAPDepartmentService;

    @Autowired
    private LCAPUserDeptMappingService lCAPUserDeptMappingService;

    public String lCAPCreateRootDept() {
        LCAPDepartment createDept = new LCAPDepartment();
        List<AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202> searchList = new ArrayList<>();
        List<AnonymousStructure_47C167E7217746A55100F50A57F637C0> userList = new ArrayList<>();
        List<LCAPUserDeptMapping> userDeptList = new ArrayList<>();
        LCAPUserDeptMapping userDeptMp = new LCAPUserDeptMapping();
        String result = "";
        searchList = lCAPCreateRootDeptCustomizeServiceMapper.getAnonymousStructure_FF3D47421C85AD91C2FDAE6821984202(); 
        if ((CommonFunctionUtil.length(searchList).compareTo(0L) > 0)) {
        } else {
            createDept.deptId = "0"; 
            createDept.name = "根部门"; 

            lCAPDepartmentService.create(createDept);
            userDeptMp.deptId = "0"; 
            userDeptMp.isDeptLeader = 0L; 
            userList = lCAPCreateRootDeptCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(); 
            for (Long index = 0L; index < userList.size(); index++) {
                AnonymousStructure_47C167E7217746A55100F50A57F637C0 item = userList.get(index.intValue());
                userDeptMp.userId = item.lCAPUser.userId; 
                CommonFunctionUtil.add(userDeptList, CommonFunctionUtil.clone(userDeptMp));
            } 

            if (CommonFunctionUtil.hasValue(userDeptList)) {
                lCAPUserDeptMappingService.batchCreate(userDeptList);
            } else {
            } 

        } 

        result = "0"; 
        return result;
    } 

}
