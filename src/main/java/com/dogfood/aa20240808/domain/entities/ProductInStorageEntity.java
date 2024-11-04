package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.domain.enumeration.ProductInStorageStateEnumEnum; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductInStorageEntity {

    @Label("产品入库单号")
    @javax.validation.constraints.NotNull
    public String num;
    @Label("创建时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public java.time.ZonedDateTime createdTime;
    @Label("创建者")
    public String createdBy;
    @Label("更新时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public java.time.ZonedDateTime updatedTime;
    @Label("更新者")
    public String updatedBy;
    @Label("保管员")
    public String userId;
    @Label("源单单号")
    public String sourceCode;
    @Label("摘要")
    public String desc;
    @Label("审批状态")
    public ProductInStorageStateEnumEnum state;
    @Label("申请日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate applyDate;
    @Label("交货日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate deliveryDate;
    @Label("生产车间(部门)")
    public Long departmentId;
    @Label("附件")
    public String accessory;
    public String getNum() {
        return num;
    } 

    public void setNum(String num) {
        this.num = num; 
    } 

    public java.time.ZonedDateTime getCreatedTime() {
        return createdTime;
    } 

    public void setCreatedTime(java.time.ZonedDateTime createdTime) {
        this.createdTime = createdTime; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    public java.time.ZonedDateTime getUpdatedTime() {
        return updatedTime;
    } 

    public void setUpdatedTime(java.time.ZonedDateTime updatedTime) {
        this.updatedTime = updatedTime; 
    } 

    public String getUpdatedBy() {
        return updatedBy;
    } 

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy; 
    } 

    public String getUserId() {
        return userId;
    } 

    public void setUserId(String userId) {
        this.userId = userId; 
    } 

    public String getSourceCode() {
        return sourceCode;
    } 

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode; 
    } 

    public String getDesc() {
        return desc;
    } 

    public void setDesc(String desc) {
        this.desc = desc; 
    } 

    public ProductInStorageStateEnumEnum getState() {
        return state;
    } 

    public void setState(ProductInStorageStateEnumEnum state) {
        this.state = state; 
    } 

    public java.time.LocalDate getApplyDate() {
        return applyDate;
    } 

    public void setApplyDate(java.time.LocalDate applyDate) {
        this.applyDate = applyDate; 
    } 

    public java.time.LocalDate getDeliveryDate() {
        return deliveryDate;
    } 

    public void setDeliveryDate(java.time.LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate; 
    } 

    public Long getDepartmentId() {
        return departmentId;
    } 

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId; 
    } 

    public String getAccessory() {
        return accessory;
    } 

    public void setAccessory(String accessory) {
        this.accessory = accessory; 
    } 


}
