package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import com.dogfood.aa20240808.service.entities.LCAPUserService; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.service.entities.IdentitySourceConfigEntityService; 
import com.dogfood.aa20240808.domain.structure.ResponseResultStructure; 
import java.util.LinkedHashMap; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0; 
import com.dogfood.aa20240808.repository.IAMAccountBindOrUnBindCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.enumeration.UserSourceEnumEnum; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.entities.ThirdIdentityEntityService; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import com.netease.lowcode.template.logic.AuthTemplateLogic; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E4AAFE46AF05B650DD8A52B21781A53C; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.service.entities.LCAPUserRoleMappingService; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.entities.ThirdIdentityEntity; 
import com.dogfood.aa20240808.config.Constants; 
import org.springframework.util.ReflectionUtils; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4340F7F1981452AE335921E6533B20F0; 

/**
 * IAM-账号绑定或解绑
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
public class IAMAccountBindOrUnBindCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private IdentitySourceConfigEntityService identitySourceConfigEntityService;

    @Autowired
    private IAMAccountBindOrUnBindCustomizeServiceMapper iAMAccountBindOrUnBindCustomizeServiceMapper;

    @Autowired
    private ThirdIdentityEntityService thirdIdentityEntityService;

    @Autowired
    private LCAPUserService lCAPUserService;

    @Autowired
    private IAMGetConfigCustomizeService iAMGetConfigCustomizeService;

    @Autowired
    private LCAPUserRoleMappingService lCAPUserRoleMappingService;

    public ResponseResultStructure iAMAccountBindOrUnBind(String userName, String password, String openId, String name, Long identitySourceId, Boolean hasAccount, String bindOrUnbind, String passwordConfirm, Boolean isFromUserCenter) {
        LambdaParamWrapper<String> passwordWrapper = new LambdaParamWrapper<>(password);
        if (GlobalContext.notHandleValidation()) {
            if (passwordConfirm == null) {
                passwordConfirm = null; 
            } 

        } 

        List<AnonymousStructure_47C167E7217746A55100F50A57F637C0> variable1 = new ArrayList<>();
        LambdaParamWrapper<LCAPUser> userInfo = new LambdaParamWrapper<>(new LCAPUser());
        ThirdIdentityEntity thirdIdentity = new ThirdIdentityEntity();
        LambdaParamWrapper<IdentitySourceConfigEntity> identitySourceInfo = new LambdaParamWrapper<>(new IdentitySourceConfigEntity());
        LCAPUserRoleMapping userRoleMapping = new LCAPUserRoleMapping();
        List<AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> variable2 = new ArrayList<>();
        Boolean variable3 = false;
        ResponseResultStructure result = new ResponseResultStructure();
        if ((CommonFunctionUtil.notEquals(identitySourceId, null))) {
        } else {
            result.code = 0L; 
            result.msg = "参数不合法！"; 

            return result;
        } 

        identitySourceInfo.param = identitySourceConfigEntityService.get(identitySourceId); 
        if (CommonFunctionUtil.equals(bindOrUnbind, "BIND")) {
            if (CommonFunctionUtil.equals(hasAccount, true)) {
                // 有账号，输入账号密码进行绑定，验证账号密码是否正确，正确则绑定
                variable1 = CommonFunctionUtil.createListPage(iAMAccountBindOrUnBindCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(userName), iAMAccountBindOrUnBindCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(userName).intValue(), AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class).list; 
                if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
                    userInfo.param = CommonFunctionUtil.listHead(CommonFunctionUtil.listTransform(variable1, (item) -> item.lCAPUser)); 
                    if (isFromUserCenter) {
                    } else {
                        variable3 = LogicCallUtils.callWithError(() -> AuthTemplateLogic.checkLoginPassword(passwordWrapper.param, userInfo.param.password), true); 
                        if (variable3) {
                        } else {
                            result.code = 0L; 
                            result.msg = "账号或密码错误！请重新绑定"; 

                            return result;
                        } 

                    } 

                } else {
                    result.code = 0L; 
                    result.msg = "用户不存在！请注册"; 

                    return result;
                } 

                variable2 = CommonFunctionUtil.createListPage(iAMAccountBindOrUnBindCustomizeServiceMapper.getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(identitySourceId, userInfo.param), iAMAccountBindOrUnBindCustomizeServiceMapper.countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(identitySourceId, userInfo.param).intValue(), AnonymousStructure_4340F7F1981452AE335921E6533B20F0.class).list; 
                if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable2), 0L))) {
                } else {
                    result.code = 0L; 
                    result.msg = "该用户已完成此身份源的绑定！"; 

                    return result;
                } 

                thirdIdentity = CommonFunctionUtil.New(ThirdIdentityEntity.class); 
                thirdIdentity.state = identitySourceInfo.param.state; 
                thirdIdentity.identityId = identitySourceInfo.param.id; 
                thirdIdentity.userId = userInfo.param.userId; 
                thirdIdentity.openId = openId; 
                thirdIdentity.name = name; 

                thirdIdentityEntityService.create(thirdIdentity);
                result.code = 1L; 

            } else if (CommonFunctionUtil.equals(hasAccount, false)) {
                // 没有账号，输入账号密码，先创建用户，再完成绑定
                // 二次校验两次输入的密码是否一致（加密后的）
                if ((CommonFunctionUtil.equals(password, passwordConfirm))) {
                } else {
                    result.code = 0L; 
                    result.msg = "两次输入的密码不一致"; 

                    return result;
                } 

                // 校验用户名是否重复
                if (CommonFunctionUtil.contains(CommonFunctionUtil.createListPage(iAMAccountBindOrUnBindCustomizeServiceMapper.getString(), iAMAccountBindOrUnBindCustomizeServiceMapper.countString().intValue(), AnonymousStructure_E4AAFE46AF05B650DD8A52B21781A53C.class).list, userName)) {
                    result.code = 0L; 
                    result.msg = "用户名重复，请重新输入"; 

                    return result;
                } else {
                } 

                userInfo.param = CommonFunctionUtil.New(LCAPUser.class); 
                userInfo.param.userName = userName; 
                userInfo.param.userId = LogicCallUtils.callWithError(() -> AuthTemplateLogic.encryptWithMD5(new StringBuilder().append(CommonFunctionUtil.toString(userInfo.param.userName)).append(CommonFunctionUtil.toString(userInfo.param.source)).append(CommonFunctionUtil.toString(identitySourceInfo.param.id)).toString()), true); 
                userInfo.param.displayName = name; 
                userInfo.param.password = password; 
                userInfo.param.source = UserSourceEnumEnum.FIELD_Normal; 

                lCAPUserService.create(userInfo.param);
                // 绑定默认角色
                userRoleMapping = CommonFunctionUtil.New(LCAPUserRoleMapping.class); 
                userRoleMapping.roleId = iAMGetConfigCustomizeService.iAMGetConfig("APPLICATION", null).data.appConfig.loginRoleId; 
                userRoleMapping.source = CommonFunctionUtil.enumItemToText(userInfo.param.source); 
                userRoleMapping.userId = userInfo.param.userId; 
                userRoleMapping.userName = userInfo.param.userName; 

                lCAPUserRoleMappingService.create(userRoleMapping);
                // 创建三方信息表
                thirdIdentity = CommonFunctionUtil.New(ThirdIdentityEntity.class); 
                thirdIdentity.name = name; 
                thirdIdentity.userId = userInfo.param.userId; 
                thirdIdentity.openId = openId; 
                thirdIdentity.state = identitySourceInfo.param.state; 
                thirdIdentity.identityId = identitySourceInfo.param.id; 

                thirdIdentityEntityService.create(thirdIdentity);
                result.code = 1L; 

            } else {
            } 

        } else if (CommonFunctionUtil.equals(bindOrUnbind, "UNBIND")) {
            // 解绑根据当前userId及身份源id，在三方表中查出相关数据并删除即可
            variable2 = CommonFunctionUtil.createListPage(iAMAccountBindOrUnBindCustomizeServiceMapper.getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(identitySourceId, GlobalContext.getSessionVariable().currentUser), iAMAccountBindOrUnBindCustomizeServiceMapper.countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(identitySourceId, GlobalContext.getSessionVariable().currentUser).intValue(), AnonymousStructure_4340F7F1981452AE335921E6533B20F0.class).list; 
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable2), 1L))) {
                thirdIdentityEntityService.delete(CommonFunctionUtil.listHead(variable2).thirdIdentity.id);
                result.code = 1L; 

            } else {
                result.code = 0L; 
                result.msg = "数据库数据错误，存在脏数据"; 

                return result;
            } 

        } else {
            result.code = 0L; 
            result.msg = "参数错误"; 

            return result;
        } 

        return result;
    } 

    public Map<String, Object> IAMAccountBindOrUnBindValidateDefaultValue(Object ext) throws Exception {
        Map<String, Object> elements = new HashMap<>();
        try {
            Field passwordConfirm = ReflectionUtils.findField(ext.getClass(), "passwordConfirm");
            if (passwordConfirm != null) {
                ReflectionUtils.makeAccessible(passwordConfirm);
                if (ReflectionUtils.getField(passwordConfirm, ext) == null) {
                    ReflectionUtils.setField(passwordConfirm, ext, null);
                } 

                elements.put("passwordConfirm", passwordConfirm.get(ext));
            } 

        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set default value error", e);
            throw e; 
        } 
        return elements;
    } 

    public Map<String, Object> IAMAccountBindOrUnBindValidateRestDefaultValue(String userName, String password, String openId, String name, Long identitySourceId, Boolean hasAccount, String bindOrUnbind, String passwordConfirm, Boolean isFromUserCenter) throws Exception {
        Map<String, Object> elements = new LinkedHashMap<>();
        try {
            elements.put("userName", userName);
            elements.put("password", password);
            elements.put("openId", openId);
            elements.put("name", name);
            elements.put("identitySourceId", identitySourceId);
            elements.put("hasAccount", hasAccount);
            elements.put("bindOrUnbind", bindOrUnbind);
            if (passwordConfirm == null) {
                passwordConfirm = null; 
            } 

            elements.put("passwordConfirm", passwordConfirm);
            elements.put("isFromUserCenter", isFromUserCenter);
        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set rest default value error", e);
            throw e; 
        } 
        return elements;
    } 

}
