package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class PurchaseOrderDetailEntity {

    @javax.validation.constraints.NotNull
    public Long id;
    @Label("物料编号")
    public String material_code;
    @Label("订单数量")
    public BigDecimal orderQuantity;
    @Label("单价（含税）")
    public BigDecimal priceIncludingTax;
    @Label("税率")
    public BigDecimal taxRate;
    @Label("关联订单号")
    public String relatedOrderNumber;
    public Long purchaseDetailsId;
    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getMaterial_code() {
        return material_code;
    } 

    public void setMaterial_code(String material_code) {
        this.material_code = material_code; 
    } 

    public BigDecimal getOrderQuantity() {
        return orderQuantity;
    } 

    public void setOrderQuantity(BigDecimal orderQuantity) {
        this.orderQuantity = orderQuantity; 
    } 

    public BigDecimal getPriceIncludingTax() {
        return priceIncludingTax;
    } 

    public void setPriceIncludingTax(BigDecimal priceIncludingTax) {
        this.priceIncludingTax = priceIncludingTax; 
    } 

    public BigDecimal getTaxRate() {
        return taxRate;
    } 

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate; 
    } 

    public String getRelatedOrderNumber() {
        return relatedOrderNumber;
    } 

    public void setRelatedOrderNumber(String relatedOrderNumber) {
        this.relatedOrderNumber = relatedOrderNumber; 
    } 

    public Long getPurchaseDetailsId() {
        return purchaseDetailsId;
    } 

    public void setPurchaseDetailsId(Long purchaseDetailsId) {
        this.purchaseDetailsId = purchaseDetailsId; 
    } 


}
