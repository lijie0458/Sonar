package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_F4686D0EDB15544AA67D0364F6D71209 {

    public ReceivingNotificationsEntity receivingNotifications;
    public ReceivingDetailsEntity receivingDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public PurchaseOrderDetailEntity purchaseOrderDetail;
    public ReceivingNotificationsEntity getReceivingNotifications() {
        return receivingNotifications;
    } 

    public void setReceivingNotifications(ReceivingNotificationsEntity receivingNotifications) {
        this.receivingNotifications = receivingNotifications; 
    } 

    public ReceivingDetailsEntity getReceivingDetails() {
        return receivingDetails;
    } 

    public void setReceivingDetails(ReceivingDetailsEntity receivingDetails) {
        this.receivingDetails = receivingDetails; 
    } 

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 

    public MeasuringUnitEntity getMeasuringUnit() {
        return measuringUnit;
    } 

    public void setMeasuringUnit(MeasuringUnitEntity measuringUnit) {
        this.measuringUnit = measuringUnit; 
    } 

    public PurchaseOrderDetailEntity getPurchaseOrderDetail() {
        return purchaseOrderDetail;
    } 

    public void setPurchaseOrderDetail(PurchaseOrderDetailEntity purchaseOrderDetail) {
        this.purchaseOrderDetail = purchaseOrderDetail; 
    } 


}
