package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.ZonedDateTime; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.dogfood.aa20240808.domain.enumeration.LoginPageConfigEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.LoginIdentityTypeEnumEnum; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AppConfigEntity {

    @Label("主键")
    @NotNull
    public Long id;

    @Label("创建时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime createdTime;

    @Label("更新时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime updatedTime;

    @Label("创建者")
    public String createdBy;

    @Label("更新者")
    public String updatedBy;

    @Label("登录默认角色")
    @NotNull
    public Long loginRoleId;

    @Label("单身份源/多身份源")
    @NotNull
    public LoginIdentityTypeEnumEnum loginIdentityType = LoginIdentityTypeEnumEnum.FIELD_Single;

    @Label("身份源开关")
    @NotNull
    public Boolean settingSwitch = false;

    @Label("登录页配置")
    public LoginPageConfigEnumEnum loginPageConfig = LoginPageConfigEnumEnum.FIELD_Default;

    @Label("自定义登录地址")
    public String customizeLoginUrl;

    @Label("展示图片地址")
    public String showPhotoUrl;

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    } 

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime; 
    } 

    public ZonedDateTime getUpdatedTime() {
        return updatedTime;
    } 

    public void setUpdatedTime(ZonedDateTime updatedTime) {
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

    public Long getLoginRoleId() {
        return loginRoleId;
    } 

    public void setLoginRoleId(Long loginRoleId) {
        this.loginRoleId = loginRoleId; 
    } 

    public LoginIdentityTypeEnumEnum getLoginIdentityType() {
        return loginIdentityType;
    } 

    public void setLoginIdentityType(LoginIdentityTypeEnumEnum loginIdentityType) {
        this.loginIdentityType = loginIdentityType; 
    } 

    public Boolean getSettingSwitch() {
        return settingSwitch;
    } 

    public void setSettingSwitch(Boolean settingSwitch) {
        this.settingSwitch = settingSwitch; 
    } 

    public LoginPageConfigEnumEnum getLoginPageConfig() {
        return loginPageConfig;
    } 

    public void setLoginPageConfig(LoginPageConfigEnumEnum loginPageConfig) {
        this.loginPageConfig = loginPageConfig; 
    } 

    public String getCustomizeLoginUrl() {
        return customizeLoginUrl;
    } 

    public void setCustomizeLoginUrl(String customizeLoginUrl) {
        this.customizeLoginUrl = customizeLoginUrl; 
    } 

    public String getShowPhotoUrl() {
        return showPhotoUrl;
    } 

    public void setShowPhotoUrl(String showPhotoUrl) {
        this.showPhotoUrl = showPhotoUrl; 
    } 

}
