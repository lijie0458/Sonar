package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ReceivingDetailsEntity {

    @Label("id")
    @javax.validation.constraints.NotNull
    public Long id;
    @Label("收货单号")
    public String receiptNumber;
    @Label("本次收货数量")
    public Long receivedQuantity;
    @Label("物料编码")
    public String materialNumber;
    @Label("关联明细Id")
    public Long orderDetailId;
    @Label("应收数量")
    public BigDecimal receivableQuantity;
    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getReceiptNumber() {
        return receiptNumber;
    } 

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber; 
    } 

    public Long getReceivedQuantity() {
        return receivedQuantity;
    } 

    public void setReceivedQuantity(Long receivedQuantity) {
        this.receivedQuantity = receivedQuantity; 
    } 

    public String getMaterialNumber() {
        return materialNumber;
    } 

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber; 
    } 

    public Long getOrderDetailId() {
        return orderDetailId;
    } 

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId; 
    } 

    public BigDecimal getReceivableQuantity() {
        return receivableQuantity;
    } 

    public void setReceivableQuantity(BigDecimal receivableQuantity) {
        this.receivableQuantity = receivableQuantity; 
    } 


}
