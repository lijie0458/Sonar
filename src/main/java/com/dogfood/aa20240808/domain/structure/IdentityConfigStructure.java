package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class IdentityConfigStructure {

    public String appId;

    public String name;

    public String icon;

    public String type;

    public Boolean loginEnable;

    public String centerLoginUrl;

    public String centerTokenUrl;

    public String centerUserUrl;

    public String casServiceUrl;

    public String state;

    public String centerLogoutUrl;

    public Long expire;

    public String callbackUrl;

    public String redirectUrl;

    public String logoutCallbackUrl;

    public String agentId;

    public String getAppId() {
        return appId;
    } 

    public void setAppId(String appId) {
        this.appId = appId; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getIcon() {
        return icon;
    } 

    public void setIcon(String icon) {
        this.icon = icon; 
    } 

    public String getType() {
        return type;
    } 

    public void setType(String type) {
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

    public String getCenterTokenUrl() {
        return centerTokenUrl;
    } 

    public void setCenterTokenUrl(String centerTokenUrl) {
        this.centerTokenUrl = centerTokenUrl; 
    } 

    public String getCenterUserUrl() {
        return centerUserUrl;
    } 

    public void setCenterUserUrl(String centerUserUrl) {
        this.centerUserUrl = centerUserUrl; 
    } 

    public String getCasServiceUrl() {
        return casServiceUrl;
    } 

    public void setCasServiceUrl(String casServiceUrl) {
        this.casServiceUrl = casServiceUrl; 
    } 

    public String getState() {
        return state;
    } 

    public void setState(String state) {
        this.state = state; 
    } 

    public String getCenterLogoutUrl() {
        return centerLogoutUrl;
    } 

    public void setCenterLogoutUrl(String centerLogoutUrl) {
        this.centerLogoutUrl = centerLogoutUrl; 
    } 

    public Long getExpire() {
        return expire;
    } 

    public void setExpire(Long expire) {
        this.expire = expire; 
    } 

    public String getCallbackUrl() {
        return callbackUrl;
    } 

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl; 
    } 

    public String getRedirectUrl() {
        return redirectUrl;
    } 

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl; 
    } 

    public String getLogoutCallbackUrl() {
        return logoutCallbackUrl;
    } 

    public void setLogoutCallbackUrl(String logoutCallbackUrl) {
        this.logoutCallbackUrl = logoutCallbackUrl; 
    } 

    public String getAgentId() {
        return agentId;
    } 

    public void setAgentId(String agentId) {
        this.agentId = agentId; 
    } 

}
