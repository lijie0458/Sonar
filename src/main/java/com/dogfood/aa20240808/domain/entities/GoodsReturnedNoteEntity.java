package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GoodsReturnedNoteEntity {

    @Label("退货单订单号")
    @javax.validation.constraints.NotNull
    public String goodsReturnedNote;
    @Label("退货日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate goodsReturnedNoteDate;
    @Label("入库订单号")
    public String bePutInStorage;
    @Label("供应商")
    public String supplierName;
    @Label("说明")
    public String description;
    @Label("附件")
    public String annex;
    @Label("仓库")
    public Long warehouse;
    @Label("状态")
    public ApprovalStatusEnumEnum status;
    @Label("创建者")
    public String createdBy;
    public String getGoodsReturnedNote() {
        return goodsReturnedNote;
    } 

    public void setGoodsReturnedNote(String goodsReturnedNote) {
        this.goodsReturnedNote = goodsReturnedNote; 
    } 

    public java.time.LocalDate getGoodsReturnedNoteDate() {
        return goodsReturnedNoteDate;
    } 

    public void setGoodsReturnedNoteDate(java.time.LocalDate goodsReturnedNoteDate) {
        this.goodsReturnedNoteDate = goodsReturnedNoteDate; 
    } 

    public String getBePutInStorage() {
        return bePutInStorage;
    } 

    public void setBePutInStorage(String bePutInStorage) {
        this.bePutInStorage = bePutInStorage; 
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

    public ApprovalStatusEnumEnum getStatus() {
        return status;
    } 

    public void setStatus(ApprovalStatusEnumEnum status) {
        this.status = status; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 


}
