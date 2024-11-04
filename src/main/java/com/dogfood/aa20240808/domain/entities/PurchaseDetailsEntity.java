package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.dogfood.aa20240808.domain.enumeration.OrderStatusEnumEnum; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class PurchaseDetailsEntity {

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
    @Label("申请数量")
    @javax.validation.constraints.NotNull
    public BigDecimal request_quantity;
    @Label("期望到货日期")
    @javax.validation.constraints.NotNull
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate expected_delivery_date;
    @Label("关联申请单号")
    public String related_request_number;
    @Label("物料编码")
    public String material_code;
    @Label("已下推数量")
    public BigDecimal down_quantity = new BigDecimal("0");
    @Label("本次下推数量")
    public BigDecimal this_quantity;
    @Label("下单状态")
    public OrderStatusEnumEnum orderStatus = OrderStatusEnumEnum.FIELD_2;
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

    public BigDecimal getRequest_quantity() {
        return request_quantity;
    } 

    public void setRequest_quantity(BigDecimal request_quantity) {
        this.request_quantity = request_quantity; 
    } 

    public java.time.LocalDate getExpected_delivery_date() {
        return expected_delivery_date;
    } 

    public void setExpected_delivery_date(java.time.LocalDate expected_delivery_date) {
        this.expected_delivery_date = expected_delivery_date; 
    } 

    public String getRelated_request_number() {
        return related_request_number;
    } 

    public void setRelated_request_number(String related_request_number) {
        this.related_request_number = related_request_number; 
    } 

    public String getMaterial_code() {
        return material_code;
    } 

    public void setMaterial_code(String material_code) {
        this.material_code = material_code; 
    } 

    public BigDecimal getDown_quantity() {
        return down_quantity;
    } 

    public void setDown_quantity(BigDecimal down_quantity) {
        this.down_quantity = down_quantity; 
    } 

    public BigDecimal getThis_quantity() {
        return this_quantity;
    } 

    public void setThis_quantity(BigDecimal this_quantity) {
        this.this_quantity = this_quantity; 
    } 

    public OrderStatusEnumEnum getOrderStatus() {
        return orderStatus;
    } 

    public void setOrderStatus(OrderStatusEnumEnum orderStatus) {
        this.orderStatus = orderStatus; 
    } 


}
