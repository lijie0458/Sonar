package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_1E1FD0FBFFD3C2705E03B08CB22F80C5 {

    public PurchaseDetailsEntity purchaseDetails;
    public PurchaseOrderDetailEntity purchaseOrderDetail;
    public PurchaseDetailsEntity getPurchaseDetails() {
        return purchaseDetails;
    } 

    public void setPurchaseDetails(PurchaseDetailsEntity purchaseDetails) {
        this.purchaseDetails = purchaseDetails; 
    } 

    public PurchaseOrderDetailEntity getPurchaseOrderDetail() {
        return purchaseOrderDetail;
    } 

    public void setPurchaseOrderDetail(PurchaseOrderDetailEntity purchaseOrderDetail) {
        this.purchaseOrderDetail = purchaseOrderDetail; 
    } 


}
