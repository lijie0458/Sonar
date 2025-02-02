package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.dogfood.aa20240808.domain.enumeration.OutsourceReturnStorageStateEnumEnum; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OutsourceReturnStorageEntity {

    @Label("委外加工入库退回单号")
    @javax.validation.constraints.NotNull
    public String returnCode;
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
    @Label("状态")
    public OutsourceReturnStorageStateEnumEnum state;
    @Label("委外加工入库单号")
    public String outsourceInSCode;
    public String getReturnCode() {
        return returnCode;
    } 

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode; 
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

    public OutsourceReturnStorageStateEnumEnum getState() {
        return state;
    } 

    public void setState(OutsourceReturnStorageStateEnumEnum state) {
        this.state = state; 
    } 

    public String getOutsourceInSCode() {
        return outsourceInSCode;
    } 

    public void setOutsourceInSCode(String outsourceInSCode) {
        this.outsourceInSCode = outsourceInSCode; 
    } 


}
