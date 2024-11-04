package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_380F2457BC27DB7CA6D436A5E1BA6EAA {

    public PurchaseOrderDetailEntity purchaseOrderDetail;
    public PurchaseOrderDetailEntity getPurchaseOrderDetail() {
        return purchaseOrderDetail;
    } 

    public void setPurchaseOrderDetail(PurchaseOrderDetailEntity purchaseOrderDetail) {
        this.purchaseOrderDetail = purchaseOrderDetail; 
    } 


}
