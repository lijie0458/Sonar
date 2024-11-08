package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.LocalDate; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ReceivingNotificationsEntity {

    @Label("收货单号")
    @NotNull
    public String notificationId;

    @Label("收货日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate notificationDate;

    @Label("收货员")
    public String notificationSender;

    @Label("订单号")
    public String orderNumber;

    @Label("供应商")
    public String supplierName;

    @Label("说明")
    public String description;

    @Label("附件")
    public String annex;

    public String getNotificationId() {
        return notificationId;
    } 

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId; 
    } 

    public LocalDate getNotificationDate() {
        return notificationDate;
    } 

    public void setNotificationDate(LocalDate notificationDate) {
        this.notificationDate = notificationDate; 
    } 

    public String getNotificationSender() {
        return notificationSender;
    } 

    public void setNotificationSender(String notificationSender) {
        this.notificationSender = notificationSender; 
    } 

    public String getOrderNumber() {
        return orderNumber;
    } 

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber; 
    } 

    public String getSupplierName() {
        return supplierName;
    } 

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName; 
    } 

    public String getDescription() {
        return description;
    } 

    public void setDescription(String description) {
        this.description = description; 
    } 

    public String getAnnex() {
        return annex;
    } 

    public void setAnnex(String annex) {
        this.annex = annex; 
    } 

}
