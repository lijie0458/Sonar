package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4 {

    public ProductReturnStorageDetailsEntity productReturnStorageDetails;
    public ProductInStorageDetailsEntity productInStorageDetails;
    public ProductReturnStorageDetailsEntity getProductReturnStorageDetails() {
        return productReturnStorageDetails;
    } 

    public void setProductReturnStorageDetails(ProductReturnStorageDetailsEntity productReturnStorageDetails) {
        this.productReturnStorageDetails = productReturnStorageDetails; 
    } 

    public ProductInStorageDetailsEntity getProductInStorageDetails() {
        return productInStorageDetails;
    } 

    public void setProductInStorageDetails(ProductInStorageDetailsEntity productInStorageDetails) {
        this.productInStorageDetails = productInStorageDetails; 
    } 


}
