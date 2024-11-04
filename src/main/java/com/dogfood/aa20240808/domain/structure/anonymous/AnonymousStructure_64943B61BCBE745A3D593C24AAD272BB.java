package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_64943B61BCBE745A3D593C24AAD272BB {

    public String goodsReturnedNote;
    public java.time.LocalDate goodsReturnedNoteDate;
    public String bePutInStorage;
    public String supplierName;
    public String description;
    public String annex;
    public Long warehouse;
    public ApprovalStatusEnumEnum status;
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
