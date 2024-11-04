package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_AA0E468AE7191E1C9D02F3EB3B53D972 {

    public PurchaseDetailsEntity purchaseDetails;
    public PurchaseDetailsEntity getPurchaseDetails() {
        return purchaseDetails;
    } 

    public void setPurchaseDetails(PurchaseDetailsEntity purchaseDetails) {
        this.purchaseDetails = purchaseDetails; 
    } 


}
