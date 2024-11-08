package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.netease.lowcode.template.common.structure.IAMUserInfo; 
import com.netease.lowcode.template.common.structure.UserConfigRequest; 
import com.netease.lowcode.template.common.structure.CasConfigInfo; 
import java.util.List; 
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.netease.lowcode.template.common.structure.WeChatConfigInfo; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.util.JacksonUtils; 
import com.netease.lowcode.template.common.structure.OAuthConfigInfo; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import com.netease.lowcode.template.logic.AuthTemplateLogic; 
import java.util.Map; 
import org.springframework.transaction.annotation.Transactional; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.netease.lowcode.auth.domain.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 
import com.netease.lowcode.template.common.structure.LoginFunctionInput; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.netease.lowcode.template.common.structure.LoginFunctionOutput; 
import com.fasterxml.jackson.core.type.TypeReference; 
import org.slf4j.LoggerFactory; 
import com.netease.lowcode.template.common.structure.SSOConfigInfo; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.AppConfigEntity; 
import com.netease.lowcode.template.common.structure.TokenConfigRequest; 
import com.dogfood.aa20240808.domain.enumeration.LoginIdentityTypeEnumEnum; 
import com.dogfood.aa20240808.repository.IAMFunctionLogicCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4340F7F1981452AE335921E6533B20F0; 

