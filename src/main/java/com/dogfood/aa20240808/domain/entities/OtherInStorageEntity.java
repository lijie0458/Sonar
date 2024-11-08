package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.LocalDate; 
import java.time.ZonedDateTime; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.dogfood.aa20240808.domain.enumeration.OtherInStorageStateEnumEnum; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OtherInStorageEntity {

    @Label("其他入库单号")
    @NotNull
    public String code;

    @Label("创建时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime createdTime;

    @Label("创建者")
    public String createdBy;

    @Label("更新时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime updatedTime;

    @Label("更新者")
    public String updatedBy;

    @Label("保管员")
    public String userId;

    @Label("源单单号")
    public String sourceCode;

    @Label("摘要")
    public String desc;

    @Label("审批状态")
    public OtherInStorageStateEnumEnum state;

    @Label("申请日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate applyDate;

    @Label("交货日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate deliveryDate;

    @Label("单位(一期暂时为空)")
    public String unit;

    @Label("附件")
    public String accessory;

    public String getCode() {
        return code;
    } 

    public void setCode(String code) {
        this.code = code; 
    } 

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    } 

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    public ZonedDateTime getUpdatedTime() {
        return updatedTime;
    } 

    public void setUpdatedTime(ZonedDateTime updatedTime) {
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

    public OtherInStorageStateEnumEnum getState() {
        return state;
    } 

    public void setState(OtherInStorageStateEnumEnum state) {
        this.state = state; 
    } 

    public LocalDate getApplyDate() {
        return applyDate;
    } 

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate; 
    } 

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    } 

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate; 
    } 

    public String getUnit() {
        return unit;
    } 

    public void setUnit(String unit) {
        this.unit = unit; 
    } 

    public String getAccessory() {
        return accessory;
    } 

    public void setAccessory(String accessory) {
        this.accessory = accessory; 
    } 

}
