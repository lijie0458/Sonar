package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_28604C516ACE1CD3B943BE221F7C9EA7 {

    public ProductReturnStorageDetailsEntity productReturnStorageDetails;
    public ProductReturnStorageDetailsEntity getProductReturnStorageDetails() {
        return productReturnStorageDetails;
    } 

    public void setProductReturnStorageDetails(ProductReturnStorageDetailsEntity productReturnStorageDetails) {
        this.productReturnStorageDetails = productReturnStorageDetails; 
    } 


}
