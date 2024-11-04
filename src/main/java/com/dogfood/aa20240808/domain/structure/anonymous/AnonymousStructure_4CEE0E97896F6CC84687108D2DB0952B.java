package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_4CEE0E97896F6CC84687108D2DB0952B {

    public String bePutInStorageId;
    public java.time.LocalDate bePutInStorageDate;
    public String orderNumber;
    public String supplierName;
    public String description;
    public String annex;
    public Long warehouse;
    public String createdBy;
    public String getBePutInStorageId() {
        return bePutInStorageId;
    } 

    public void setBePutInStorageId(String bePutInStorageId) {
        this.bePutInStorageId = bePutInStorageId; 
    } 

    public java.time.LocalDate getBePutInStorageDate() {
        return bePutInStorageDate;
    } 

    public void setBePutInStorageDate(java.time.LocalDate bePutInStorageDate) {
        this.bePutInStorageDate = bePutInStorageDate; 
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

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 


}
