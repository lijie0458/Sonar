package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ReceivingDetailsStructureStructure {

    public MaterialDetailsEntity material;
    @Label("单位名称")
    public String unitName;
    public ReceivingDetailsEntity receivingDetails;
    @Label("累计收货数量")
    public Long total;
    public PurchaseOrderDetailEntity purchaseOrderDetails;
    public ReceivingNotificationsEntity receivingNotifications;
    @Label("累计入库数量")
    public Long cumulativeStorage = 0L;
    public MaterialDetailsEntity getMaterial() {
        return material;
    } 

    public void setMaterial(MaterialDetailsEntity material) {
        this.material = material; 
    } 

    public String getUnitName() {
        return unitName;
    } 

    public void setUnitName(String unitName) {
        this.unitName = unitName; 
    } 

    public ReceivingDetailsEntity getReceivingDetails() {
        return receivingDetails;
    } 

    public void setReceivingDetails(ReceivingDetailsEntity receivingDetails) {
        this.receivingDetails = receivingDetails; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 

    public PurchaseOrderDetailEntity getPurchaseOrderDetails() {
        return purchaseOrderDetails;
    } 

    public void setPurchaseOrderDetails(PurchaseOrderDetailEntity purchaseOrderDetails) {
        this.purchaseOrderDetails = purchaseOrderDetails; 
    } 

    public ReceivingNotificationsEntity getReceivingNotifications() {
        return receivingNotifications;
    } 

    public void setReceivingNotifications(ReceivingNotificationsEntity receivingNotifications) {
        this.receivingNotifications = receivingNotifications; 
    } 

    public Long getCumulativeStorage() {
        return cumulativeStorage;
    } 

    public void setCumulativeStorage(Long cumulativeStorage) {
        this.cumulativeStorage = cumulativeStorage; 
    } 


}
