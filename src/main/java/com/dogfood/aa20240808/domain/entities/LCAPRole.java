package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.dogfood.aa20240808.domain.enumeration.ViewEditPermissionEnumEnum; 
import java.time.ZonedDateTime; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LCAPRole {

    @Label("主键")
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

    @Label("唯一标识")
    public String uuid;

    @Label("角色名称")
    @NotNull
    public String name;

    @Label("角色描述")
    public String description;

    @Label("角色状态")
    public Boolean roleStatus = true;

    @Label("是否可编辑")
    public Boolean editable = true;

    @Label("查看数据权限")
    public ViewEditPermissionEnumEnum viewDataPermission;

    @Label("编辑数据权限")
    public ViewEditPermissionEnumEnum editDataPermission;

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

    public String getUuid() {
        return uuid;
    } 

    public void setUuid(String uuid) {
        this.uuid = uuid; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getDescription() {
        return description;
    } 

    public void setDescription(String description) {
        this.description = description; 
    } 

    public Boolean getRoleStatus() {
        return roleStatus;
    } 

    public void setRoleStatus(Boolean roleStatus) {
        this.roleStatus = roleStatus; 
    } 

    public Boolean getEditable() {
        return editable;
    } 

    public void setEditable(Boolean editable) {
        this.editable = editable; 
    } 

    public ViewEditPermissionEnumEnum getViewDataPermission() {
        return viewDataPermission;
    } 

    public void setViewDataPermission(ViewEditPermissionEnumEnum viewDataPermission) {
        this.viewDataPermission = viewDataPermission; 
    } 

    public ViewEditPermissionEnumEnum getEditDataPermission() {
        return editDataPermission;
    } 

    public void setEditDataPermission(ViewEditPermissionEnumEnum editDataPermission) {
        this.editDataPermission = editDataPermission; 
    } 

}
