package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class IAMIdentitySourceResultStructure {

    @Label("身份源类型")
    public IdentitySourceStateEnumEnum state;

    @Label("授权url")
    public String authUrl;

    public IdentitySourceStateEnumEnum getState() {
        return state;
    } 

    public void setState(IdentitySourceStateEnumEnum state) {
        this.state = state; 
    } 

    public String getAuthUrl() {
        return authUrl;
    } 

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl; 
    } 

}
