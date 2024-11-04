package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B061947A9149609D07E92A50DDC32508 {

    public ProductInStorageEntity productInStorage;
    public ProductInStorageEntity getProductInStorage() {
        return productInStorage;
    } 

    public void setProductInStorage(ProductInStorageEntity productInStorage) {
        this.productInStorage = productInStorage; 
    } 


}
