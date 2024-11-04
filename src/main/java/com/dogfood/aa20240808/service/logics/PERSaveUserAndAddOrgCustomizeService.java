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
            userWrapper.param.userId = LogicCallUtils.callWithError(() -> com.netease.lowcode.template.logic.AuthTemplateLogic.encryptWithMD5(new StringBuilder().append(CommonFunctionUtil.toString(userWrapper.param.userName)).append(CommonFunctionUtil.toString(userWrapper.param.source)).toString()), true); 
            userWrapper.param = lCAPUserService.create(userWrapper.param); 
            userOrgMapping.userId = userWrapper.param.id; 
            userOrgMappingEntityService.create(userOrgMapping);
        } 

        for (Long index = 0L; index < roleIdList.size(); index++) {
            Long item = roleIdList.get(index.intValue());
            tmp.userId = userWrapper.param.userId; 
            tmp.userName = userWrapper.param.userName; 
            tmp.source = CommonFunctionUtil.convert(userWrapper.param.source, String.class); 
            tmp.roleId = item; 

            CommonFunctionUtil.add(batchCreateBody, CommonFunctionUtil.clone(tmp));
        } 

        lCAPUserRoleMappingService.batchCreate(batchCreateBody);
        return ;
    } 


}
