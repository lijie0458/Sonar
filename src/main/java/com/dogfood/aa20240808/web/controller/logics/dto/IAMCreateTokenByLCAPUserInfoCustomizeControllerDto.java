package com.dogfood.aa20240808.web.controller.logics.dto; 


public class IAMCreateTokenByLCAPUserInfoCustomizeControllerDto {

    public Boolean isAccountBindCreate;
    public Long identityId;
    public String openid;
    public String name;
    public String source;
    public Boolean getIsAccountBindCreate() {
        return isAccountBindCreate;
    } 

    public void setIsAccountBindCreate(Boolean isAccountBindCreate) {
        this.isAccountBindCreate = isAccountBindCreate; 
    } 

    public Long getIdentityId() {
        return identityId;
    } 

    public void setIdentityId(Long identityId) {
        this.identityId = identityId; 
    } 

    public String getOpenid() {
        return openid;
    } 

    public void setOpenid(String openid) {
        this.openid = openid; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getSource() {
        return source;
    } 

    public void setSource(String source) {
        this.source = source; 
    } 


}
