package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 
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
public class LCAPIsAlreadBindUserIdListCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPGetRoleBindUserListCustomizeService lCAPGetRoleBindUserListCustomizeService;

    public Boolean lCAPIsAlreadBindUserIdList(String newUserId, Long inputRoleId) {
        List<String> userIdList = new ArrayList<>();
        List<AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5> userList = new ArrayList<>();
        Boolean result = false;
        userList = lCAPGetRoleBindUserListCustomizeService.lCAPGetRoleBindUserList(inputRoleId); 
        for (Long i = 0L; i < CommonFunctionUtil.length(userList); i++) {
            AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5 item = userList.get(i.intValue());
            CommonFunctionUtil.add(userIdList, item.lCAPUserRoleMapping.userId);
        } 

        if (CommonFunctionUtil.contains(userIdList, newUserId)) {
            result = true; 
        } else {
            result = false; 
        } 

        return result;
    } 

}