/**
 * IAM-依赖库函数
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
public class IAMFunctionLogicCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private IAMFunctionLogicCustomizeServiceMapper iAMFunctionLogicCustomizeServiceMapper;

    @Autowired
    private IAMGetConfigCustomizeService iAMGetConfigCustomizeService;

    @Autowired
    private IAMCreateTokenByLCAPUserInfoCustomizeService iAMCreateTokenByLCAPUserInfoCustomizeService;

    @Autowired
    private IAMGetUserByUserIdCustomizeService iAMGetUserByUserIdCustomizeService;

    @Autowired
    private IAMAccountBindOrUnBindCustomizeService iAMAccountBindOrUnBindCustomizeService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private IAMOperateCacheCustomizeService iAMOperateCacheCustomizeService;

    @Transactional()
    public LoginFunctionOutput iAMFunctionLogic(LoginFunctionInput param1) {
        LambdaParamWrapper<LoginFunctionInput> param1Wrapper = new LambdaParamWrapper<>(param1);
        List<IdentitySourceConfigEntity> variable1 = new ArrayList<>();
        LambdaParamWrapper<IdentitySourceConfigEntity> identitySource = new LambdaParamWrapper<>(new IdentitySourceConfigEntity());
        TokenConfigRequest oauthTokenRequest = new TokenConfigRequest();
        UserConfigRequest userRequest = new UserConfigRequest();
        OAuthConfigInfo OauthConfigInfo = new OAuthConfigInfo();
        LambdaParamWrapper<IdentitySourceConfigEntity> identityConfig = new LambdaParamWrapper<>(new IdentitySourceConfigEntity());
        LCAPUser variable2 = new LCAPUser();
        IAMUserInfo variable3 = new IAMUserInfo();
        CasConfigInfo casConfig = new CasConfigInfo();
        SSOConfigInfo ssoConfig = new SSOConfigInfo();
        AppConfigEntity appConfig = new AppConfigEntity();
        String userInfoStr = "";
        Map<String, String> cacheKeyMap = new HashMap<>();
        String key = "";
        WeChatConfigInfo wechatConfigInfo = new WeChatConfigInfo();
        com.dogfood.aa20240808.domain.entities.LCAPUser userInfo = new com.dogfood.aa20240808.domain.entities.LCAPUser();
        IAMUserInfo variable4 = new IAMUserInfo();
        LoginFunctionOutput result = new LoginFunctionOutput();
        if (CommonFunctionUtil.equals(CommonFunctionUtil.toEnumItem(param1Wrapper.param.state, IdentitySourceStateEnumEnum.class), IdentitySourceStateEnumEnum.FIELD_OAuth)) {
            if ((CommonFunctionUtil.equals(param1Wrapper.param.action, "READ_CONFIG"))) {
                if ((CommonFunctionUtil.equals(param1Wrapper.param.code, null))) {
                    // 当前只开了一种身份源
                    variable1 = iAMFunctionLogicCustomizeServiceMapper.getSql1(); 
                    if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(variable1), 1L))) {
                        LCAP_LOGGER.info(CommonFunctionUtil.toString("身份源配置异常！"));
                        result = null; 
                        return result;
                    } else {
                        identitySource.param = CommonFunctionUtil.get(variable1, 0L); 
                    } 

                } else {
                    identitySource.param = iAMFunctionLogicCustomizeServiceMapper.getSql2(param1Wrapper.param); 
                    if ((CommonFunctionUtil.equals(identitySource.param, null))) {
                        LCAP_LOGGER.info(CommonFunctionUtil.toString("身份源配置异常！"));
                        result = null; 
                        return result;
                    } else {
                    } 

                } 

                oauthTokenRequest.tokenMethod = identitySource.param.tokenMethod; 
                oauthTokenRequest.tokenUrl = identitySource.param.tokenUrl; 
                oauthTokenRequest.headerMap = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptTempMap(identitySource.param.tokenHeaderMap), true); 
                oauthTokenRequest.requestMap = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptTempMap(identitySource.param.tokenBodyMap), true); 

                userRequest.userMethod = identitySource.param.userMethod; 
                userRequest.userUrl = identitySource.param.userUrl; 
                userRequest.userNameKeyStr = identitySource.param.userNameRes; 
                userRequest.userIdKeyStr = identitySource.param.userIdRes; 
                userRequest.headerMap = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptTempMap(identitySource.param.userHeaderMap), true); 
                userRequest.requestMap = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptTempMap(identitySource.param.userBodyMap), true); 

                OauthConfigInfo.userConfigRequest = userRequest; 
                OauthConfigInfo.tokenRequest = oauthTokenRequest; 
                OauthConfigInfo.authUrl = identitySource.param.centerLoginUrl; 
                OauthConfigInfo.successUrl = identitySource.param.successUrl; 

                result.oAuthConfigInfo = OauthConfigInfo; 
                return result;
            } else if ((CommonFunctionUtil.equals(param1Wrapper.param.action, "EID_USER"))) {
                identityConfig.param = iAMFunctionLogicCustomizeServiceMapper.getSql3(param1Wrapper.param); 
                appConfig = iAMGetConfigCustomizeService.iAMGetConfig("APPLICATION", null).data.appConfig; 
                if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Single)) {
                    variable2 = iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(param1Wrapper.param.iamUserInfo.userId, "OAuth", identityConfig.param.id, param1Wrapper.param.iamUserInfo.userName, null); 
                    variable3.userId = variable2.userId; 
                    variable3.userName = variable2.userName; 

                    result.IAMUserInfo = variable3; 
                    return result;
                } else if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Multiple)) {
                    if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(CommonFunctionUtil.createListPage(iAMFunctionLogicCustomizeServiceMapper.getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(param1Wrapper.param), iAMFunctionLogicCustomizeServiceMapper.countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(param1Wrapper.param).intValue(), AnonymousStructure_4340F7F1981452AE335921E6533B20F0.class).list), 0L))) {
                        if ((CommonFunctionUtil.notEquals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                            userInfo = iAMGetUserByUserIdCustomizeService.iAMGetUserByUserId(GlobalContext.getSessionVariable().currentUser.userId); 
                            iAMAccountBindOrUnBindCustomizeService.iAMAccountBindOrUnBind(userInfo.userName, userInfo.password, param1Wrapper.param.iamUserInfo.userId, param1Wrapper.param.iamUserInfo.userName, identityConfig.param.id, true, "BIND", null, true);
                            LogicCallUtils.callWithError(() -> AuthTemplateLogic.nasl$$enhance$$redirectUri(new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=ok")).toString()), true);
                        } else {
                            LogicCallUtils.callWithError(() -> AuthTemplateLogic.nasl$$enhance$$redirectUri(new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/account_bind?openId=")).append(CommonFunctionUtil.toString(param1Wrapper.param.iamUserInfo.userId)).append(CommonFunctionUtil.toString("&name=")).append(CommonFunctionUtil.toString(param1Wrapper.param.iamUserInfo.userName)).append(CommonFunctionUtil.toString("&identitySourceId=")).append(CommonFunctionUtil.toString(identityConfig.param.id)).toString()), true);
                        } 

                        return result;
                    } else {
                        if ((CommonFunctionUtil.equals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                            variable2 = iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(param1Wrapper.param.iamUserInfo.userId, "OAuth", identityConfig.param.id, param1Wrapper.param.iamUserInfo.userName, null); 
                            variable3.userId = variable2.userId; 
                            variable3.userName = variable2.userName; 

                            result.IAMUserInfo = variable3; 
                        } else {
                            LogicCallUtils.callWithError(() -> AuthTemplateLogic.nasl$$enhance$$redirectUri(new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=error")).toString()), true);
                        } 

                        return result;
                    } 

                } else {
                } 

            } 

        } else if (CommonFunctionUtil.equals(CommonFunctionUtil.toEnumItem(param1Wrapper.param.state, IdentitySourceStateEnumEnum.class), IdentitySourceStateEnumEnum.FIELD_CAS)) {
            if ((CommonFunctionUtil.equals(param1Wrapper.param.action, "READ_CONFIG"))) {
                variable1 = iAMFunctionLogicCustomizeServiceMapper.getSql4(); 
                if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(variable1), 1L))) {
                    LCAP_LOGGER.info(CommonFunctionUtil.toString("身份源配置异常！"));
                    result = null; 
                    return result;
                } else {
                    identitySource.param = CommonFunctionUtil.get(variable1, 0L); 
                    casConfig.centerLoginUrl = identitySource.param.centerLoginUrl; 
                    casConfig.centerLogoutUrl = identitySource.param.centerLogoutUrl; 
                    casConfig.successRedirectPage = identitySource.param.successUrl; 
                    casConfig.ticketUrl = identitySource.param.casTicketUrl; 

                    result.casConfigInfo = casConfig; 
                    return result;
                } 

            } else if ((CommonFunctionUtil.equals(param1Wrapper.param.action, "EID_USER"))) {
                identityConfig.param = iAMFunctionLogicCustomizeServiceMapper.getSql5(); 
                appConfig = iAMGetConfigCustomizeService.iAMGetConfig("APPLICATION", null).data.appConfig; 
                if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Single)) {
                    variable2 = iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(param1Wrapper.param.iamUserInfo.userId, "CAS", identityConfig.param.id, param1Wrapper.param.iamUserInfo.userName, null); 
                    variable3.userId = variable2.userId; 
                    variable3.userName = variable2.userName; 

                    result.IAMUserInfo = variable3; 
                    return result;
                } else if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Multiple)) {
                    if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(CommonFunctionUtil.createListPage(iAMFunctionLogicCustomizeServiceMapper.getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(param1Wrapper.param), iAMFunctionLogicCustomizeServiceMapper.countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(param1Wrapper.param).intValue(), AnonymousStructure_4340F7F1981452AE335921E6533B20F0.class).list), 0L))) {
                        if ((CommonFunctionUtil.notEquals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                            userInfo = iAMGetUserByUserIdCustomizeService.iAMGetUserByUserId(GlobalContext.getSessionVariable().currentUser.userId); 
                            iAMAccountBindOrUnBindCustomizeService.iAMAccountBindOrUnBind(userInfo.userName, userInfo.password, param1Wrapper.param.iamUserInfo.userId, param1Wrapper.param.iamUserInfo.userName, identityConfig.param.id, true, "BIND", null, true);
                            LogicCallUtils.callWithError(() -> AuthTemplateLogic.nasl$$enhance$$redirectUri(new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=ok")).toString()), true);
                        } else {
                            LogicCallUtils.callWithError(() -> AuthTemplateLogic.nasl$$enhance$$redirectUri(new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/account_bind?openId=")).append(CommonFunctionUtil.toString(param1Wrapper.param.iamUserInfo.userId)).append(CommonFunctionUtil.toString("&name=")).append(CommonFunctionUtil.toString(param1Wrapper.param.iamUserInfo.userName)).append(CommonFunctionUtil.toString("&identitySourceId=")).append(CommonFunctionUtil.toString(identityConfig.param.id)).toString()), true);
                        } 

                        return result;
                    } else {
                        if ((CommonFunctionUtil.equals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                            variable2 = iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(param1.iamUserInfo.userId, "CAS", identityConfig.param.id, param1.iamUserInfo.userName, null); 
                            variable3.userId = variable2.userId; 
                            variable3.userName = variable2.userName; 

                            result.IAMUserInfo = variable3; 
                        } else {
                            LogicCallUtils.callWithError(() -> AuthTemplateLogic.nasl$$enhance$$redirectUri(new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=error")).toString()), true);
                        } 

                        return result;
                    } 

                } else {
                } 

                return result;
            } 

        } else if (CommonFunctionUtil.equals(CommonFunctionUtil.toEnumItem(param1Wrapper.param.state, IdentitySourceStateEnumEnum.class), IdentitySourceStateEnumEnum.FIELD_SSO)) {
            if ((CommonFunctionUtil.equals(param1.code, null))) {
                // 当前只开了一种身份源
                variable1 = iAMFunctionLogicCustomizeServiceMapper.getSql6(); 
                if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(variable1), 1L))) {
                    LCAP_LOGGER.info(CommonFunctionUtil.toString("身份源配置异常！"));
                    result = null; 
                    return result;
                } else {
                    identitySource.param = CommonFunctionUtil.get(variable1, 0L); 
                } 

            } else {
                identitySource.param = iAMFunctionLogicCustomizeServiceMapper.getSql7(param1Wrapper.param); 
                if ((CommonFunctionUtil.equals(identitySource.param, null))) {
                    LCAP_LOGGER.info(CommonFunctionUtil.toString("身份源配置异常！"));
                    result = null; 
                    return result;
                } else {
                } 

            } 

            userRequest.userMethod = identitySource.param.userMethod; 
            userRequest.userUrl = identitySource.param.userUrl; 
            userRequest.userNameKeyStr = identitySource.param.userNameRes; 
            userRequest.userIdKeyStr = identitySource.param.userIdRes; 
            userRequest.headerMap = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptTempMap(identitySource.param.userHeaderMap), true); 
            userRequest.requestMap = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptTempMap(identitySource.param.userBodyMap), true); 

            ssoConfig.userConfigRequest = userRequest; 
            ssoConfig.successUrl = identitySource.param.successUrl; 

            result.ssoConfigInfo = ssoConfig; 
        } else if (CommonFunctionUtil.equals(CommonFunctionUtil.toEnumItem(param1Wrapper.param.state, IdentitySourceStateEnumEnum.class), IdentitySourceStateEnumEnum.FIELD_wechat)) {
            if ((CommonFunctionUtil.equals(param1.action, "EID_USER"))) {
                LCAP_LOGGER.info(CommonFunctionUtil.toString("写缓存"));
                // 写缓存
                cacheKeyMap = ((Map<String, String>) JacksonUtils.fromJson(param1.iamUserInfo.attributesStr, new TypeReference<Map<String, String>>() {
} )); 
                key = CommonFunctionUtil.mapGet(cacheKeyMap, "wechat_cache"); 
                // 写缓存
                userInfoStr = iAMOperateCacheCustomizeService.iAMOperateCache(key, true, JacksonUtils.toJson(param1.iamUserInfo)); 
                LCAP_LOGGER.info(CommonFunctionUtil.toString("缓存写入完成"));
                userInfo = iAMFunctionLogicCustomizeServiceMapper.getSql8(param1Wrapper.param); 
                LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("wechat user info:")).append(CommonFunctionUtil.toString(userInfo)).append(CommonFunctionUtil.toString(" ")).toString()));
                if (((CommonFunctionUtil.equals(userInfo, null)) || (CommonFunctionUtil.equals(userInfo.userName, null)))) {
                    variable4.userId = param1.iamUserInfo.userId; 
                    variable4.userName = param1.iamUserInfo.userName; 

                } else {
                    variable4.userId = userInfo.userId; 
                    variable4.userName = userInfo.userName; 

                } 

                result.IAMUserInfo = variable4; 
                return result;
            } else if ((CommonFunctionUtil.equals(param1.action, "READ_CONFIG"))) {
                // 读取配置
                identitySource.param = iAMFunctionLogicCustomizeServiceMapper.getSql9(); 
                if ((CommonFunctionUtil.equals(identitySource.param, null))) {
                    LCAP_LOGGER.info(CommonFunctionUtil.toString("身份源配置异常！"));
                    result = null; 
                    return result;
                } else {
                } 

                wechatConfigInfo.appSecret = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptWithBase64AndDes(identitySource.param.appSecret), true); 
                wechatConfigInfo.appId = identitySource.param.appId; 
                wechatConfigInfo.successUrl = identitySource.param.successUrl; 
                wechatConfigInfo.token = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptWithBase64AndDes(identitySource.param.wechatToken), true); 
                wechatConfigInfo.encodingAESKey = LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptWithBase64AndDes(identitySource.param.wechatMsgSecret), true); 
                wechatConfigInfo.wechatMsgMethod = CommonFunctionUtil.convert(identitySource.param.wechatMsgMethod, String.class); 

                result.weChatConfigInfo = wechatConfigInfo; 
                return result;
            } else if ((CommonFunctionUtil.equals(param1.action, "READ_CACHE"))) {
                if ((CommonFunctionUtil.equals(param1.key, null))) {
                    return result;
                } else {
                } 

                userInfoStr = iAMOperateCacheCustomizeService.iAMOperateCache(param1.key, null, null); 
                if ((CommonFunctionUtil.equals(userInfoStr, null))) {
                    return result;
                } else {
                } 

                variable3 = JacksonUtils.fromJson(userInfoStr, IAMUserInfo.class); 
                // 判断当前用户是否已注册，没注册，跳转到绑定账号的页面
                identityConfig.param = iAMFunctionLogicCustomizeServiceMapper.getSql10(); 
                appConfig = iAMGetConfigCustomizeService.iAMGetConfig("APPLICATION", null).data.appConfig; 
                if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Single)) {
                    variable2 = iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(variable3.userId, "wechat", identityConfig.param.id, variable3.userName, null); 
                    variable3.userId = variable2.userId; 
                    variable3.userName = variable2.userName; 

                    result.IAMUserInfo = variable3; 
                    return result;
                } else if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Multiple)) {
                    if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(CommonFunctionUtil.createListPage(iAMFunctionLogicCustomizeServiceMapper.getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF2(variable3), iAMFunctionLogicCustomizeServiceMapper.countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF2(variable3).intValue(), AnonymousStructure_4340F7F1981452AE335921E6533B20F0.class).list), 0L))) {
                        if ((CommonFunctionUtil.notEquals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                            userInfo = iAMGetUserByUserIdCustomizeService.iAMGetUserByUserId(GlobalContext.getSessionVariable().currentUser.userId); 
                            iAMAccountBindOrUnBindCustomizeService.iAMAccountBindOrUnBind(userInfo.userName, userInfo.password, variable3.userId, variable3.userName, identityConfig.param.id, true, "BIND", null, true);
                            variable4.redirectUrl = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=ok")).toString(); 

                        } else {
                            variable4.redirectUrl = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/account_bind?openId=")).append(CommonFunctionUtil.toString(variable3.userId)).append(CommonFunctionUtil.toString("&name=")).append(CommonFunctionUtil.toString(variable3.userName)).append(CommonFunctionUtil.toString("&identitySourceId=")).append(CommonFunctionUtil.toString(identityConfig.param.id)).toString(); 

                        } 

                        result.IAMUserInfo = variable4; 
                        return result;
                    } else {
                        if ((CommonFunctionUtil.equals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                            variable2 = iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(variable3.userId, "wechat", identityConfig.param.id, variable3.userName, null); 
                            variable3.userId = variable2.userId; 
                            variable3.userName = variable2.userName; 

                            result.IAMUserInfo = variable3; 
                        } else {
                            variable4.redirectUrl = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=error")).toString(); 

                            result.IAMUserInfo = variable4; 
                        } 

                        return result;
                    } 

                } else {
                } 

                return result;
            } 

        } else {
        } 

        return result;
    } 

}
