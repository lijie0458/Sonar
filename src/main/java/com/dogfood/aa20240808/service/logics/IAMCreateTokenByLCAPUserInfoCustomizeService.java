package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.IAMCreateTokenByLCAPUserInfoCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.GlobalContext; 
import com.dogfood.aa20240808.service.entities.LCAPUserService; 
import java.util.HashMap; 
import java.util.ArrayList; 
import java.util.LinkedHashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.UserSourceEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.entities.ThirdIdentityEntityService; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.service.entities.LCAPUserRoleMappingService; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.entities.ThirdIdentityEntity; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.AppConfigEntity; 
import com.dogfood.aa20240808.domain.enumeration.LoginIdentityTypeEnumEnum; 
import org.springframework.util.ReflectionUtils; 

@Service
public class IAMCreateTokenByLCAPUserInfoCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private IAMCreateTokenByLCAPUserInfoCustomizeServiceMapper iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper;
    @Autowired
    private IAMGetConfigCustomizeService iAMGetConfigCustomizeService;
    @Autowired
    private LCAPUserRoleMappingService lCAPUserRoleMappingService;
    @Autowired
    private LCAPUserService lCAPUserService;
    @Autowired
    private ThirdIdentityEntityService thirdIdentityEntityService;
    public com.netease.lowcode.auth.domain.LCAPUser iAMCreateTokenByLCAPUserInfo(String openid, String source, Long identityId, String name, Boolean isAccountBindCreate) {
        LambdaParamWrapper<String> openidWrapper = new LambdaParamWrapper<>(openid);
        LambdaParamWrapper<String> sourceWrapper = new LambdaParamWrapper<>(source);
        LambdaParamWrapper<Long> identityIdWrapper = new LambdaParamWrapper<>(identityId);
        LambdaParamWrapper<String> nameWrapper = new LambdaParamWrapper<>(name);
        if (GlobalContext.notHandleValidation()) {
            if (isAccountBindCreate == null) {
                isAccountBindCreate = false; 
            } 

        } 

        ThirdIdentityEntity thirdIdentityInfo = new ThirdIdentityEntity();
        com.netease.lowcode.auth.domain.LCAPUser lcapUserStructure = new com.netease.lowcode.auth.domain.LCAPUser();
        LambdaParamWrapper<LCAPUser> lcapUser = new LambdaParamWrapper<>(new LCAPUser());
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> thirdIdentityInfo1 = new ArrayList<>();
        LCAPUserRoleMapping inputUserRolemapping = new LCAPUserRoleMapping();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5> variable1 = new ArrayList<>();
        Long curRepeatIntSuffix = 0L;
        String suffix = "";
        AppConfigEntity appConfig = new AppConfigEntity();
        String pattern = "";
        String lastRepeatUserName = "";
        Long defaultRoleId = 0L;
        List<String> userNameList = new ArrayList<>();
        com.netease.lowcode.auth.domain.LCAPUser result = new com.netease.lowcode.auth.domain.LCAPUser();
        thirdIdentityInfo1 = CommonFunctionUtil.createListPage(iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(openidWrapper.param, identityIdWrapper.param), iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(openidWrapper.param, identityIdWrapper.param).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4340F7F1981452AE335921E6533B20F0.class).list; 
        appConfig = iAMGetConfigCustomizeService.iAMGetConfig("APPLICATION", null).data.appConfig; 
        defaultRoleId = appConfig.loginRoleId; 
        if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(thirdIdentityInfo1), 0L))) {
            thirdIdentityInfo = CommonFunctionUtil.listHead(thirdIdentityInfo1).thirdIdentity; 
            lcapUser.param = CommonFunctionUtil.listHead(CommonFunctionUtil.createListPage(iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(thirdIdentityInfo), iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(thirdIdentityInfo).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class).list).lCAPUser; 
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(CommonFunctionUtil.createListPage(iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.getAnonymousStructure_70791B893F53C2EFB9E501591763B020(defaultRoleId), iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.countAnonymousStructure_70791B893F53C2EFB9E501591763B020(defaultRoleId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class).list), 0L))) {
            } else {
                inputUserRolemapping.source = CommonFunctionUtil.enumValueToText(lcapUser.param.source, UserSourceEnumEnum.class); 
                inputUserRolemapping.userId = lcapUser.param.userId; 
                inputUserRolemapping.userName = lcapUser.param.userName; 
                inputUserRolemapping.roleId = defaultRoleId; 

                variable1 = CommonFunctionUtil.createListPage(iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.getAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(inputUserRolemapping), iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.countAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(inputUserRolemapping).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DE9B8001DA9BE446985BA45040CA18.class).list; 
                if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1), 0L))) {
                    lCAPUserRoleMappingService.create(inputUserRolemapping);
                } else {
                } 

            } 

        } else {
            thirdIdentityInfo = CommonFunctionUtil.New(ThirdIdentityEntity.class); 
            lcapUser.param.userName = LogicCallUtils.callWithError(() -> com.netease.lowcode.template.logic.AuthTemplateLogic.pinyinChange(nameWrapper.param), true); 
            userNameList = CommonFunctionUtil.createListPage(iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.getString(), iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.countString().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E4AAFE46AF05B650DD8A52B21781A53C.class).list; 
            if (CommonFunctionUtil.contains(userNameList, lcapUser.param.userName)) {
                pattern = new StringBuilder().append(CommonFunctionUtil.toString("^")).append(CommonFunctionUtil.toString(lcapUser.param.userName)).append(CommonFunctionUtil.toString("[0-9]*$")).toString(); 
                lastRepeatUserName = iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.getSql1(pattern); 
                if ((CommonFunctionUtil.equals(lcapUser.param.userName, lastRepeatUserName))) {
                    lcapUser.param.userName = new StringBuilder().append(CommonFunctionUtil.toString(lcapUser.param.userName)).append(CommonFunctionUtil.toString("01")).toString(); 
                } else {
                    curRepeatIntSuffix = (CommonFunctionUtil.convert(CommonFunctionUtil.subString(lastRepeatUserName, CommonFunctionUtil.length(lcapUser.param.userName), (CommonFunctionUtil.length(lastRepeatUserName) - CommonFunctionUtil.length(lcapUser.param.userName))), Long.class) + 1L); 
                    if ((curRepeatIntSuffix.compareTo(10L) < 0)) {
                        suffix = new StringBuilder().append(CommonFunctionUtil.toString("0")).append(CommonFunctionUtil.toString(curRepeatIntSuffix)).toString(); 
                    } else {
                        suffix = CommonFunctionUtil.convert(curRepeatIntSuffix, String.class); 
                    } 

                    lcapUser.param.userName = new StringBuilder().append(CommonFunctionUtil.toString(lcapUser.param.userName)).append(CommonFunctionUtil.toString(suffix)).toString(); 
                } 

            } else {
            } 

            lcapUser.param.displayName = nameWrapper.param; 
            lcapUser.param.source = UserSourceEnumEnum.FIELD_Normal; 
            lcapUser.param.userId = LogicCallUtils.callWithError(() -> com.netease.lowcode.template.logic.AuthTemplateLogic.encryptWithMD5(new StringBuilder().append(CommonFunctionUtil.toString(lcapUser.param.userName)).append(CommonFunctionUtil.toString(lcapUser.param.source)).append(CommonFunctionUtil.toString(identityIdWrapper.param)).toString()), true); 
            lcapUser.param = lCAPUserService.create(lcapUser.param); 
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(CommonFunctionUtil.createListPage(iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.getAnonymousStructure_70791B893F53C2EFB9E501591763B0201(defaultRoleId), iAMCreateTokenByLCAPUserInfoCustomizeServiceMapper.countAnonymousStructure_70791B893F53C2EFB9E501591763B0201(defaultRoleId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class).list), 0L))) {
            } else {
                inputUserRolemapping.source = CommonFunctionUtil.enumValueToText(lcapUser.param.source, UserSourceEnumEnum.class); 
                inputUserRolemapping.userId = lcapUser.param.userId; 
                inputUserRolemapping.userName = lcapUser.param.userName; 
                inputUserRolemapping.roleId = defaultRoleId; 

                lCAPUserRoleMappingService.create(inputUserRolemapping);
            } 

            thirdIdentityInfo.openId = openidWrapper.param; 
            thirdIdentityInfo.userId = lcapUser.param.userId; 
            thirdIdentityInfo.name = nameWrapper.param; 
            thirdIdentityInfo.identityId = identityIdWrapper.param; 

            thirdIdentityInfo.state = CommonFunctionUtil.toEnumItem(sourceWrapper.param, IdentitySourceStateEnumEnum.class); 
            thirdIdentityEntityService.create(thirdIdentityInfo);
        } 

        lcapUserStructure.userId = lcapUser.param.userId; 
        lcapUserStructure.userName = lcapUser.param.userName; 
        lcapUserStructure.extensionInfos = CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map383 -> {
    _map383.put(sourceWrapper.param, openidWrapper.param);
} ); 

        if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Single)) {
            if ((((CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_OAuth, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class))) || (CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_CAS, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class)))) || ((CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_SSO, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class))) || (CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_wechat, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class)))))) {
                result = lcapUserStructure; 
            } else {
                com.netease.lowcode.auth.LCAPAuthService.createToken(lcapUserStructure);
            } 

        } else if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Multiple)) {
            if (isAccountBindCreate) {
                com.netease.lowcode.auth.LCAPAuthService.createToken(lcapUserStructure);
            } else {
                if ((((CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_OAuth, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class))) || (CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_CAS, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class)))) || ((CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_SSO, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class))) || (CommonFunctionUtil.equals(UserSourceEnumEnum.FIELD_wechat, CommonFunctionUtil.toEnumItem(sourceWrapper.param, UserSourceEnumEnum.class)))))) {
                    result = lcapUserStructure; 
                } else {
                    com.netease.lowcode.auth.LCAPAuthService.createToken(lcapUserStructure);
                } 

            } 

        } else {
        } 

        return result;
    } 

    public Map<String, Object> IAMCreateTokenByLCAPUserInfoValidateDefaultValue(Object ext) throws Exception {
        Map<String, Object> elements = new HashMap<>();
        try {
            Field isAccountBindCreate = ReflectionUtils.findField(ext.getClass(), "isAccountBindCreate");
            if (isAccountBindCreate != null) {
                ReflectionUtils.makeAccessible(isAccountBindCreate);
                if (ReflectionUtils.getField(isAccountBindCreate, ext) == null) {
                    ReflectionUtils.setField(isAccountBindCreate, ext, false);
                } 

                elements.put("isAccountBindCreate", isAccountBindCreate.get(ext));
            } 

        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set default value error", e);
            throw e; 
        } 
        return elements;
    } 

    public Map<String, Object> IAMCreateTokenByLCAPUserInfoValidateRestDefaultValue(String openid, String source, Long identityId, String name, Boolean isAccountBindCreate) throws Exception {
        Map<String, Object> elements = new LinkedHashMap<>();
        try {
            elements.put("openid", openid);
            elements.put("source", source);
            elements.put("identityId", identityId);
            elements.put("name", name);
            if (isAccountBindCreate == null) {
                isAccountBindCreate = false; 
            } 

            elements.put("isAccountBindCreate", isAccountBindCreate);
        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set rest default value error", e);
            throw e; 
        } 
        return elements;
    } 


}
