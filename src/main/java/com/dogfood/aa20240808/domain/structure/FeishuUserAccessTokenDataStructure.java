package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class FeishuUserAccessTokenDataStructure {

    @Label("字段access_token即user_access_token，用于获取用户资源和访问某些open api")
    public String access_token;
    @Label("刷新user_access_token时使用的 refresh_token")
    public String refresh_token;
    @Label("token 类型，固定值")
    public String token_type;
    @Label("user_access_token有效期，单位: 秒，有效时间两个小时左右，需要以返回结果为准")
    public Long expires_in;
    @Label("refresh_token有效期，单位: 秒，一般是30天左右，需要以返回结果为准")
    public Long refresh_expires_in;
    @Label("用户授予app的权限全集")
    public String scope;
    public String getAccess_token() {
        return access_token;
    } 

    public void setAccess_token(String access_token) {
        this.access_token = access_token; 
    } 

    public String getRefresh_token() {
        return refresh_token;
    } 

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token; 
    } 

    public String getToken_type() {
        return token_type;
    } 

    public void setToken_type(String token_type) {
        this.token_type = token_type; 
    } 

    public Long getExpires_in() {
        return expires_in;
    } 

    public void setExpires_in(Long expires_in) {
        this.expires_in = expires_in; 
    } 

    public Long getRefresh_expires_in() {
        return refresh_expires_in;
    } 

    public void setRefresh_expires_in(Long refresh_expires_in) {
        this.refresh_expires_in = refresh_expires_in; 
    } 

    public String getScope() {
        return scope;
    } 

    public void setScope(String scope) {
        this.scope = scope; 
    } 


}
