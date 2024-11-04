package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_12F96C5D8E74852BD6835250199AD981 {

    public ProductReturnStorageDetailsEntity productReturnStorageDetails;
    public ProductInStorageDetailsEntity productInStorageDetails;
    public InventoryEntity inventory;
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

    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
    } 


}
