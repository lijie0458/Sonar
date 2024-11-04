package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import java.util.HashMap; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceTypeEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import java.util.Map; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.dogfood.aa20240808.domain.enumeration.EncryptAndDecryptEnumEnum; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class IdentitySourceConfigEntity {

    @Label("主键")
    @javax.validation.constraints.NotNull
    public Long id;
    @Label("创建时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public java.time.ZonedDateTime createdTime;
    @Label("更新时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public java.time.ZonedDateTime updatedTime;
    @Label("创建者")
    public String createdBy;
    @Label("更新者")
    public String updatedBy;
    @Label("身份源")
    @javax.validation.constraints.NotNull
    public IdentitySourceStateEnumEnum state;
    @Label("身份源图标")
    @javax.validation.constraints.NotNull
    public String icon;
    @Label("身份源名称")
    @javax.validation.constraints.NotNull
    public String name;
    @Label("客户端id")
    @javax.validation.constraints.NotNull
    public String appId;
    @Label("客户端密钥")
    @javax.validation.constraints.NotNull
    public String appSecret;
    @Label("登陆成功回调地址")
    public String successUrl;
    @Label("身份源类型")
    @javax.validation.constraints.NotNull
    public IdentitySourceTypeEnumEnum type;
    @Label("是否开启身份源")
    @javax.validation.constraints.NotNull
    public Boolean loginEnable = false;
    @Label("认证中心登陆地址")
    public String centerLoginUrl;
    @Label("获取token的地址")
    public String tokenUrl;
    @Label("获取token的请求方法")
    public String tokenMethod;
    @Label("获取用户信息的地址")
    public String userUrl;
    @Label("获取用户的请求方式")
    public String userMethod;
    @Label("认证中心注销地址")
    public String centerLogoutUrl;
    @Label("注销后跳转的地址")
    public String logoutCallbackUrl;
    @Label("cas服务端ticket校验地址")
    public String casTicketUrl;
    @Label("过期时间")
    public Long expire = 86400L;
    @Label("跳转回调的地址")
    public String redirectUrl;
    @Label("客户端id")
    public String agentId;
    @Label("token请求头")
    public Map<String, String> tokenHeaderMap = new HashMap<>();
    @Label("token请求体")
    public Map<String, String> tokenBodyMap = new HashMap<>();
    @Label("user请求头")
    public Map<String, String> userHeaderMap = new HashMap<>();
    @Label("user请求体")
    public Map<String, String> userBodyMap = new HashMap<>();
    @Label("oauth的userid返回格式")
    public String userIdRes;
    @Label("oauth的userName返回格式")
    public String userNameRes;
    @Label("身份源的唯一标识")
    @javax.validation.constraints.NotNull
    public String code;
    @Label("sso免登登录地址")
    public String ssoUrl;
    @Label("令牌")
    public String wechatToken;
    @Label("消息加解密方式")
    public EncryptAndDecryptEnumEnum wechatMsgMethod;
    @Label("消息加解密密钥")
    public String wechatMsgSecret = "";
    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public java.time.ZonedDateTime getCreatedTime() {
        return createdTime;
    } 

    public void setCreatedTime(java.time.ZonedDateTime createdTime) {
        this.createdTime = createdTime; 
    } 

    public java.time.ZonedDateTime getUpdatedTime() {
        return updatedTime;
    } 

    public void setUpdatedTime(java.time.ZonedDateTime updatedTime) {
        this.updatedTime = updatedTime; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    public String getUpdatedBy() {
        return updatedBy;
    } 

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy; 
    } 

    public IdentitySourceStateEnumEnum getState() {
        return state;
    } 

    public void setState(IdentitySourceStateEnumEnum state) {
        this.state = state; 
    } 

    public String getIcon() {
        return icon;
    } 

    public void setIcon(String icon) {
        this.icon = icon; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getAppId() {
        return appId;
    } 

    public void setAppId(String appId) {
        this.appId = appId; 
    } 

    public String getAppSecret() {
        return appSecret;
    } 

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret; 
    } 

    public String getSuccessUrl() {
        return successUrl;
    } 

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl; 
    } 

    public IdentitySourceTypeEnumEnum getType() {
        return type;
    } 

    public void setType(IdentitySourceTypeEnumEnum type) {
        this.type = type; 
    } 

    public Boolean getLoginEnable() {
        return loginEnable;
    } 

    public void setLoginEnable(Boolean loginEnable) {
        this.loginEnable = loginEnable; 
    } 

    public String getCenterLoginUrl() {
        return centerLoginUrl;
    } 

    public void setCenterLoginUrl(String centerLoginUrl) {
        this.centerLoginUrl = centerLoginUrl; 
    } 

    public String getTokenUrl() {
        return tokenUrl;
    } 

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl; 
    } 

    public String getTokenMethod() {
        return tokenMethod;
    } 

    public void setTokenMethod(String tokenMethod) {
        this.tokenMethod = tokenMethod; 
    } 

    public String getUserUrl() {
        return userUrl;
    } 

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl; 
    } 

    public String getUserMethod() {
        return userMethod;
    } 

    public void setUserMethod(String userMethod) {
        this.userMethod = userMethod; 
    } 

    public String getCenterLogoutUrl() {
        return centerLogoutUrl;
    } 

    public void setCenterLogoutUrl(String centerLogoutUrl) {
        this.centerLogoutUrl = centerLogoutUrl; 
    } 

    public String getLogoutCallbackUrl() {
        return logoutCallbackUrl;
    } 

    public void setLogoutCallbackUrl(String logoutCallbackUrl) {
        this.logoutCallbackUrl = logoutCallbackUrl; 
    } 

    public String getCasTicketUrl() {
        return casTicketUrl;
    } 

    public void setCasTicketUrl(String casTicketUrl) {
        this.casTicketUrl = casTicketUrl; 
    } 

    public Long getExpire() {
        return expire;
    } 

    public void setExpire(Long expire) {
        this.expire = expire; 
    } 

    public String getRedirectUrl() {
        return redirectUrl;
    } 

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl; 
    } 

    public String getAgentId() {
        return agentId;
    } 

    public void setAgentId(String agentId) {
        this.agentId = agentId; 
    } 

    public Map<String, String> getTokenHeaderMap() {
        return tokenHeaderMap;
    } 

    public void setTokenHeaderMap(Map<String, String> tokenHeaderMap) {
        this.tokenHeaderMap = tokenHeaderMap; 
    } 

    public Map<String, String> getTokenBodyMap() {
        return tokenBodyMap;
    } 

    public void setTokenBodyMap(Map<String, String> tokenBodyMap) {
        this.tokenBodyMap = tokenBodyMap; 
    } 

    public Map<String, String> getUserHeaderMap() {
        return userHeaderMap;
    } 

    public void setUserHeaderMap(Map<String, String> userHeaderMap) {
        this.userHeaderMap = userHeaderMap; 
    } 

    public Map<String, String> getUserBodyMap() {
        return userBodyMap;
    } 

    public void setUserBodyMap(Map<String, String> userBodyMap) {
        this.userBodyMap = userBodyMap; 
    } 

    public String getUserIdRes() {
        return userIdRes;
    } 

    public void setUserIdRes(String userIdRes) {
        this.userIdRes = userIdRes; 
    } 

    public String getUserNameRes() {
        return userNameRes;
    } 

    public void setUserNameRes(String userNameRes) {
        this.userNameRes = userNameRes; 
    } 

    public String getCode() {
        return code;
    } 

    public void setCode(String code) {
        this.code = code; 
    } 

    public String getSsoUrl() {
        return ssoUrl;
    } 

    public void setSsoUrl(String ssoUrl) {
        this.ssoUrl = ssoUrl; 
    } 

    public String getWechatToken() {
        return wechatToken;
    } 

    public void setWechatToken(String wechatToken) {
        this.wechatToken = wechatToken; 
    } 

    public EncryptAndDecryptEnumEnum getWechatMsgMethod() {
        return wechatMsgMethod;
    } 

    public void setWechatMsgMethod(EncryptAndDecryptEnumEnum wechatMsgMethod) {
        this.wechatMsgMethod = wechatMsgMethod; 
    } 

    public String getWechatMsgSecret() {
        return wechatMsgSecret;
    } 

    public void setWechatMsgSecret(String wechatMsgSecret) {
        this.wechatMsgSecret = wechatMsgSecret; 
    } 


}
