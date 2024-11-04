package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Warehouse_levelTwoEntity {

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
    @Label("二级仓库编码")
    public String warehouse_code;
    @Label("二级仓库名称")
    public String warehouse_name;
    @Label("关联一级仓库")
    public Long parent_warehouse_Id;
    @Label("地址")
    public String address;
    @Label("备注")
    public String remark;
    @Label("仓库管理员")
    public Long warehouse_manager;
    @Label("详细地址")
    public String detailedAddress;
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

    public String getWarehouse_code() {
        return warehouse_code;
    } 

    public void setWarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code; 
    } 

    public String getWarehouse_name() {
        return warehouse_name;
    } 

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name; 
    } 

    public Long getParent_warehouse_Id() {
        return parent_warehouse_Id;
    } 

    public void setParent_warehouse_Id(Long parent_warehouse_Id) {
        this.parent_warehouse_Id = parent_warehouse_Id; 
    } 

    public String getAddress() {
        return address;
    } 

    public void setAddress(String address) {
        this.address = address; 
    } 

    public String getRemark() {
        return remark;
    } 

    public void setRemark(String remark) {
        this.remark = remark; 
    } 

    public Long getWarehouse_manager() {
        return warehouse_manager;
    } 

    public void setWarehouse_manager(Long warehouse_manager) {
        this.warehouse_manager = warehouse_manager; 
    } 

    public String getDetailedAddress() {
        return detailedAddress;
    } 

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress; 
    } 


}
