package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_6122FFF7EE63A7C8A589CA1BA02FF87D {

    public ProductInStorageEntity productInStorage;
    public ProductInStorageDetailsEntity productInStorageDetails;
    public MaterialDetailsEntity materialDetails;
    public ProductInStorageEntity getProductInStorage() {
        return productInStorage;
    } 

    public void setProductInStorage(ProductInStorageEntity productInStorage) {
        this.productInStorage = productInStorage; 
    } 

    public ProductInStorageDetailsEntity getProductInStorageDetails() {
        return productInStorageDetails;
    } 

    public void setProductInStorageDetails(ProductInStorageDetailsEntity productInStorageDetails) {
        this.productInStorageDetails = productInStorageDetails; 
    } 

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 


}
