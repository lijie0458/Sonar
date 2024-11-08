package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPSetDeptLeaderCustomizeServiceMapper; 
import com.dogfood.aa20240808.service.entities.LCAPUserDeptMappingService; 

/**
 * 设置部门主管
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
public class LCAPSetDeptLeaderCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPSetDeptLeaderCustomizeServiceMapper lCAPSetDeptLeaderCustomizeServiceMapper;

    @Autowired
    private LCAPUserDeptMappingService lCAPUserDeptMappingService;

    public void lCAPSetDeptLeader(String deptId, String userId) {
        LambdaParamWrapper<String> userIdWrapper = new LambdaParamWrapper<>(userId);
        List<AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> userList = new ArrayList<>();
        LCAPUserDeptMapping updateMapping = new LCAPUserDeptMapping();
        if (CommonFunctionUtil.hasValue(deptId, userIdWrapper.param)) {
            userList = lCAPSetDeptLeaderCustomizeServiceMapper.getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(deptId); 
            for (Long index = 0L; index < userList.size(); index++) {
                AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2 item = userList.get(index.intValue());
                if ((CommonFunctionUtil.equals(item.lCAPUserDeptMapping.isDeptLeader, 1L))) {
                    item.lCAPUserDeptMapping.isDeptLeader = 0L; 
                    lCAPUserDeptMappingService.update(item.lCAPUserDeptMapping, Arrays.asList("id", "isDeptLeader"));
                } else {
                } 

            } 

            if ((CommonFunctionUtil.length(userList).compareTo(0L) > 0)) {
                updateMapping = CommonFunctionUtil.listFind(userList, (item) -> (CommonFunctionUtil.equals(item.lCAPUserDeptMapping.userId, userIdWrapper.param))).lCAPUserDeptMapping; 
                updateMapping.isDeptLeader = 1L; 
                lCAPUserDeptMappingService.update(updateMapping, Arrays.asList("id", "isDeptLeader"));
            } else {
            } 

        } else {
        } 

        return ;
    } 

}
