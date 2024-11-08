package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.ResponseResultStructure; 
import java.util.List; 
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.util.JacksonUtils; 
import com.dogfood.aa20240808.domain.structure.WxUserDetailStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.FeishuUserAccessTokenRespStructure; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E; 
import com.netease.lowcode.template.logic.AuthTemplateLogic; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.fasterxml.jackson.core.type.TypeReference; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.AppConfigEntity; 
import com.dogfood.aa20240808.repository.IAMSocialIdentityLoginCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.enumeration.LoginIdentityTypeEnumEnum; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF; 
import com.dogfood.aa20240808.domain.structure.FeishuUserInfoRespStructure; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4340F7F1981452AE335921E6533B20F0; 

/**
 * IAM-社会化身份源登录
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
public class IAMSocialIdentityLoginCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private IAMGetIdentitySourceByStateCustomizeService iAMGetIdentitySourceByStateCustomizeService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private IAMGetConfigCustomizeService iAMGetConfigCustomizeService;

    @Autowired
    private IAMCreateTokenByLCAPUserInfoCustomizeService iAMCreateTokenByLCAPUserInfoCustomizeService;

    @Autowired
    private IAMSocialIdentityLoginCustomizeServiceMapper iAMSocialIdentityLoginCustomizeServiceMapper;

    @Autowired
    private IAMGetUserByUserIdCustomizeService iAMGetUserByUserIdCustomizeService;

    @Autowired
    private IAMAccountBindOrUnBindCustomizeService iAMAccountBindOrUnBindCustomizeService;

    public String iAMSocialIdentityLogin(String code, String source) {
        LambdaParamWrapper<String> codeWrapper = new LambdaParamWrapper<>(code);
        LambdaParamWrapper<IdentitySourceConfigEntity> identitySourceInfo = new LambdaParamWrapper<>(new IdentitySourceConfigEntity());
        LambdaParamWrapper<Map<String, String>> feishuAppAccessTokenResp = new LambdaParamWrapper<>(new HashMap<>());
        LambdaParamWrapper<FeishuUserAccessTokenRespStructure> feishuUserAccessTokenResp = new LambdaParamWrapper<>(new FeishuUserAccessTokenRespStructure());
        FeishuUserInfoRespStructure feishuUserInfoResp = new FeishuUserInfoRespStructure();
        String openId = "";
        LambdaParamWrapper<String> requestUrl = new LambdaParamWrapper<>("");
        Map<String, String> weworkAccessTokenResp = new HashMap<>();
        Map<String, String> weworkOpenIdResp = new HashMap<>();
        WxUserDetailStructure weworkUserInfoResp = new WxUserDetailStructure();
        LambdaParamWrapper<Map<String, String>> dingdingUserAccessTokenResp = new LambdaParamWrapper<>(new HashMap<>());
        Map<String, String> dingdingUserInfoResp = new HashMap<>();
        List<AnonymousStructure_E6204F88FA3760A005F0E371750B535E> variable1 = new ArrayList<>();
        AppConfigEntity appConfig = new AppConfigEntity();
        List<AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> thirdIdentityInfo = new ArrayList<>();
        String name = "";
        LCAPUser variable2 = new LCAPUser();
        ResponseResultStructure bindRes = new ResponseResultStructure();
        String result = "";
        if (((CommonFunctionUtil.notEquals(codeWrapper.param, null)) && (CommonFunctionUtil.notEquals(source, null)))) {
            variable1 = iAMGetIdentitySourceByStateCustomizeService.iAMGetIdentitySourceByState(source); 
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(variable1), 0L))) {
                LCAP_LOGGER.info(CommonFunctionUtil.toString("该身份源不存在"));
                LCAP_LOGGER.info("abort!"); 
                LogicCallUtils.abort(); 
            } else {
            } 

            identitySourceInfo.param = CommonFunctionUtil.listHead(CommonFunctionUtil.listTransform(variable1, (item) -> item.identitySourceConfig)); 
            if (CommonFunctionUtil.equals(identitySourceInfo.param.state, IdentitySourceStateEnumEnum.FIELD_feishu)) {
                // 调用飞书开放接口，获取appAccessToken
                requestUrl.param = "https://open.feishu.cn/open-apis/auth/v3/app_access_token/internal"; 
                feishuAppAccessTokenResp.param = ((Map<String, String>) JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "post", CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map1 -> {
    _map1.put("Content-Type", "application/json; charset=utf-8");
} ), CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map1 -> {
    _map1.put("app_id", identitySourceInfo.param.appId);
    _map1.put("app_secret", LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptWithBase64AndDes(identitySourceInfo.param.appSecret), true));
} )), true), new TypeReference<Map<String, String>>() {
} )); 
                // 当返回code不为0时，请求获取失败，终止程序
                if ((CommonFunctionUtil.equals(CommonFunctionUtil.mapGet(feishuAppAccessTokenResp.param, "code"), "0"))) {
                } else {
                    LCAP_LOGGER.error(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("app_access-token获取失败！msg：")).append(CommonFunctionUtil.toString(CommonFunctionUtil.mapGet(feishuAppAccessTokenResp.param, "msg"))).toString()));
                    LCAP_LOGGER.info("abort!"); 
                    LogicCallUtils.abort(); 
                } 

                // 请求飞书开放接口，获取userAccessTokenResp，飞书该请求返回想要的数据结构比较深，故应用数据结构承接。
                requestUrl.param = "https://open.feishu.cn/open-apis/authen/v1/oidc/access_token"; 
                feishuUserAccessTokenResp.param = JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "post", CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map1 -> {
    _map1.put("Authorization", new StringBuilder().append(CommonFunctionUtil.toString("Bearer ")).append(CommonFunctionUtil.toString(CommonFunctionUtil.mapGet(feishuAppAccessTokenResp.param, "app_access_token"))).toString());
    _map1.put("Content-Type", "application/json; charset=utf-8");
} ), CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map1 -> {
    _map1.put("grant_type", "authorization_code");
    _map1.put("code", codeWrapper.param);
} )), true), FeishuUserAccessTokenRespStructure.class); 
                // 当返回code不为0时，请求获取失败，终止程序
                if ((CommonFunctionUtil.equals(feishuUserAccessTokenResp.param.code, 0L))) {
                } else {
                    LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("user_access_token获取失败！msg：")).append(CommonFunctionUtil.toString(feishuUserAccessTokenResp.param.msg)).toString()));
                    LCAP_LOGGER.info("abort!"); 
                    LogicCallUtils.abort(); 
                } 

                requestUrl.param = "https://open.feishu.cn/open-apis/authen/v1/user_info"; 
                feishuUserInfoResp = JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "get", CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map1 -> {
    _map1.put("Authorization", new StringBuilder().append(CommonFunctionUtil.toString("Bearer ")).append(CommonFunctionUtil.toString(feishuUserAccessTokenResp.param.data.access_token)).toString());
} ), null), true), FeishuUserInfoRespStructure.class); 
                // 当返回code不为0时，请求获取失败，终止程序
                if ((CommonFunctionUtil.equals(feishuUserInfoResp.code, 0L))) {
                } else {
                    LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("user_info获取失败！msg：")).append(CommonFunctionUtil.toString(feishuUserInfoResp.msg)).toString()));
                    LCAP_LOGGER.info("abort!"); 
                    LogicCallUtils.abort(); 
                } 

                openId = feishuUserInfoResp.data.open_id; 
                name = feishuUserInfoResp.data.name; 
            } else if (CommonFunctionUtil.equals(identitySourceInfo.param.state, IdentitySourceStateEnumEnum.FIELD_wework)) {
                requestUrl.param = new StringBuilder().append(CommonFunctionUtil.toString("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=")).append(CommonFunctionUtil.toString(identitySourceInfo.param.appId)).append(CommonFunctionUtil.toString("&corpsecret=")).append(CommonFunctionUtil.toString(LogicCallUtils.callWithError(() -> AuthTemplateLogic.nasl$$enhance$$decryptWithBase64AndDes(identitySourceInfo.param.appSecret), false))).toString(); 
                weworkAccessTokenResp = ((Map<String, String>) JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "get", null, null), true), new TypeReference<Map<String, String>>() {
} )); 
                if ((CommonFunctionUtil.equals(CommonFunctionUtil.mapGet(weworkAccessTokenResp, "errcode"), "0"))) {
                } else {
                    LCAP_LOGGER.error(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("access_token获取失败！errmsg：")).append(CommonFunctionUtil.toString(CommonFunctionUtil.mapGet(weworkAccessTokenResp, "errmsg"))).toString()));
                    LCAP_LOGGER.info("abort!"); 
                    LogicCallUtils.abort(); 
                } 

                requestUrl.param = new StringBuilder().append(CommonFunctionUtil.toString("https://qyapi.weixin.qq.com/cgi-bin/auth/getuserinfo?access_token=")).append(CommonFunctionUtil.toString(CommonFunctionUtil.mapGet(weworkAccessTokenResp, "access_token"))).append(CommonFunctionUtil.toString("&code=")).append(CommonFunctionUtil.toString(codeWrapper.param)).toString(); 
                weworkOpenIdResp = ((Map<String, String>) JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "get", null, null), true), new TypeReference<Map<String, String>>() {
} )); 
                if ((CommonFunctionUtil.equals(CommonFunctionUtil.mapGet(weworkOpenIdResp, "errcode"), "0"))) {
                } else {
                    LCAP_LOGGER.error(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("userid获取失败！errmsg：")).append(CommonFunctionUtil.toString(CommonFunctionUtil.mapGet(weworkOpenIdResp, "errmsg"))).toString()));
                    LCAP_LOGGER.info("abort!"); 
                    LogicCallUtils.abort(); 
                } 

                requestUrl.param = new StringBuilder().append(CommonFunctionUtil.toString("https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=")).append(CommonFunctionUtil.toString(CommonFunctionUtil.mapGet(weworkAccessTokenResp, "access_token"))).append(CommonFunctionUtil.toString("&userid=")).append(CommonFunctionUtil.toString(CommonFunctionUtil.mapGet(weworkOpenIdResp, "userid"))).toString(); 
                weworkUserInfoResp = JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "get", null, null), true), WxUserDetailStructure.class); 
                if ((CommonFunctionUtil.equals(weworkUserInfoResp.errcode, 0L))) {
                } else {
                    LCAP_LOGGER.error(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("userInfo获取失败！errmsg：")).append(CommonFunctionUtil.toString(weworkUserInfoResp.errmsg)).toString()));
                    LCAP_LOGGER.info("abort!"); 
                    LogicCallUtils.abort(); 
                } 

                openId = weworkUserInfoResp.userid; 
                name = weworkUserInfoResp.name; 
            } else if (CommonFunctionUtil.equals(identitySourceInfo.param.state, IdentitySourceStateEnumEnum.FIELD_dingtalk)) {
                requestUrl.param = "https://api.dingtalk.com/v1.0/oauth2/userAccessToken"; 
                dingdingUserAccessTokenResp.param = ((Map<String, String>) JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "post", null, CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map1 -> {
    _map1.put("clientId", identitySourceInfo.param.appId);
    _map1.put("clientSecret", LogicCallUtils.callWithError(() -> AuthTemplateLogic.decryptWithBase64AndDes(identitySourceInfo.param.appSecret), true));
    _map1.put("code", codeWrapper.param);
    _map1.put("grantType", "authorization_code");
} )), true), new TypeReference<Map<String, String>>() {
} )); 
                LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString(dingdingUserInfoResp)).toString()));
                requestUrl.param = "https://api.dingtalk.com/v1.0/contact/users/me"; 
                dingdingUserInfoResp = ((Map<String, String>) JacksonUtils.fromJson(LogicCallUtils.callWithError(() -> AuthTemplateLogic.httpExchange(requestUrl.param, "get", CommonFunctionUtil.newWithInitiation(new HashMap<String, String>(), _map1 -> {
    _map1.put("x-acs-dingtalk-access-token", CommonFunctionUtil.mapGet(dingdingUserAccessTokenResp.param, "accessToken"));
} ), null), true), new TypeReference<Map<String, String>>() {
} )); 
                openId = CommonFunctionUtil.mapGet(dingdingUserInfoResp, "openId"); 
                name = CommonFunctionUtil.mapGet(dingdingUserInfoResp, "nick"); 
            } else {
                return result;
            } 

            appConfig = iAMGetConfigCustomizeService.iAMGetConfig("APPLICATION", null).data.appConfig; 
            if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Single)) {
                iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(openId, source, identitySourceInfo.param.id, name, null);
                result = identitySourceInfo.param.successUrl; 
            } else if (CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Multiple)) {
                thirdIdentityInfo = CommonFunctionUtil.createListPage(iAMSocialIdentityLoginCustomizeServiceMapper.getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(openId), iAMSocialIdentityLoginCustomizeServiceMapper.countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(openId).intValue(), AnonymousStructure_4340F7F1981452AE335921E6533B20F0.class).list; 
                if ((CommonFunctionUtil.length(thirdIdentityInfo).compareTo(0L) > 0)) {
                    if ((CommonFunctionUtil.equals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                        iAMCreateTokenByLCAPUserInfoCustomizeService.iAMCreateTokenByLCAPUserInfo(openId, source, identitySourceInfo.param.id, name, null);
                        result = identitySourceInfo.param.successUrl; 
                    } else {
                        result = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=error")).toString(); 
                    } 

                } else {
                    // 如果当前是登录态，则直接完成绑定跳回绑定页面
                    if ((CommonFunctionUtil.notEquals(GlobalContext.getSessionVariable().currentUser.userId, null))) {
                        variable2 = iAMGetUserByUserIdCustomizeService.iAMGetUserByUserId(GlobalContext.getSessionVariable().currentUser.userId); 
                        bindRes = iAMAccountBindOrUnBindCustomizeService.iAMAccountBindOrUnBind(variable2.userName, variable2.password, openId, name, identitySourceInfo.param.id, true, "BIND", null, true); 
                        result = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/user_center/identity_bind?code=ok")).toString(); 
                    } else {
                        result = new StringBuilder().append(CommonFunctionUtil.toString(CommonFunctionUtil.join(CommonFunctionUtil.listSlice(CommonFunctionUtil.split(GlobalContext.getSessionVariable().httpRequest.requestURL, "/", false), 0L, 3L), "/"))).append(CommonFunctionUtil.toString("/page_config/account_bind?openId=")).append(CommonFunctionUtil.toString(openId)).append(CommonFunctionUtil.toString("&name=")).append(CommonFunctionUtil.toString(name)).append(CommonFunctionUtil.toString("&identitySourceId=")).append(CommonFunctionUtil.toString(identitySourceInfo.param.id)).toString(); 
                    } 

                } 

            } else {
            } 

        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数中有null值"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 

}
