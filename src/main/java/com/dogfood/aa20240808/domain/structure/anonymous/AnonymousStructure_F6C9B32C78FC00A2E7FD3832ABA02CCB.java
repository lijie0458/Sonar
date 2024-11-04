package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_F6C9B32C78FC00A2E7FD3832ABA02CCB {

    public String notificationId;
    public java.time.LocalDate notificationDate;
    public String notificationSender;
    public String orderNumber;
    public String supplierName;
    public String description;
    public String annex;
    public String getNotificationId() {
        return notificationId;
    } 

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId; 
    } 

    public java.time.LocalDate getNotificationDate() {
        return notificationDate;
    } 

    public void setNotificationDate(java.time.LocalDate notificationDate) {
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
