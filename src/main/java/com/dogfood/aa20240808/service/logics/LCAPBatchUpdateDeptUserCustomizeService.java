package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LCAPBatchUpdateDeptUserCustomizeServiceMapper; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.entities.LCAPUserDeptMappingService; 

@Service
public class LCAPBatchUpdateDeptUserCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPBatchUpdateDeptUserCustomizeServiceMapper lCAPBatchUpdateDeptUserCustomizeServiceMapper;
    @Autowired
    private LCAPUserDeptMappingService lCAPUserDeptMappingService;
    public void lCAPBatchUpdateDeptUser(List<String> userIds, String deptId, String oldDeptId) {
        List<LCAPUserDeptMapping> userDeptMapList = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> userDeptMapListTemp = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> newUserDeptMapList = new ArrayList<>();
        List<LCAPUserDeptMapping> updateMapList = new ArrayList<>();
        List<Long> removeDeptMap = new ArrayList<>();
        List<String> userIdList = new ArrayList<>();
        List<String> userResult = new ArrayList<>();
        if (CommonFunctionUtil.hasValue(userIds, deptId, oldDeptId)) {
            userDeptMapListTemp = lCAPBatchUpdateDeptUserCustomizeServiceMapper.getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(oldDeptId, userIds); 
            if ((CommonFunctionUtil.length(userDeptMapListTemp).compareTo(0L) > 0)) {
                userDeptMapList = CommonFunctionUtil.listTransform(userDeptMapListTemp, (item) -> item.lCAPUserDeptMapping); 
                userIdList = CommonFunctionUtil.listTransform(userDeptMapList, (item) -> item.userId); 
                newUserDeptMapList = lCAPBatchUpdateDeptUserCustomizeServiceMapper.getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF21(userIdList, deptId); 
                if ((CommonFunctionUtil.length(newUserDeptMapList).compareTo(0L) > 0)) {
                    userResult = CommonFunctionUtil.listTransform(newUserDeptMapList, (item) -> item.lCAPUserDeptMapping.userId); 
                } else {
                } 

                for (Long index = 0L; index < userDeptMapList.size(); index++) {
                    LCAPUserDeptMapping item = userDeptMapList.get(index.intValue());
                    if (CommonFunctionUtil.contains(userResult, item.userId)) {
                        if ((CommonFunctionUtil.notEquals(deptId, oldDeptId))) {
                            CommonFunctionUtil.add(removeDeptMap, CommonFunctionUtil.clone(item.id));
                        } else {
                        } 

                    } else {
                        item.deptId = deptId; 
                        item.isDeptLeader = 0L; 
                        CommonFunctionUtil.add(updateMapList, CommonFunctionUtil.clone(item));
                    } 

                } 

                if ((CommonFunctionUtil.length(updateMapList).compareTo(0L) > 0)) {
                    lCAPUserDeptMappingService.batchUpdate(updateMapList, Arrays.asList("id", "deptId", "isDeptLeader"));
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

        return ;
    } 


}
