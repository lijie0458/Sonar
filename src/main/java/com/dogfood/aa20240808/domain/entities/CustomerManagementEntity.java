package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class CustomerManagementEntity {

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
    @Label("客户编码")
    public String customerCode;
    @Label("客户名称")
    public String customerName;
    @Label("联系人")
    public String linkMan;
    @Label("联系电话")
    public String contactNumber;
    @Label("联系地址")
    public String address;
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

    public String getCustomerCode() {
        return customerCode;
    } 

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode; 
    } 

    public String getCustomerName() {
        return customerName;
    } 

    public void setCustomerName(String customerName) {
        this.customerName = customerName; 
    } 

    public String getLinkMan() {
        return linkMan;
    } 

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan; 
    } 

    public String getContactNumber() {
        return contactNumber;
    } 

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber; 
    } 

    public String getAddress() {
        return address;
    } 

    public void setAddress(String address) {
        this.address = address; 
    } 

    public String getDetailedAddress() {
        return detailedAddress;
    } 

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress; 
    } 


}
