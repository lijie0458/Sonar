package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_7F3F9816C439A138B8DD4078A49BCBFF {

    public PurchaseRequestEntity purchaseRequest;
    public PurchaseRequestEntity getPurchaseRequest() {
        return purchaseRequest;
    } 

    public void setPurchaseRequest(PurchaseRequestEntity purchaseRequest) {
        this.purchaseRequest = purchaseRequest; 
    } 


}
