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
public class BePutInStorageEntity {

    @Label("入库订单号")
    @NotNull
    public String bePutInStorageId;

    @Label("入库日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate bePutInStorageDate;

    @Label("收货订单号")
    public String orderNumber;

    @Label("供应商")
    public String supplierName;

    @Label("说明")
    public String description;

    @Label("附件")
    public String annex;

    @Label("仓库")
    public Long warehouse;

    @Label("创建者")
    public String createdBy;

    public String getBePutInStorageId() {
        return bePutInStorageId;
    } 

    public void setBePutInStorageId(String bePutInStorageId) {
        this.bePutInStorageId = bePutInStorageId; 
    } 

    public LocalDate getBePutInStorageDate() {
        return bePutInStorageDate;
    } 

    public void setBePutInStorageDate(LocalDate bePutInStorageDate) {
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
