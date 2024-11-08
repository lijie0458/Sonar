package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.ZonedDateTime; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ThirdIdentityEntity {

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

    @Label("用户三方唯一id")
    @NotNull
    public String openId;

    @Label("身份源表id")
    @NotNull
    public Long identityId;

    @Label("昵称")
    @NotNull
    public String name;

    @Label("手机号")
    public String phone;

    @Label("邮箱")
    public String email;

    @Label("用户id")
    @NotNull
    public String userId;

    @Label("身份源")
    @NotNull
    public IdentitySourceStateEnumEnum state;

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

    public String getOpenId() {
        return openId;
    } 

    public void setOpenId(String openId) {
        this.openId = openId; 
    } 

    public Long getIdentityId() {
        return identityId;
    } 

    public void setIdentityId(Long identityId) {
        this.identityId = identityId; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getPhone() {
        return phone;
    } 

    public void setPhone(String phone) {
        this.phone = phone; 
    } 

    public String getEmail() {
        return email;
    } 

    public void setEmail(String email) {
        this.email = email; 
    } 

    public String getUserId() {
        return userId;
    } 

    public void setUserId(String userId) {
        this.userId = userId; 
    } 

    public IdentitySourceStateEnumEnum getState() {
        return state;
    } 

    public void setState(IdentitySourceStateEnumEnum state) {
        this.state = state; 
    } 

}
