package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductionMaterialRequisitionDetailsEntity {

    @javax.validation.constraints.NotNull
    public Long id;
    @Label("物料编码")
    public String materialCode;
    @Label("数量")
    public BigDecimal quantity;
    @Label("单价")
    public BigDecimal unitPrice;
    @Label("备注")
    public String notes;
    @Label("关联单号")
    public String productionMaterialRequisition;
    @Label("发货仓库/退回仓库")
    public Long warehouse;
    @Label("退货关联明细id")
    public Long productionMaterialRequisitionId;
    @Label("领取批号id/退回批号")
    public Long batchNumber;
    @Label("总金额")
    public BigDecimal totalPrice;
    @Label("一期不使用")
    public String sourceNumber;
    @Label("库位")
    public String storageLocation;
    @Label("退货数量")
    public BigDecimal returnQuanTity;
    @Label("关联领料单明细")
    public Long sourceNumberId;
    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 

    public BigDecimal getQuantity() {
        return quantity;
    } 

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity; 
    } 

    public BigDecimal getUnitPrice() {
        return unitPrice;
    } 

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice; 
    } 

    public String getNotes() {
        return notes;
    } 

    public void setNotes(String notes) {
        this.notes = notes; 
    } 

    public String getProductionMaterialRequisition() {
        return productionMaterialRequisition;
    } 

    public void setProductionMaterialRequisition(String productionMaterialRequisition) {
        this.productionMaterialRequisition = productionMaterialRequisition; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 

    public Long getProductionMaterialRequisitionId() {
        return productionMaterialRequisitionId;
    } 

    public void setProductionMaterialRequisitionId(Long productionMaterialRequisitionId) {
        this.productionMaterialRequisitionId = productionMaterialRequisitionId; 
    } 

    public Long getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public BigDecimal getTotalPrice() {
        return totalPrice;
    } 

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice; 
    } 

    public String getSourceNumber() {
        return sourceNumber;
    } 

    public void setSourceNumber(String sourceNumber) {
        this.sourceNumber = sourceNumber; 
    } 

    public String getStorageLocation() {
        return storageLocation;
    } 

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation; 
    } 

    public BigDecimal getReturnQuanTity() {
        return returnQuanTity;
    } 

    public void setReturnQuanTity(BigDecimal returnQuanTity) {
        this.returnQuanTity = returnQuanTity; 
    } 

    public Long getSourceNumberId() {
        return sourceNumberId;
    } 

    public void setSourceNumberId(Long sourceNumberId) {
        this.sourceNumberId = sourceNumberId; 
    } 


}
