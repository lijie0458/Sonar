package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LCAPCanceDeptLeaderCustomizeServiceMapper; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.entities.LCAPUserDeptMappingService; 

@Service
public class LCAPCanceDeptLeaderCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPCanceDeptLeaderCustomizeServiceMapper lCAPCanceDeptLeaderCustomizeServiceMapper;
    @Autowired
    private LCAPUserDeptMappingService lCAPUserDeptMappingService;
    public void lCAPCanceDeptLeader(String deptId, String userId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> userList = new ArrayList<>();
        LCAPUserDeptMapping updateMapping = new LCAPUserDeptMapping();
        if (CommonFunctionUtil.hasValue(deptId, userId)) {
            userList = lCAPCanceDeptLeaderCustomizeServiceMapper.getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(deptId, userId); 
            if ((CommonFunctionUtil.length(userList).compareTo(0L) > 0)) {
                updateMapping = CommonFunctionUtil.get(userList, 0L).lCAPUserDeptMapping; 
                updateMapping.isDeptLeader = 0L; 
                lCAPUserDeptMappingService.update(updateMapping, Arrays.asList("id", "isDeptLeader"));
            } else {
            } 

        } else {
        } 

        return ;
    } 


}
