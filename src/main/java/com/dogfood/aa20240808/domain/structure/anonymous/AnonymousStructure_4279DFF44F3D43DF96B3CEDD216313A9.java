package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_4279DFF44F3D43DF96B3CEDD216313A9 {

    public ProductReturnStorageEntity productReturnStorage;
    public ProductReturnStorageEntity getProductReturnStorage() {
        return productReturnStorage;
    } 

    public void setProductReturnStorage(ProductReturnStorageEntity productReturnStorage) {
        this.productReturnStorage = productReturnStorage; 
    } 


}
