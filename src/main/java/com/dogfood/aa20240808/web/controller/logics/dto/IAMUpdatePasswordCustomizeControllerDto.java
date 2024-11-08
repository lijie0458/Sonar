package com.dogfood.aa20240808.web.controller.logics.dto; 


public class IAMUpdatePasswordCustomizeControllerDto {

    public String confirmNewPwd;

    public String newPwd;

    public String oldPwd;

    public String userId;

    public String getConfirmNewPwd() {
        return confirmNewPwd;
    } 

    public void setConfirmNewPwd(String confirmNewPwd) {
        this.confirmNewPwd = confirmNewPwd; 
    } 

    public String getNewPwd() {
        return newPwd;
    } 

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd; 
    } 

    public String getOldPwd() {
        return oldPwd;
    } 

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd; 
    } 

    public String getUserId() {
        return userId;
    } 

    public void setUserId(String userId) {
        this.userId = userId; 
    } 

}
