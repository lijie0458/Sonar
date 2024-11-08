package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.entities.LCAPUserDeptMappingService; 
import com.dogfood.aa20240808.service.dto.filters.atomic.IdentifierQueryFilter; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter.Property; 
import com.dogfood.aa20240808.service.dto.filters.logic.binary.matching.InQueryFilter; 

/**
 * 批量从部门添加成员
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
public class LCAPBatchAddDeptUserCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPUserDeptMappingService lCAPUserDeptMappingService;

    public void lCAPBatchAddDeptUser(List<String> userIds, String deptId) {
        List<LCAPUserDeptMapping> userDeptMapList = new ArrayList<>();
        LCAPUserDeptMapping userDeptMap = new LCAPUserDeptMapping();
        if (CommonFunctionUtil.hasValue(deptId, userIds)) {
            lCAPUserDeptMappingService.deleteBy(new InQueryFilter().left(new ColumnQueryFilter("", "", "userId", "userId", new ColumnQueryFilter.Property("", "userId"))).right(new IdentifierQueryFilter("userIds", userIds)));
            userDeptMap.deptId = deptId; 
            userDeptMap.isDeptLeader = 0L; 
            for (Long index = 0L; index < userIds.size(); index++) {
                String item = userIds.get(index.intValue());
                userDeptMap.userId = item; 
                CommonFunctionUtil.add(userDeptMapList, CommonFunctionUtil.clone(userDeptMap));
            } 

            lCAPUserDeptMappingService.batchCreate(userDeptMapList);
        } else {
        } 

        return ;
    } 

}
