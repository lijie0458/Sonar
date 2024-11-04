package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LCAPBatchRemoveDeptUserCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.entities.LCAPUserDeptMappingService; 

@Service
public class LCAPBatchRemoveDeptUserCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPBatchRemoveDeptUserCustomizeServiceMapper lCAPBatchRemoveDeptUserCustomizeServiceMapper;
    @Autowired
    private LCAPGetDeptListCustomizeService lCAPGetDeptListCustomizeService;
    @Autowired
    private LCAPUserDeptMappingService lCAPUserDeptMappingService;
    public void lCAPBatchRemoveDeptUser(List<String> userIds, String deptId) {
        List<LCAPUserDeptMapping> removeMap = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> temp = new ArrayList<>();
        String rootDeptId = "";
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202> temp2 = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> userRootList = new ArrayList<>();
        List<LCAPUserDeptMapping> removeEntity = new ArrayList<>();
        List<Long> removeDeptMap = new ArrayList<>();
        List<String> userIdList = new ArrayList<>();
        List<String> userResult = new ArrayList<>();
        if (CommonFunctionUtil.hasValue(userIds, deptId)) {
            temp = lCAPBatchRemoveDeptUserCustomizeServiceMapper.getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(userIds, deptId); 
            if ((CommonFunctionUtil.length(temp).compareTo(0L) > 0)) {
                removeMap = CommonFunctionUtil.listTransform(temp, (item) -> item.lCAPUserDeptMapping); 
                temp2 = lCAPGetDeptListCustomizeService.lCAPGetDeptList(null, null); 
                if (CommonFunctionUtil.hasValue(temp2)) {
                    rootDeptId = CommonFunctionUtil.listHead(temp2).lCAPDepartment.deptId; 
                    userIdList = CommonFunctionUtil.listTransform(removeMap, (item) -> item.userId); 
                    userRootList = lCAPBatchRemoveDeptUserCustomizeServiceMapper.getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF21(rootDeptId, userIdList); 
                    if ((CommonFunctionUtil.length(userRootList).compareTo(0L) > 0)) {
                        userResult = CommonFunctionUtil.listTransform(userRootList, (item) -> item.lCAPUserDeptMapping.userId); 
                    } else {
                    } 

                    for (Long index = 0L; index < removeMap.size(); index++) {
                        LCAPUserDeptMapping item = removeMap.get(index.intValue());
                        if (CommonFunctionUtil.contains(userResult, item.userId)) {
                            if ((CommonFunctionUtil.notEquals(deptId, rootDeptId))) {
                                CommonFunctionUtil.add(removeDeptMap, CommonFunctionUtil.clone(item.id));
                            } else {
                            } 

                        } else {
                            item.isDeptLeader = 0L; 
                            item.deptId = rootDeptId; 
                            CommonFunctionUtil.add(removeEntity, CommonFunctionUtil.clone(item));
                        } 

                    } 

                    if ((CommonFunctionUtil.length(removeEntity).compareTo(0L) > 0)) {
                        lCAPUserDeptMappingService.batchUpdate(removeEntity, Arrays.asList("id", "deptId", "isDeptLeader"));
                    } else {
                    } 

                    if ((CommonFunctionUtil.length(removeDeptMap).compareTo(0L) > 0)) {
                        lCAPUserDeptMappingService.batchDelete(removeDeptMap);
                    } else {
                    } 

                } else {
                } 

            } else {
            } 

        } else {
        } 

        return ;
    } 


}
