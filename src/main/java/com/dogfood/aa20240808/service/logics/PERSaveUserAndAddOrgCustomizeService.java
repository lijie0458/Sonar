package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.UserOrgMappingEntityService; 
import com.dogfood.aa20240808.service.entities.LCAPUserService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.UserOrgMappingEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter; 
import com.netease.lowcode.template.logic.AuthTemplateLogic; 
import com.dogfood.aa20240808.service.dto.filters.logic.binary.compare.EqualQueryFilter; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.service.entities.LCAPUserRoleMappingService; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.dto.filters.atomic.IdentifierQueryFilter; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter.Property; 

/**
 * PER-创建/修改用户并绑定角色和组织
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
public class PERSaveUserAndAddOrgCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPUserService lCAPUserService;

    @Autowired
    private UserOrgMappingEntityService userOrgMappingEntityService;

    @Autowired
    private LCAPUserRoleMappingService lCAPUserRoleMappingService;

    public void pERSaveUserAndAddOrg(LCAPUser user, UserOrgMappingEntity userOrgMapping, Boolean isUpdate, List<Long> roleIdList) {
        LambdaParamWrapper<LCAPUser> userWrapper = new LambdaParamWrapper<>(user);
        LCAPUserRoleMapping tmp = new LCAPUserRoleMapping();
        List<LCAPUserRoleMapping> batchCreateBody = new ArrayList<>();
        if (isUpdate) {
            userWrapper.param = lCAPUserService.update(userWrapper.param, null); 
            userOrgMappingEntityService.update(userOrgMapping, null);
            lCAPUserRoleMappingService.deleteBy(new EqualQueryFilter().left(new ColumnQueryFilter("", "", "userId", "userId", new ColumnQueryFilter.Property("", "userId"))).right(new IdentifierQueryFilter("userId", userWrapper.param.userId)));
        } else {
            userWrapper.param.userId = LogicCallUtils.callWithError(() -> AuthTemplateLogic.encryptWithMD5(new StringBuilder().append(CommonFunctionUtil.toString(userWrapper.param.userName)).append(CommonFunctionUtil.toString(userWrapper.param.source)).toString()), true); 
            user = lCAPUserService.create(user); 
            userOrgMapping.userId = user.id; 
            userOrgMappingEntityService.create(userOrgMapping);
        } 

        for (Long index = 0L; index < roleIdList.size(); index++) {
            Long item = roleIdList.get(index.intValue());
            tmp.userId = user.userId; 
            tmp.userName = user.userName; 
            tmp.source = CommonFunctionUtil.convert(user.source, String.class); 
            tmp.roleId = item; 

            CommonFunctionUtil.add(batchCreateBody, CommonFunctionUtil.clone(tmp));
        } 

        lCAPUserRoleMappingService.batchCreate(batchCreateBody);
        return ;
    } 

}
