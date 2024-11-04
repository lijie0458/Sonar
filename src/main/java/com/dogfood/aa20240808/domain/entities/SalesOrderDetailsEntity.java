package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SalesOrderDetailsEntity {

    @javax.validation.constraints.NotNull
    public Long id;
    @Label("物料编号")
    public String materialCode;
    @Label("数量")
    public BigDecimal quantity;
    @Label("单价")
    public BigDecimal unitPrice;
    @Label("交货日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate deliveryDate;
    @Label("备注")
    public String notes;
    @Label("关联销售订单/发货通知单/出库单")
    public String salesOrderNumber;
    @Label("发货仓库/退回仓库")
    public Long warehouse;
    @Label("发货数量")
    public BigDecimal quantityShipped;
    @Label("关联销售单明细/出库单明细")
    public Long salesOrderDetailsId;
    @Label("批号id（发货通知使用）/退回批号")
    public Long batchNumber;
    @Label("实际出库数量")
    public BigDecimal outboundQuantity;
    @Label("退货数量")
    public BigDecimal returnQuanTity;
    @Label("未入库数量")
    public BigDecimal availableQuantity;
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

    public java.time.LocalDate getDeliveryDate() {
        return deliveryDate;
    } 

    public void setDeliveryDate(java.time.LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate; 
    } 

    public String getNotes() {
        return notes;
    } 

    public void setNotes(String notes) {
        this.notes = notes; 
    } 

    public String getSalesOrderNumber() {
        return salesOrderNumber;
    } 

    public void setSalesOrderNumber(String salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 

    public BigDecimal getQuantityShipped() {
        return quantityShipped;
    } 

    public void setQuantityShipped(BigDecimal quantityShipped) {
        this.quantityShipped = quantityShipped; 
    } 

    public Long getSalesOrderDetailsId() {
        return salesOrderDetailsId;
    } 

    public void setSalesOrderDetailsId(Long salesOrderDetailsId) {
        this.salesOrderDetailsId = salesOrderDetailsId; 
    } 

    public Long getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public BigDecimal getOutboundQuantity() {
        return outboundQuantity;
    } 

    public void setOutboundQuantity(BigDecimal outboundQuantity) {
        this.outboundQuantity = outboundQuantity; 
    } 

    public BigDecimal getReturnQuanTity() {
        return returnQuanTity;
    } 

    public void setReturnQuanTity(BigDecimal returnQuanTity) {
        this.returnQuanTity = returnQuanTity; 
    } 

    public BigDecimal getAvailableQuantity() {
        return availableQuantity;
    } 

    public void setAvailableQuantity(BigDecimal availableQuantity) {
        this.availableQuantity = availableQuantity; 
    } 


}
