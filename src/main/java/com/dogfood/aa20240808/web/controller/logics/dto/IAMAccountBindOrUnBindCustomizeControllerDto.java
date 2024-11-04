package com.dogfood.aa20240808.web.controller.logics.dto; 


public class IAMAccountBindOrUnBindCustomizeControllerDto {

    public Long identitySourceId;
    public String password;
    public Boolean hasAccount;
    public String passwordConfirm;
    public String bindOrUnbind;
    public String openId;
    public String name;
    public Boolean isFromUserCenter;
    public String userName;
    public Long getIdentitySourceId() {
        return identitySourceId;
    } 

    public void setIdentitySourceId(Long identitySourceId) {
        this.identitySourceId = identitySourceId; 
    } 

    public String getPassword() {
        return password;
    } 

    public void setPassword(String password) {
        this.password = password; 
    } 

    public Boolean getHasAccount() {
        return hasAccount;
    } 

    public void setHasAccount(Boolean hasAccount) {
        this.hasAccount = hasAccount; 
    } 

    public String getPasswordConfirm() {
        return passwordConfirm;
    } 

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm; 
    } 

    public String getBindOrUnbind() {
        return bindOrUnbind;
    } 

    public void setBindOrUnbind(String bindOrUnbind) {
        this.bindOrUnbind = bindOrUnbind; 
    } 

    public String getOpenId() {
        return openId;
    } 

    public void setOpenId(String openId) {
        this.openId = openId; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public Boolean getIsFromUserCenter() {
        return isFromUserCenter;
    } 

    public void setIsFromUserCenter(Boolean isFromUserCenter) {
        this.isFromUserCenter = isFromUserCenter; 
    } 

    public String getUserName() {
        return userName;
    } 

    public void setUserName(String userName) {
        this.userName = userName; 
    } 


}
